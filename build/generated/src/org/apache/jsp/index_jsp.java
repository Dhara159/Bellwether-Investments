package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Level;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.net.URL;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.IOException;
import java.io.IOException;
import java.util.Random;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.util.concurrent.ThreadLocalRandom;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

            // Set refresh, autoload time as 5 seconds
            response.setIntHeader("Refresh", 5);
            
            // Get current time
            Calendar calendar = new GregorianCalendar();
            String am_pm;
            
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            
            if(calendar.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
            else
               am_pm = "PM";
            String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
//            out.println("Crrent Time: " + CT + "\n");


         
      out.write("\n");
      out.write("         \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bellwether Investments</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"js/lumino.glyphs.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sidebar-collapse\">\n");
      out.write("\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t    </button>\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\"><span style=\"color:#30A5FF;\">BI(Bellwether Investments)</span></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t    </div><!-- /.container-fluid -->\n");
      out.write("\t</nav>\n");
      out.write("\t\t<!-- side menu bar -->\n");
      out.write("\t\t<!-- started -->\n");
      out.write("\t<div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("\t\t<form role=\"search\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<ul class=\"nav menu\">\n");
      out.write("\t\t\t<li class=\"active\"><a href=\"admin_dashboard.jsp\"><svg class=\"glyph stroked dashboard-dial\"><use xlink:href=\"#stroked-dashboard-dial\"></use></svg>Live Feeding</a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<div class=\"attribution\">Created by <a href=\"#\" style=\"color: #30A5FF;\">BI</a><br/></div>\n");
      out.write("\t</div><!--/.sidebar-->\n");
      out.write("\t\t\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\" id=\"dashboard_setting\">\t\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t<li><a href=\"#\"><svg class=\"glyph stroked home\"><use xlink:href=\"#stroked-home\"></use></svg></a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Live Feeding</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\n");
      out.write("\t\t<!-- side menu bar -->\n");
      out.write("\t\t<!-- ended -->\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h1 class=\"page-header\">Live Feeding</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("              ");
      out.print( CT );
      out.write("\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">Recent History</div>\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("                                            <table class=\"table table-bordered\" data-toggle=\"table\" data-show-refresh=\"true\" data-show-toggle=\"true\" data-show-columns=\"true\" data-search=\"true\" data-select-item-name=\"toolbar1\" data-pagination=\"true\" data-sort-name=\"name\" data-sort-order=\"desc\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th data-field=\"sr_no\" data-sortable=\"true\">SR. No.</th>\n");
      out.write("            <th data-field=\"id\" data-sortable=\"true\">ID</th>\n");
      out.write("\t    <th data-field=\"trade\"  data-sortable=\"true\">Trade</th>\n");
      out.write("            <th data-field=\"exchange\"  data-sortable=\"true\">Exchange</th>\n");
      out.write("            <th data-field=\"lfix\" data-sortable=\"true\">Last Fix <br> Price</th>\n");
      out.write("            <th data-field=\"lCur\" data-sortable=\"true\">Current Fix <br> Price</th>\n");
      out.write("            <th data-field=\"lt\" data-sortable=\"true\">Last trade <br> Time/Date</th>\n");
      out.write("            <th data-field=\"cChange\" data-sortable=\"true\">Net Change(RS)<br>price</th>\n");
      out.write("            <th data-field=\"cp\" data-sortable=\"true\">Net Change(%)<br>price</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody> \n");
      out.write("         \n");
      out.write("        ");

                    
             try 
            {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bellwether","root","");
            Statement stmt = con.createStatement();
           
            ResultSet rs1 = stmt.executeQuery("select * from fifteenfeed");
            while(rs1.next())
            {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs1.getInt("sr_no"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getInt("id"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("trade").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("exchange").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("lFix").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("lCur").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("lt").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("cChange").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("cp").toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

            }
                
      out.write("\n");
      out.write("            \n");
      out.write("\t</tbody>\n");
      out.write("    </table>\n");
      out.write("                ");

                 }
            catch(Exception e){
                out.println(e);
            }
            
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
