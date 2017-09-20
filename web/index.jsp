<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.nio.charset.Charset"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URL"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.Reader"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.IOException"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->


<%@page import="java.util.Random"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.concurrent.ThreadLocalRandom"%>
<%
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


         %>
         
<html>
    <head>
        <title>Bellwether Investments</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap-table.css" rel="stylesheet">
        <link href="css/bootstrap-theme.css" rel="stylesheet">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/datepicker3.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">

        <script src="js/lumino.glyphs.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container-fluid">
		<div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
			<span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		    </button>
		<a class="navbar-brand" href="#"><span style="color:#30A5FF;">BI(Bellwether Investments)</span></a>
				
		</div>
							
	    </div><!-- /.container-fluid -->
	</nav>
		<!-- side menu bar -->
		<!-- started -->
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li class="active"><a href="admin_dashboard.jsp"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg>Live Feeding</a></li>
			
			<li role="presentation" class="divider"></li>
			
		</ul>
		<div class="attribution">Created by <a href="#" style="color: #30A5FF;">BI</a><br/></div>
	</div><!--/.sidebar-->
		
        <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main" id="dashboard_setting">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Live Feeding</li>
			</ol>
		</div><!--/.row-->

		<!-- side menu bar -->
		<!-- ended -->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Live Feeding</h1>
			</div>
		</div><!--/.row-->
              <%= CT %>
                <div class="panel panel-default">
					<div class="panel-heading">Recent History</div>
					<div class="panel-body">
                                            <table class="table table-bordered" data-toggle="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
    <thead>
        <tr>
            <th data-field="sr_no" data-sortable="true">SR. No.</th>
            <th data-field="id" data-sortable="true">ID</th>
	    <th data-field="trade"  data-sortable="true">Trade</th>
            <th data-field="exchange"  data-sortable="true">Exchange</th>
            <th data-field="lfix" data-sortable="true">Last Fix <br> Price</th>
            <th data-field="lCur" data-sortable="true">Current Fix <br> Price</th>
            <th data-field="lt" data-sortable="true">Last trade <br> Time/Date</th>
            <th data-field="cChange" data-sortable="true">Net Change(RS)<br>price</th>
            <th data-field="cp" data-sortable="true">Net Change(%)<br>price</th>
        </tr>
    </thead>
    <tbody> 
         
        <%
                    
             try 
            {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bellwether","root","");
            Statement stmt = con.createStatement();
           
            ResultSet rs1 = stmt.executeQuery("select * from fifteenfeed");
            while(rs1.next())
            {
                %>
                <tr>
                    <td><%= rs1.getInt("sr_no")%></td>
                    <td><%= rs1.getInt("id")%></td>
                    <td><%= rs1.getObject("trade").toString()%></td>
                    <td><%= rs1.getObject("exchange").toString()%></td>
                    <td><%= rs1.getObject("lFix").toString()%></td>
                    <td><%= rs1.getObject("lCur").toString()%></td>
                    <td><%= rs1.getObject("lt").toString()%></td>
                    <td><%= rs1.getObject("cChange").toString()%></td>
                    <td><%= rs1.getObject("cp").toString()%></td>

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
            %>
    
</div>
</div>

        
    </body>
</html>
