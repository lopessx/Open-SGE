/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensge.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author emanuel
 */



public class DbHelper {
   
    
    private Connection connection;
    
    
    /**
     * Create or open the connection to the SQLite database
     * @return 
     */
    public boolean connect(){
        
        try{
            
            String url = "jdbc:sqlite:database_lite/database_sge.db";
            
            this.connection = DriverManager.getConnection(url);
            
        }catch(SQLException e){
            
            System.out.println(e.getMessage());
            return false;
            
        }
        
        System.out.println("Connection success");
        
        return true;
    }
    
    /**
     * Close the connection to the SQLite database
     * @return 
     */
    public boolean disconnect(){
        
        try{
            
            if(this.connection.isClosed() == false){
                this.connection.close();
            }
            
        }catch(SQLException e){
            
            System.out.println(e.getMessage());
            return false;
        }
        
        System.out.println("Disconnection success");
        
        return true;
    }
    
}


