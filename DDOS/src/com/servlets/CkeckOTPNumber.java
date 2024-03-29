package com.servlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.AES.AESencrp;
import com.sendMail.SendMailBySite;
import com.util.DatabaseConnection;

/**
 * This Servlet class is use to check OTP and to send password on users mailid. 
 * @author Renuka Gore
 *
 */
@WebServlet("/CkeckOTPNumber")
public class CkeckOTPNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CkeckOTPNumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
				String email=request.getParameter("email"); 		//Accessing the OTP and email entered from user.
				String autono=request.getParameter("no");
				
				DatabaseConnection db=new DatabaseConnection();
				ResultSet rs=db.selectQuery("select * from user where email='"+AESencrp.encrypt(email)+"' and securityno='"+autono+"'");
				String msg ="";
		
		try {
			if(rs.next())	//This is for sending password on users mailid.
			{
				msg = "Correct otp";
				String username=AESencrp.decrypt(rs.getString("username"));			
				System.out.println("Username:"+username);
				
				String pin=AESencrp.decrypt(rs.getString("pin"));
				System.out.println("Pin:"+pin);
				
				String password=AESencrp.decrypt(rs.getString("password"));
				System.out.println("Password:"+password);
				
				String msg1="User Name :: "+username+" ,Password :: "+password+" , And Pin :: "+pin;
				String result=SendMailBySite.sendMail(username, msg1);
				
		        System.out.println("Result in checkotpnumber : "+result);
		        try 
		        {
		        	try 
		        	{
						request.getRequestDispatcher("Login.jsp?msg=check your Email,we have sent your password to you").forward(request, response);
					} catch (ServletException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
		        catch (IOException e)
		        {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				msg = "Incorrect otp ";		
				try
				{
					request.getRequestDispatcher("OTPNumber.jsp?msg="+msg).forward(request, response);
				} catch (ServletException  e)
				{
					// TODO Auto-generated catch bloc|
					e.printStackTrace();
				}
			
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(rs!=null)
				{
					rs.close();
					
				}
				
				DatabaseConnection.closeConnection();
			} 
			catch(SQLException e)
			{

				e.printStackTrace();
			}
		}
		
		
	}

}
