/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-26 10:31:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import org.alfresco.web.site.*;
import org.springframework.extensions.webscripts.ui.common.StringUtils;
import org.apache.commons.logging.LogFactory;

public final class error500_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   String dashboardPath = "";
   // try retrieving user name from the session
   if (session != null)
   {
       String userid = (String)session.getAttribute(SlingshotUserFactory.SESSION_ATTRIBUTE_KEY_USER_ID);
       if (userid != null)
       {
           dashboardPath = "/page/user/" + userid + "/dashboard";
       }
   }
   ResourceBundle messages = ResourceBundle.getBundle("alfresco/messages/slingshot", request.getLocale());

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("   <style type=\"text/css\">\n");
      out.write("body\n");
      out.write("{\n");
      out.write("   font: 13px/1.231 Open Sans,arial,helvetica,clean,sans-serif;\n");
      out.write("   color: #333333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body,div,p\n");
      out.write("{\n");
      out.write("   margin: 0;\n");
      out.write("   padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-error-wrapper\n");
      out.write("{\n");
      out.write("    width: 600px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    margin-top: 10%;\n");
      out.write("    position: relative;\n");
      out.write("    z-index: 2;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-error-logo\n");
      out.write("{\n");
      out.write("    margin: 5px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-error-bg\n");
      out.write("{\n");
      out.write("    float: right;\n");
      out.write("    width: 501px;\n");
      out.write("}\n");
      out.write(".alf-error-bg img\n");
      out.write("{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    clip: rect(0px,501px,250px,250px);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-error-header\n");
      out.write("{\n");
      out.write("    font-size: 1.8em;\n");
      out.write("    color: #4F4F57;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.alf-error-detail\n");
      out.write("{\n");
      out.write("   display: inline-block;\n");
      out.write("   margin-top: 2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.alf-error-detail p\n");
      out.write("{\n");
      out.write("   padding: 0.7em 0;\n");
      out.write("   font-size: 1.1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-error-nav\n");
      out.write("{\n");
      out.write("    margin: 3em 0;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-primary-button\n");
      out.write("{\n");
      out.write("    color: white;\n");
      out.write("    background-color: #0C79BF;\n");
      out.write("    padding: 0.4em 10px;\n");
      out.write("    min-height: 2em;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    border-width: 1px 0;\n");
      out.write("    border-style: solid;\n");
      out.write("    border-color: #0C79BF;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write(".alf-primary-button:hover\n");
      out.write("{\n");
      out.write("    background-color: #135FA3;\n");
      out.write("}\n");
      out.write(".alf-primary-button:active\n");
      out.write("{\n");
      out.write("    background-color: #125380;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".alf-error-footer\n");
      out.write("{\n");
      out.write("    margin-top: 10%;\n");
      out.write("    text-align: center;\n");
      out.write("    color: #A6A6A6;\n");
      out.write("}\n");
      out.write("   </style>\n");
      out.write("   <title>");
      out.print( messages.getString("page.error.500.title"));
      out.write("</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"alf-error-bg\">\n");
      out.write("       <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/modules/images/about-bg-vanilla.png\" />\n");
      out.write("   </div>\n");
      out.write("   <div class=\"alf-error-logo\">\n");
      out.write("       <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/res/themes/default/images/app-logo.png\" />\n");
      out.write("    </div>\n");
      out.write("   <div class=\"alf-error-wrapper\">\n");
      out.write("      <div class=\"alf-error-header\">");
      out.print( messages.getString("page.error.500.header"));
      out.write("</div>\n");
      out.write("      <div class=\"alf-error-detail\">\n");
      out.write("\t        ");
      out.print( messages.getString("page.error.500.detail"));
      out.write("\n");
      out.write("            <div class=\"alf-error-nav\">\n");
      out.write("                <a class=\"alf-primary-button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.print(dashboardPath);
      out.write('"');
      out.write('>');
      out.print( messages.getString("page.error.500.nav.dashboard"));
      out.write("</a>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"alf-error-footer\">\n");
      out.write("        ");
      out.print( messages.getString("page.error.500.footer"));
      out.write("\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("   <div>\n");

out.println("<!--");
StringWriter sw = new StringWriter();
PrintWriter pw = new PrintWriter(sw);
if (exception != null)
{
	exception.printStackTrace(pw);
	out.print(StringUtils.encode(sw.toString()));
	sw.close();
	pw.close();
	out.println("-->");
	LogFactory.getLog("org.alfresco.web.site").error(exception, exception.getCause());
}

      out.write("\n");
      out.write("   </div>\n");
      out.write("</body>\n");
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
