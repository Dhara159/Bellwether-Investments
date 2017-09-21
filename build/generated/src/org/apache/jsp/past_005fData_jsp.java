package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class past_005fData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style_live.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"js/lumino.glyphs.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.autocomplete.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            jQuery(function(){\n");
      out.write("                $(\"#trade\").autocomplete(\"live.jsp\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <title>Past Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("\t\t<h1 class=\"page-header\">Past Data</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("                 \n");
      out.write("                <form action=\"\" method=\"GET\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"usr\">Name:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control input_text\" name=\"trade\" id=\"trade\" autocomplete=\"on\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"usr\">From Date:</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" name=\"f_date\" id=\"f_date\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"usr\">To Date:</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control\" name=\"t_date\" id=\"t_date\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-lg btn-primary\" name=\"click\" id=\"button_setting\">Search</button>\n");
      out.write("                  </form>\n");
      out.write("    \n");
      out.write("            \n");
      out.write("              \n");
      out.write("                <table class=\"table table-bordered\" data-toggle=\"table\" data-show-refresh=\"true\" data-show-toggle=\"true\" data-show-columns=\"true\" data-search=\"true\" data-select-item-name=\"toolbar1\" data-pagination=\"true\" data-sort-name=\"name\" data-sort-order=\"desc\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th data-field=\"script\" data-sortable=\"true\">Script/<br>Trade</th>\n");
      out.write("            <th data-field=\"date\" data-sortable=\"true\">Date</th>\n");
      out.write("            <th data-field=\"open_price\" data-sortable=\"true\">Open<br>Price</th>\n");
      out.write("\t    <th data-field=\"high_price\"  data-sortable=\"true\">High<br>Price</th>\n");
      out.write("            <th data-field=\"low_price\"  data-sortable=\"true\">Low<br>Price</th>\n");
      out.write("            <th data-field=\"close_price\" data-sortable=\"true\">Close<br>price</th>\n");
      out.write("            <th data-field=\"turnover\" data-sortable=\"true\">Volume</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody> \n");
      out.write("         \n");
      out.write("        ");

                   
                   if(request.getParameter("click") != null)
                    {
                    String trade = request.getParameter("trade");
                    Object f_date = request.getParameter("f_date");
                    Object t_date = request.getParameter("t_date");
                    SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-YYYY");
//                    String dates=formatter.format(date);
             try 
            {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bellwether1","root","");
    
            Statement stmt = con.createStatement();  
//            ps.setString(1,trade);
//            ps.setObject(2,f_date);
//            ps.setObject(3,t_date);
            ResultSet rs1=stmt.executeQuery("select * from " + trade + " WHERE date >= '" + f_date + "' AND date <= '" + t_date + "'");
            while(rs1.next())
            {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("symbol").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( formatter.format(rs1.getDate("date")));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("open_price").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("high_price").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("low_price").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("close_price").toString());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs1.getObject("turnover").toString());
      out.write("</td>\n");
      out.write("                   \n");
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
}
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
