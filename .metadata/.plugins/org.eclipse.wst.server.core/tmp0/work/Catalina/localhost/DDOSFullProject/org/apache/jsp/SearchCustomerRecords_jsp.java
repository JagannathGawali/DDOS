/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2018-03-22 08:20:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.AES.AESencrp;
import java.sql.ResultSet;
import com.util.DatabaseConnection;
import com.dao.DB;
import java.util.ArrayList;

public final class SearchCustomerRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.AES.AESencrp");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.dao.DB");
    _jspx_imports_classes.add("com.util.DatabaseConnection");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" ");

    //db db = new db();
   /*  ArrayList<Account> list = db.getData1();  */
    
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Net Banking</title>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">\r\n");
      out.write("\t\t<!-- stylesheets -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources\\css\\reset.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources\\css\\style.css\" media=\"screen\">\r\n");
      out.write("\t\t<link id=\"color\" rel=\"stylesheet\" type=\"text/css\" href=\"resources\\css\\colors\\blue.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<!-- scripts (jquery) -->\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\jquery-1.6.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<!--[if IE]><script language=\"javascript\" type=\"text/javascript\" src=\"resources/scripts/excanvas.min.js\"></script><![endif]-->\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\jquery-ui-1.8.16.custom.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\jquery.ui.selectmenu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\jquery.flot.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\tiny_mce\\tiny_mce.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\tiny_mce\\jquery.tinymce.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<!-- scripts (custom) -->\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.menu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.chart.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.table.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.form.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.dialog.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources\\scripts\\smooth.autocomplete.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\t\tstyle_path = \"resources/css/colors\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#date-picker\").datepicker();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#box-tabs, #box-left-tabs\").tabs();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- end dialogs -->\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<!-- logo -->\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"\" title=\"Net Banking\">Net Banking</a></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end logo -->\r\n");
      out.write("\t\t\t<!-- user -->\r\n");
      out.write("\t\t\t<ul id=\"user\">\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><i class=\"fa fa-sign-out fa-2x\"></i><a href=\"LogoutUser\">Logout</a>&nbsp;</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\t\t\r\n");
      out.write("\t\t\t</ul> \r\n");
      out.write("\t\t\t<!-- end user -->\r\n");
      out.write("\t\t\t<div id=\"header-inner\">\r\n");
      out.write("\t\t\t\t<div id=\"home\">\r\n");
      out.write("\t\t\t\t\t<a href=\"\" title=\"Home\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- quick -->\r\n");
      out.write("\t\t\t\t<ul id=\"quick\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"Admin.jsp\" title=\"Products\"><span class=\"normal\">Home</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"AdminContactUs.jsp\" title=\"Products\"><span>Contact Us</span></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- end quick -->\r\n");
      out.write("\t\t\t\t<div class=\"corner tl\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"corner tr\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end header -->\r\n");
      out.write("\t\t<!-- content -->\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<!-- end content / left -->\r\n");
      out.write("\t\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t<h6 id=\"h-menu-products\" class=\"selected\"><a href=\"Approve.jsp\"><span>Approve/Reject Applicant</span></a></h6>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu-products\" class=\"opened\">\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<h6 id=\"h-menu-pages\"><a href=\"CustomerList.jsp\"><span>Customer List</span></a></h6>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu-pages\" class=\"closed\">\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t<h6 id=\"h-menu-links\"><a href=\"SearchCustomer.jsp\"><span>Search Customer</span></a></h6>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu-links\" class=\"closed\">\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<h6 id=\"h-menu-settings\"><a href=\"SearchAccount.jsp\"><span>Search Account</span></a></h6>\r\n");
      out.write("\t\t\t\t\t<ul id=\"menu-settings\" class=\"closed\">\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"date-picker\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end content / left -->\r\n");
      out.write("\t\t\t<!-- content / right -->\r\n");
      out.write("\t\t\t<div id=\"right\">\r\n");
      out.write("\t\t\t\t<!-- table -->\r\n");
      out.write("\t\t\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t\t\t<!-- box / title -->\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t   <form action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th align=\"center\">Account Number</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th align=\"center\">Customer Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th align=\"center\">Contact Number</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th align=\"center\">Balance</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									DatabaseConnection db1=new DatabaseConnection();
									String fullname=request.getParameter("fullname");
									String name="";
									String accountno="";
									String contact="";
									double balance=0;
									ResultSet rs=(ResultSet)session.getAttribute("searchC");
									//db1.selectQuery("select * from user where accountno='"+accountno+"'");
									if(rs!=null){
										
										try{
									while(rs.next())
									{
										 accountno=rs.getString("accountno");
										 name=AESencrp.decrypt(rs.getString("fullname"));
										 contact=AESencrp.decrypt(rs.getString("contact"));
										 balance=rs.getDouble("balance");
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(accountno);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(contact);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(balance);
      out.write("</td>\r\n");
      out.write(" \t\t\t\t\t\t\t\t</tr>");
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
									}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</table>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- end box / right -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- end content / right -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end content -->\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<p>Copyright &copy; 2000-2010 Your Company. All Rights Reserved.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end footert -->\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
