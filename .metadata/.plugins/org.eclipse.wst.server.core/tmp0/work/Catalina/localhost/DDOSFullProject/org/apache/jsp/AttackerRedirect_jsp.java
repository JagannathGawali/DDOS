/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2018-03-22 08:16:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.AES.AESencrp;

public final class AttackerRedirect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>DDOS Prevention in E-Banking</title>\r\n");
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
      out.write("  \r\n");
      out.write("  <style>\r\n");
      out.write("  .test{\r\n");
      out.write("    \r\n");
      out.write("    width:200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("  \r\n");
      out.write("  <script src=\"resources/scripts/jquery-1.6.4.min-1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources/scripts/jquery-ui-1.8.16.custom.min-1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"resources/scripts/smooth-1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
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
      out.write("\t</head>\r\n");
      out.write("\t<!-- <body onload=\"access()\" style=\"background-image: url('resources/images/b.jpg')\"> -->\r\n");
      out.write("\t\r\n");
      out.write("\t<center>");

String msg=request.getParameter("msg");
if(msg!=null)
	out.println("<span style='color:red'>"+msg+"</span>");

      out.write("\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url('dist/img/3003.jpg');background-repeat: no-repeat;height:100%;\r\n");
      out.write("   \twidth:100%;\r\n");
      out.write("\tbackground-size: contain;\r\n");
      out.write("  \tbackground-position: center;\r\n");
      out.write("  \tbackground-attachment: fixed;\">\r\n");
      out.write("  \t\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <!-- Horizontal Form -->\r\n");
      out.write("          <div class=\"box box-info\" style=\"margin-left: -150px;border-top-color: brown;\">\r\n");
      out.write("            <div class=\"box-header with-border\">\r\n");
      out.write("              <h3 class=\"box-title\">Net-Banking</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-header -->\r\n");
      out.write("            <!-- form start -->\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <font color=\"crimson\" size=\"5\">You are not allowed to access system with your current IP Address</font>\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.box -->\r\n");
      out.write("    </div>\r\n");
      out.write("       <div class=\"col-md-3\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
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