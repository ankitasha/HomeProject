/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-05 13:04:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addinsurance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add Insurance</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("#button {\r\n");
      out.write("     line-height: 12px;\r\n");
      out.write("     padding:5px;\r\n");
      out.write("     width: 100px;\r\n");
      out.write("     font-size: 8pt;\r\n");
      out.write("     font-family: tahoma;\r\n");
      out.write("     margin-top: 1px;\r\n");
      out.write("     margin-right: 0px;\r\n");
      out.write("     position:absolute;\r\n");
      out.write("     top:0;\r\n");
      out.write("     right:0;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" #menu {\r\n");
      out.write("     line-height: 12px;\r\n");
      out.write("     padding:5px;\r\n");
      out.write("     width: 100px;\r\n");
      out.write("     font-size: 8pt;\r\n");
      out.write("     font-family: tahoma;\r\n");
      out.write("     margin-top: 1px;\r\n");
      out.write("     margin-right: 120px;\r\n");
      out.write("     position:absolute;\r\n");
      out.write("     top:0;\r\n");
      out.write("     right:0;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("   html, body {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  #tableContainer-1 {\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: table;\r\n");
      out.write("  }\r\n");
      out.write("  #tableContainer-2 {\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    display: table-cell;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("  }\r\n");
      out.write("  #myTable {\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<h3>Enter Insurance Details</h3>\r\n");
      out.write("<body style=\"background-color: #f7adca\">\r\n");
      out.write("\t  <div id=\"tableContainer-1\">\r\n");
      out.write("  \t    <div id=\"tableContainer-2\">\r\n");
      out.write("          <form method=\"post\" action=\"addInsurance\">\r\n");
      out.write("             <center>\r\n");
      out.write("               <table id=\"myTable\" border=\"1\" width=\"30%\" cellpadding=\"3\" style=\"background-color: #ECE5B6;\" WIDTH=\"30%\">\r\n");
      out.write("             \t\t\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> Insurance code : </td><td><input name=\"insurancecode\"  /> </td> \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> Insurance type : </td><td><input name=\"type\"  /> </td> \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> Date of Issuance : </td><td> <input type=\"date\" name=\"dateofIssuance\" /> </td> \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> Date of Renewal : </td><td> <input type=\"date\"  name=\"dateofRenewal\" /> </td> \r\n");
      out.write("                    </tr>\r\n");
      out.write("                     <tr>\r\n");
      out.write("                        <td> Date of Expiry : </td><td> <input type=\"date\" name=\"dateofExpiry\" /> </td> \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> Customer Id : </td><td><input name=\"customer.customerId\"  /> </td> \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Add\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("            </center>\r\n");
      out.write("        </form>\r\n");
      out.write("        <form method=\"get\" action=\"homepage\">\r\n");
      out.write("   \t\t\t <button id=\"button\" type=\"submit\">Home</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
