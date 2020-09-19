/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensge;

import opensge.controller.DbHelper;
import opensge.controller.SqliteConnection;


/**
 *
 * @author emanuel
 */
public class OpenSGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SqliteConnection sqliteConnection = new SqliteConnection();
        DbHelper dbHelper = new DbHelper(sqliteConnection);
        
        dbHelper.createTables();
        
    }
    
}
