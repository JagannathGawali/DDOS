<%@page import="java.net.InetAddress"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.AES.AESencrp"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.Select"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.util.DatabaseConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.dao.DB"%>
<%@page import="com.model.Account"%>
    <%@page import="java.util.ArrayList"%>
 <%@ page import="java.util.*" %>
 <%@ page import="java.text.*" %>  
     <%
 DB db = new DB();
    

		
		int uid=0;
		String struid="";
		DatabaseConnection dbc;
		String str="URL Injection";	
		String ipaddress="";
				try
				{
				if(session.getAttribute("uid")==null)
				{
				System.out.print("session null");				
				dbc=new DatabaseConnection(); 
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //This is for Current Date and Time.
				Calendar calobj = Calendar.getInstance();
				String dt=dateFormat.format(calobj.getTime());		
				//ip=request.getRemoteAddr();
				System.out.println(dt);
				//ipaddress=InetAddress.getLocalHost().getHostAddress();//Find the IPAddress for Current PC/Laptop etc
				
					HttpServletRequest requestHttp = (HttpServletRequest) request;
							 
							String urlString = requestHttp.getRequestURL().toString();
					// get IP Address of client from request
							if(urlString.contains("localhost"))
								ipaddress = request.getLocalAddr();
							
							else
								ipaddress = request.getRemoteAddr();
					
					
				System.out.println("IP Addresss:"+ipaddress);
				int a=dbc.updateQuery(" insert into ebank.admin(logs,time,ipaddress) values('"+str+"','"+dt+"','"+ipaddress+"')");			
				session.invalidate(); //Invalidating the session for URL Injection.				
					%>
					 <jsp:forward page="Login.jsp?msg=URL Injection"></jsp:forward> --%>				
					<%
			}
			else
				{			    
					uid = Integer.parseInt(session.getAttribute("uid").toString());		
					System.out.println(uid);
				}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Net Banking</title>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<!-- stylesheets -->
		<link rel="stylesheet" type="text/css" href="resources\css\reset.css">
		<link rel="stylesheet" type="text/css" href="resources\css\style.css" media="screen">
		<link id="color" rel="stylesheet" type="text/css" href="resources\css\colors\blue.css">
		<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
		<!-- scripts (jquery) -->
		<script src="resources\scripts\jquery-1.6.4.min.js" type="text/javascript"></script>
		<!--[if IE]><script language="javascript" type="text/javascript" src="resources/scripts/excanvas.min.js"></script><![endif]-->
		<script src="resources\scripts\jquery-ui-1.8.16.custom.min.js" type="text/javascript"></script>
		<script src="resources\scripts\jquery.ui.selectmenu.js" type="text/javascript"></script>
		<script src="resources\scripts\jquery.flot.min.js" type="text/javascript"></script>
		<script src="resources\scripts\tiny_mce\tiny_mce.js" type="text/javascript"></script>
		<script src="resources\scripts\tiny_mce\jquery.tinymce.js" type="text/javascript"></script>
		<!-- scripts (custom) -->
		<script src="resources\scripts\smooth.js" type="text/javascript"></script>
		<script src="resources\scripts\smooth.menu.js" type="text/javascript"></script>
		<script src="resources\scripts\smooth.chart.js" type="text/javascript"></script>
		<script src="resources\scripts\smooth.table.js" type="text/javascript"></script>
		<script src="resources\scripts\smooth.form.js" type="text/javascript"></script>
		<script src="resources\scripts\smooth.dialog.js" type="text/javascript"></script>
		<script src="resources\scripts\smooth.autocomplete.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function () {
				style_path = "resources/css/colors";

				$("#date-picker").datepicker();

				$("#box-tabs, #box-left-tabs").tabs();
			});
		</script>
	</head>
	<body>
		
		<!-- end dialogs -->
		<!-- header -->
		<div id="header">
			<!-- logo -->
			<div id="logo">
				<h1><a href="" title="Net Banking">Net Banking</a></h1>
			</div>
			
			<!-- end logo -->
			<!-- user -->
			<ul id="user">
			<li><div>
			 <%
			DatabaseConnection db1=new DatabaseConnection();
			int a= Integer.parseInt(session.getAttribute("uid").toString());
			ResultSet rs=db1.selectQuery("select username,password from user where uid="+a+"");
			String uname=null;
			String pass=null;
			
			
			try{
			if(rs.next())
			{
				// This id for showing the username and password in "*" format on home page
				uname=rs.getString("username");
				pass=rs.getString("password");
				uname=AESencrp.decrypt(uname);
				pass=AESencrp.decrypt(pass);
				int len1=uname.length();
				int len2=pass.length();
				String s1=uname.substring(0,len1/2);
				String s2=uname.substring(len1/2,len1).trim();
				String s3=pass.substring(0,len2/2);
				String s4=pass.substring(len2/2,len2);
				for(int i=0;i<s1.length();i++)
				{
					out.println("*");
				}
				for(int i=0;i<s2.length();i++)
				{
					out.println(s2.charAt(i));
				}
				out.println("<br>");
				out.println("<br>");
				for(int i=0;i<s3.length();i++)
				{
					out.println(s3.charAt(i));
				}
				for(int i=0;i<s4.length();i++)
				{
					out.println("*");
				}
				
			}
			
			
     }
		catch(Exception e)
		{
				
				e.printStackTrace();
		}
		finally
		{
 		
			try 
			{
			   if(rs!=null)
			   {
				rs.close();
				DatabaseConnection.closeConnection();
			   }
			} 
			catch(Exception e)
			{
					
					e.printStackTrace();
			}
		}
			%>
			<%
			//AESencrp.decrypt(uname)%> 
			</div></li>
				<!--  <li class="first"><a href="">Account</a></li> -->
				<li><i class="fa fa-sign-out fa-2x"></i><a href="LogoutUser">Logout</a>&nbsp;</li>
			</ul>
			<br>
			<br>
			<br>			
			</ul> 
			<!-- end user -->
			<div id="header-inner">
				<div id="home">
					<a href="" title="Home"></a>
				</div>
				<!-- quick -->
				<ul id="quick">
					<li>
						<a href="#" title="Products"><span class="normal">Home</span></a>
					</li>
					
					<li>
						<a href="ContactUs.jsp" title="Products"><span>Contact Us</span></a>
					</li>
					<li>
						<a href="" title="Events"><span>Accounts</span></a>
						<ul>
						
					 <li><a href="AccountDetails.jsp?uid=<%=session.getAttribute("uid")%>">Account Details</a></li> 
					<%--  <li><a href="AccountDetails.jsp?uid=<%=AESencrp.encrypt(session.getAttribute("uid").toString())%>">Account Details</a></li> --%>
					<li><a href="MiniStatement.jsp">Mini Statements</a></li>
							
						</ul>
					</li>
					<li>
						<a href="" title="Pages"><span>Transaction</span></a>
						<ul>							
							<li><a href="FundTransfer.jsp">Transfer Money</a></li>
							<li><a href="BillPayment.jsp">Bill Payments</a></li>
						</ul>
					</li>
					
					<li>
						<a href="" title="Settings"><span>Account Settings</span></a>
						<ul>
							<li><a href="UpdateProfile.jsp">Update Your Profile</a></li>
							
						</ul>
					</li>
				</ul>
				<!-- end quick -->
				<div class="corner tl"></div>
				<div class="corner tr"></div>
			</div>
		</div>
		<!-- end header -->
		<!-- content -->
		<div id="content">
			<!-- end content / left -->
			<div id="left">
				 
				<div>
			<img src="resources/images/bank.jpg" style="width: 220px;height: 665px; margin-left:60px">
			</div>
				<div id="date-picker"></div>
			</div>
			<!-- end content / left -->
			<!-- content / right -->
			<div id="right">
				<!-- table -->
				<div class="box">
					 
							<div class="container">
							<p><strong><h3>Internet Banking</h3></strong><p>
							<p>Now monitor, transact and control your bank account online with our net banking service. You can do multiple things from the comforts of your home or office through ABC Bank Net Banking your one stop solution for all your banking needs. Get all your account details, submit requests and undertake a wide range of transactions online through our ABC Bank Net Banking services. Our E-Banking service makes banking a lot more easy and effective.</p>
							<h4>Features</h4>
							<ul>
							<li>
								<strong class="mystrong">*Account Details:</strong><br>
								<p style="margin-left:100px;">View your bank account details, account balance, download statements and more. Also view your Credit Card Account Details all in one place.</p>
							</li>
								<br>
							<li>
								<strong  class="mystrong">*Fund Transfer:</strong><br>
								<p style="margin-left:100px;">Transfer fund to your own accounts, other ABC Bank accounts or Other Bank account seamlessly.</p>
							</li>	
								<br>
							<li>
								<strong class="mystrong">*Bill Payments:&nbsp;</strong><br>
								<p style="margin-left:100px;">Pay Utility bills for more than 160 billers, Recharge Mobile, Create Virtual Cards, Pay any Visa Credit Card bills.</p>
								</li>
									<br>
							<li>
							<strong class="mystrong">*Mini Statements:&nbsp;</strong><br>
							<p style="margin-left:100px;">User can see mini statements by entering their Account Number.</p>
							</li>
								<br>
							<li>
							<strong class="mystrong">*Net Secure:&nbsp;</strong><br>
							<p style="margin-left:100px;"> Our Internet Banking Security System
											We at ABC bank follow best in class online security practices in order to safeguard your information while you are banking online. 
											It’s our constant endeavour to prevent fraud and make your ebanking transactions completely safe.</p>
							</li>
							</ul>
							</div>						
						</form>
					</div>
				</div>		
				<!-- end box / right -->
			</div>
			<!-- end content / right -->
		</div>
		<!-- end content -->
		<!-- footer -->
		<div id="footer">
			<p>Copyright &copy; 2000-2010 Your Company. All Rights Reserved.</p>
		</div>
		<!-- end footert -->
	
	</body>
</html>
</body>
</html>