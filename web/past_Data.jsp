<%-- 
    Document   : past_Data
    Created on : 19 Sep, 2017, 12:43:06 PM
    Author     : jaydesai571
--%>


<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap-table.css" rel="stylesheet">
        <link href="css/bootstrap-theme.css" rel="stylesheet">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/datepicker3.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
        <link href="css/style_live.css" rel="stylesheet">

        <script src="js/lumino.glyphs.js"></script>
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script src="js/jquery.autocomplete.js"></script>
        <script>
            jQuery(function(){
                $("#trade").autocomplete("live.jsp");
            });
        </script>
        <title>Past Data</title>
    </head>
    <body>
        
        
        <div class="container-fluid">
            <div class="row">
            <div class="col-lg-12">
		<h1 class="page-header">Past Data</h1>
			</div>
		</div><!--/.row-->
                 
                <form action="" method="GET">
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="usr">Name:</label>
                            <input type="text" class="form-control input_text" name="trade" id="trade" autocomplete="on">
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="usr">From Date:</label>
                            <input type="date" class="form-control" name="f_date" id="f_date">
                        </div>
                    </div>
                    
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="usr">To Date:</label>
                            <input type="date" class="form-control" name="t_date" id="t_date">
                        </div>
                    </div>
                    
                    <button type="submit" class="btn btn-lg btn-primary" name="click" id="button_setting">Search</button>
                  </form>
    
            
              
                <table class="table table-bordered" data-toggle="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
    <thead>
        <tr>
            <th data-field="script" data-sortable="true">Script/<br>Trade</th>
            <th data-field="date" data-sortable="true">Date</th>
            <th data-field="open_price" data-sortable="true">Open<br>Price</th>
	    <th data-field="high_price"  data-sortable="true">High<br>Price</th>
            <th data-field="low_price"  data-sortable="true">Low<br>Price</th>
            <th data-field="close_price" data-sortable="true">Close<br>price</th>
            <th data-field="turnover" data-sortable="true">Volume</th>
        </tr>
    </thead>
    <tbody> 
         
        <%
                   
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
                %>
                <tr>
                    <td><%= rs1.getObject("symbol").toString()%></td>
                    <td><%= formatter.format(rs1.getDate("date"))%></td>
                    <td><%= rs1.getObject("open_price").toString()%></td>
                    <td><%= rs1.getObject("high_price").toString()%></td>
                    <td><%= rs1.getObject("low_price").toString()%></td>
                    <td><%= rs1.getObject("close_price").toString()%></td>
                    <td><%= rs1.getObject("turnover").toString()%></td>
                   
                </tr>
                
                <%
            }
                %>
            
	</tbody>
    </table>
                <%
                 }
            catch(Exception e){
                out.println(e);
            }
}
            %>

        </div>
        
    </body>
</html>
