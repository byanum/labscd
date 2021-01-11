/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsales;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anum
 */
public class Database {
  public static Connection getConnection() throws Exception{
        // TODO code application logic here
        Class.forName("org.gjt.mm.mysql.Driver");
        Connection cn = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/dailysales","root","");
        
        
        
         return cn;   
 }
}
