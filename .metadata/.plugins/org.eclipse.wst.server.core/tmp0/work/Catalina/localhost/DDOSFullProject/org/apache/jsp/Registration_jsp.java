/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2018-03-22 06:46:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>DDOS Prevention in E-Banking</title>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>E-Banking</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/style.css\" media=\"screen\">\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\r\n");
      out.write("  <!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/datepicker.css\">\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\t\tstyle_path = \"resources/css/colors\";\r\n");
      out.write("\t\t\t\t$(\"input.focus\").focus(function () {\r\n");
      out.write("\t\t\t\t\tif (this.value == this.defaultValue) {\r\n");
      out.write("\t\t\t\t\t\tthis.value = \"\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\t\tthis.select();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"input.focus\").blur(function () {\r\n");
      out.write("\t\t\t\t\tif ($.trim(this.value) == \"\") {\r\n");
      out.write("\t\t\t\t\t\tthis.value = (this.defaultValue ? this.defaultValue : \"\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"input:submit, input:reset\").button();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction access(){ \r\n");
      out.write("\t\t\t  ");
 
			  if(request.getAttribute("error")!=null)
			  {
			  String str=request.getAttribute("error").toString();
      out.write("\r\n");
      out.write("\t\t\t  var err=\"");
      out.print(str );
      out.write("\";\r\n");
      out.write("\t\t\t  var s=document.getElementById(\"message-error\");\r\n");
      out.write("\t\t\t   \ts.style.visibility=\"visible\";\r\n");
      out.write("\t\t\t   \tdocument.getElementById(\"text\").innerHTML =err;\r\n");
      out.write("\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("<body onload=\"access()\" style=\"background-image: url('dist/img/4004.jpg');background-repeat: no-repeat;height:108px;\r\n");
      out.write("   \twidth:100%;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("  \tbackground-position: center;\r\n");
      out.write("  \tbackground-attachment: fixed;\">\r\n");
      out.write("  <div class=\"wrapper\">\r\n");
      out.write("  \t <header class=\"main-header\">\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"#\" class=\"logo\" style=\"background-color: brown;\">\r\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("      <span class=\"logo-mini\"><b>A</b>LT</span>\r\n");
      out.write("      <!-- logo for regular state and mobile devices -->\r\n");
      out.write("      <span class=\"logo-lg\"><b>E-Banking</b></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" style=\"background-color: brown;\">\r\n");
      out.write("      <!-- Sidebar toggle button-->\r\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("      </a>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("      <div class=\"row\" style=\"margin-top: 20px;\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <!-- Horizontal Form -->\r\n");
      out.write("           <div class=\"box box-primary\" style=\"margin-left: -170px; border-top:brown; \">\r\n");
      out.write("            <div class=\"box-header with-border\" >\r\n");
      out.write("          <center>    <h3 class=\"box-title\" style=\"color: #367fa9;color: brown;\"><b>Register Here</b></h3></center>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-header -->\r\n");
      out.write("            <!-- form start -->\r\n");
      out.write("            <form role=\"form\" name=\"myForm\" method=\"post\" action=\"RegisterServlet\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label foor=\"exampleInputEmail1\">Full Name</label><span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"fullName\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"fullName\" required pattern=\"[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+\" style=\"float: left;\"  onkeypress=\"return onlyAlphabets(event,this);\" placeholder=\"e.g. aaa bbb ccc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputPassword1\">Father Name</label><span style=\"color: red\">*</span> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"father\" name=\"father\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired pattern=\"[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+\" placeholder=\"e.g. bbb ddd ccc\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Date of Birth</label><span style=\"color: red\">*</span> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"date\" id=\"bdate\" name=\"dob\" class=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputPassword1\">Mobile Number</label><span style=\"color: red\">*</span> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"mobNo\" name=\"contact\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"10\" pattern=\"[789][0-9]{9}\" size=\"40\" onkeypress=\"return isNumberKey(event)\" placeholder=\"10 digits (start with 7/8/9)\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Email ID</label><span style=\"color: red\">*</span> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"email\" id=\"emailId\" name=\"email\" class=\"form-control\" placeholder=\"Valid Email Id\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputPassword1\">Pan Card No</label><span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"panNo\" name=\"pan\" class=\"form-control\" pattern=\"[A-Z]{5}[0-9]{4}[A-Z]{1}\" maxlength=\"10\" placeholder=\"e.g. ABCAD2233D\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">AAdhar Card No</label><span style=\"color: red\">*</span> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"adharNo\" name=\"aadhar\" class=\"form-control\" pattern=\"[0-9]{12}\"  maxlength=\"12\" onkeypress=\"return isNumberKey(event)\" placeholder=\"12 Digits Aadhar Number\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputPassword1\">Country</label><span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"country\" name=\"country\" pattern=\"[a-zA-Z]+\" placeholder=\"Minimum 3 Characters\"  maxlength=\"3\" onkeypress=\"return onlyAlphabets(event,this);\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Initial Balance</label><span style=\"color: red\">*</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" id=\"initBal\" name=\"initBal\" pattern=\"[0-9]+\" onkeypress=\"return isNumberKey(event)\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control\" maxlength=\"10\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("              <div class=\"box-footer\">\r\n");
      out.write("              \r\n");
      out.write("                 &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("                 \r\n");
      out.write("              <a href=\"Login.jsp\" class=\"btn btn-primary\" style=\"float: left;background-color: brown;\">Log In</a>\r\n");
      out.write("              \r\n");
      out.write("           \r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" style=\"float: right;background-color: brown;\">Submit</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.box -->\r\n");
      out.write("    </div>\r\n");
      out.write("       <div class=\"col-md-3\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    </div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.2.3 -->\r\n");
      out.write("<script src=\"plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- FastClick -->\r\n");
      out.write("<script src=\"plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"dist/js/app.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"dist/js/demo.js\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$('#bdate').datepicker();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  $(document).ready( function(){\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  $(\"input\").blur(function(){\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  if($(this).val().trim() == \"\")\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t          alert(\"Form field cannot be empty\");\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t  else\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t     \r\n");
      out.write("\t\t\t        var name =  $(this).attr(\"name\");\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t       \r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t       if(name == \"email\")\r\n");
      out.write("\t\t\t        \t{\r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \tvar mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/; \r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \tif(!$(this).val().trim().match(mailformat))\r\n");
      out.write("\t\t\t        \t\t{\r\n");
      out.write("\t\t\t        \t\t alert(\"You have entered an invalid email address!\"); \r\n");
      out.write("\t\t\t        \t\t \r\n");
      out.write("\t\t\t        \t\t $(this).val('');\r\n");
      out.write("\t\t\t        \t\t}\r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \t}\r\n");
      out.write("\t\t\t       else if(name == \"country\")\r\n");
      out.write("\t\t        \t{\r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \tif(!($(this).val().trim().length > 2))\r\n");
      out.write("\t\t\t        \t\t{\r\n");
      out.write("\t\t\t        \t\t alert(\"Length of Country name must be atleast 3!\"); \r\n");
      out.write("\t\t\t        \t\t \r\n");
      out.write("\t\t\t        \t\t $(this).val('');\r\n");
      out.write("\t\t\t        \t\t}\r\n");
      out.write("\t\t\t        \t\r\n");
      out.write("\t\t\t        \t}\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  });\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  $(\"textarea\").blur(function(){\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  if($(this).val().trim() == \"\")\r\n");
      out.write("\t\t  {\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t          alert(\"Form field cannot be empty\");\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  });\r\n");
      out.write("\t  \r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  function isInt(value) {\r\n");
      out.write("\t  return !isNaN(value) && \r\n");
      out.write("\t         parseInt(Number(value)) == value && \r\n");
      out.write("\t         !isNaN(parseInt(value, 10));\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("  function hasWhiteSpaceandTab(s) {\r\n");
      out.write("\t  return /\\s/g.test(s);\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<SCRIPT language=Javascript>\r\n");
      out.write("     function isNumberKey(evt)\r\n");
      out.write("{\r\n");
      out.write("var charCode = (evt.which) ? evt.which : event.keyCode;\r\n");
      out.write("\r\n");
      out.write("if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("\treturn false;\r\n");
      out.write("\t\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function isValidDate(s) \r\n");
      out.write("{\r\n");
      out.write("\t  var bits = s.split('-');\r\n");
      out.write("\t  var y = bits[2], m  = bits[1], d = bits[0];\r\n");
      out.write("\t  // Assume not leap year by default (note zero index for Jan)\r\n");
      out.write("\t  var daysInMonth = [31,28,31,30,31,30,31,31,30,31,30,31];\r\n");
      out.write("\r\n");
      out.write("\t  // If evenly divisible by 4 and not evenly divisible by 100,\r\n");
      out.write("\t  // or is evenly divisible by 400, then a leap year\r\n");
      out.write("\t  if ( (!(y % 4) && y % 100) || !(y % 400)) {\r\n");
      out.write("\t    daysInMonth[1] = 29;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  return d <= daysInMonth[--m]\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" <script language=\"Javascript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        function onlyAlphabets(e, t) {\r\n");
      out.write("            try {\r\n");
      out.write("                if (window.event) {\r\n");
      out.write("                    var charCode = window.event.keyCode;\r\n");
      out.write("                }\r\n");
      out.write("                else if (e) {\r\n");
      out.write("                    var charCode = e.which;\r\n");
      out.write("                }\r\n");
      out.write("                else { return true; }\r\n");
      out.write("                if ((charCode > 64 && charCode < 91) || (charCode > 96 && charCode < 123) || charCode == 8 || ($(\"#fullName\").val().length > 1 && charCode == 32))\r\n");
      out.write("                    return true;\r\n");
      out.write("                else\r\n");
      out.write("                    return false;\r\n");
      out.write("            }\r\n");
      out.write("            catch (err) {\r\n");
      out.write("                alert(err.Description);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
