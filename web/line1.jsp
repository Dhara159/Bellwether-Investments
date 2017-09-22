<%@page import="java.sql.Array"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script>
            <%
                Class.forName("com.mysql.jdbc.Driver"); 
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bellwether1","root","");
                Statement st=con.createStatement();
                ResultSet rs = st.executeQuery("select date,close_price from abb where date >= '2015-09-22' AND date <= '2015-09-30' ");
                
                Object[][] time = new Object[20][20];
//                Object[] date = new Object[20];
                int i=0;
                while(rs.next())
                {
                    time[1][i]= rs.getObject("close_price").toString();
//                    date[i]= rs.getDate("date");
                    i++;
                }
//                int length_x = time.length;
                
                %>
            google.charts.load('current',{'packages':['line']});
            google.charts.setOnLoadCallback(draw);
            function draw()
            {
               var data = new google.visualization.DataTable();
               data.addColumn('string','name');
               data.addColumn('number','value');
               data.addRows([
                   
                   ['2002',1],
                   ['2000',2],
                   ['2001',4],
               ]);
               var option={
                   chart:{
                       title:"barchart",
                   }
               };
               var chart = new google.charts.Line(document.getElementById("bar"));
               chart.draw(data,option);
            }
            </script>
    </head>
    <body>
        <div id="bar" style="height: 400px;width: 400px;"></div>
    </body>
</html>
