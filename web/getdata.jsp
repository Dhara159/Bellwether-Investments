<%@page import="java.sql.*" %>
  <%@page import="java.util.*" %>
  <%@page import="org.json.JSONObject" %>

<%
    Connection con= null;
 try{
  Class.forName("com.mysql.jdbc.Driver").newInstance();
 con =      DriverManager.getConnection("jdbc:mysql://localhost:3306/bellwether1","root","");

        ResultSet rs = null;
        List empdetails = new LinkedList();
        JSONObject responseObj = new JSONObject();

        String query = "SELECT date,close_price from abb";
          PreparedStatement pstm= con.prepareStatement(query);

           rs = pstm.executeQuery();
           JSONObject empObj = null;

        while (rs.next()) {
            Object name = rs.getString("date");
            double empid = rs.getInt("close_price");
            empObj = new JSONObject();
            empObj.put("name", name);
            empObj.put("empid", empid);
            empdetails.add(empObj);
        }
        responseObj.put("empdetails", empdetails);
    out.print(responseObj.toString());
    }
    catch(Exception e){
        e.printStackTrace();
    }finally{
        if(con!= null){
            try{
            con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
 %>