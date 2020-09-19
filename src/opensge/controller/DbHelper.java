/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensge.controller;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *  Manages the creation of the database and tables
 * @author emanuel
 */



public class DbHelper {
   
    private final SqliteConnection sqliteConnection;
   
    public DbHelper(SqliteConnection sConnection){
        this.sqliteConnection = sConnection;
    }
    
    public void createTables(){
        
        boolean isConnected = false;
        
        String sqlProduct = "CREATE TABLE IF NOT EXISTS tbl_product"
                +"("
                +"id integer PRIMARY KEY,"
                +"name text NOT NULL,"
                +"stock integer NOT NULL,"
                +"price real NOT NULL"
                +");";
        
        String sqlCashier = "CREATE TABLE IF NOT EXISTS tbl_cashier"
                +"("
                +"id integer PRIMARY KEY,"
                +"date text NOT NULL,"
                +"value_day real NOT NULL"
                +");";
        
        String sqlCashierForProducts = "CREATE TABLE IF NOT EXISTS tbl_cashier_product"
                +"("
                +"id integer PRIMARY KEY,"
                +"id_product integer NOT NULL,"
                +"id_cashier integer NOT NULL,"
                +"total_value real NOT NULL,"
                +"quantity integer NOT NULL,"
                +"FOREIGN KEY (id_product) REFERENCES tbl_product (id),"
                +"FOREIGN KEY (id_cashier) REFERENCES tbl_cashier (id)"
                +");";
        
        try{
            
            isConnected = this.sqliteConnection.connect();
            
            Statement stmt = this.sqliteConnection.getStatement();
            stmt.execute(sqlProduct);
            stmt.execute(sqlCashier);
            stmt.execute(sqlCashierForProducts);
            
            System.out.println("tables created");
            
        }catch(SQLException e){
            
            System.out.println(e.getMessage());
            
        }finally{
            if(isConnected){
                this.sqliteConnection.disconnect();
            }
        }
        
    }
    
    
}


