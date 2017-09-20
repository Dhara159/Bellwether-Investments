<%-- 
    Document   : live
    Created on : 20 Sep, 2017, 5:52:36 AM
    Author     : Dhara
--%>

   <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%
   try{
     String s[]=null;

     Class.forName("com.mysql.jdbc.Driver"); 
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bellwether1","root","");
     Statement st=con.createStatement();
     ResultSet rs = st.executeQuery("select * from trade");

       List li = new ArrayList();

       while(rs.next())
       {
           li.add(rs.getString(2));
       }

       String[] str = new String[li.size()];
       Iterator it = li.iterator();

       int i = 0;
       while(it.hasNext())
       {
           
           String p = (String)it.next();
           str[i] = p;
           i++;
       
       }

    //jQuery related start
       String query = (String)request.getParameter("q");
       int cnt=1;
//       out.println(str.length);
        
       for(int j=0;j<str.length;j++)
       {
           
           if(str[j].toUpperCase().startsWith(query.toUpperCase()))
           {
              out.print(str[j]+"\n");
              if(cnt>=5)// 5=How many results have to show while we are typing(auto suggestions)
              break;
              cnt++;
            }
       }
       
    //jQuery related end

rs.close();
st.close();
con.close();

}
catch(Exception e){
e.printStackTrace();
}

%>
