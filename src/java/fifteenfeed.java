/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Dhara
 */
public class fifteenfeed {
    
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while((cp = rd.read()) != -1) {
            if((char) cp != ' ' && (char) cp != '/')
            {
                sb.append((char) cp);
            }
        }
        return sb.toString();
    }
    
    public static JSONObject[] readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream(); 
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONArray json = new JSONArray(jsonText);
            int arrayLength = json.length();
            JSONObject[] jsnObj = new JSONObject[arrayLength];
            for(int i =0; i< arrayLength; i++){
//                    JSONObject jsnObj = (JSONObject)json.get(i);
                jsnObj[i] = (JSONObject)json.get(i);
            }
            return jsnObj;
        } finally {
            is.close();
        }
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, JSONException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bellwether","root","");
            PreparedStatement stmt = conn.prepareStatement("UPDATE `fifteenfeed` SET `id`=?,`trade`=?,`exchange`=?,`lFix`=?,`lCur`=?,`lt`=?,`cChange`=?,`cp`=? WHERE `sr_no`=?");
//              For 15 mins
//            final long timeInterval = 900000;
//              For 1 sec
           final long timeInterval = 5000;
                
        Runnable runnable;
        runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    JSONObject[] jsnObj = null;
                    try {
                        jsnObj = readJsonFromUrl("http://finance.google.com/finance/info?client=ig&q=NSE:NIFTY,NSE:RELIANCE,NSE:ACC,NSE:ABB,NSE:MRF,NSE:TATAMOTORS,NSE:3MINDIA,NSE:CENTURYPLY,NSE:GREENPLY,NSE:CEATLTD,NSE:APOLLOTYRE,NSE:JKTYRE,NSE:BALKRISIND,NSE:DISHTV,NSE:NETWORK18,NSE:ZEEL,NSE:SUNTV,NSE:DEN,NSE:TV18BRDCST,NSE:TVTODAY");
                    } catch (IOException ex) {
                        Logger.getLogger(fifteenfeed.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (JSONException ex) {
                        Logger.getLogger(fifteenfeed.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for(int j = 0 ; j < jsnObj.length; j++)
                    {
                        try {
                            stmt.setInt(1,Integer.parseInt((String) jsnObj[j].get("id")));
                            stmt.setString(2, (String) jsnObj[j].get("t"));
                            stmt.setString(3, (String) jsnObj[j].get("e"));
                            stmt.setString(4, (String) jsnObj[j].get("l_fix"));
                            stmt.setString(5, (String) jsnObj[j].get("l_cur"));
                            stmt.setString(6, (String) jsnObj[j].get("lt"));
                            stmt.setString(7, (String) jsnObj[j].get("c"));
                            stmt.setString(8, (String) jsnObj[j].get("cp"));
                            stmt.setInt(9, (j+1));
                            stmt.addBatch();
                        } catch (SQLException ex) {
                            Logger.getLogger(fifteenfeed.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    try {
                        stmt.executeBatch();
                        System.out.println(jsnObj.length + " rows has been updated");
                    } catch (SQLException ex) {
                        Logger.getLogger(fifteenfeed.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    } 
}

