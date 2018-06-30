/**
 * 
 */
package package_Database;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

/**
 * @author ANUP
 *
 */
public class ConnectToMySQL_Fetch_Login_Credentials {
	
		
			public String[] login_credentials() throws  ClassNotFoundException, SQLException {													
					//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
	                String dbUrl = "jdbc:mysql://localhost:3306/automation";					

					//Database Username		
					String username = "anupcranbourne";	
	                
					//Database Password		
					String password = "starwars1";				

					//Query to Execute		
					String query = "select *  from rebelsports_login_credentials;";	
	                
	         	    //Load mysql jdbc driver		
	           	    Class.forName("com.mysql.jdbc.Driver");			
	           
	           		//Create Connection to DB		
	            	Connection con = DriverManager.getConnection(dbUrl,username,password);
	          
	          		//Create Statement Object		
	        	   Statement stmt = con.createStatement();					
	       
	       			// Execute the SQL Query. Store results in ResultSet		
	         		ResultSet rs= stmt.executeQuery(query);							
	         
	         		// While Loop to iterate through all data and print results		
	         		String[] Login = new String[2];
	         		while (rs.next()){
	         		
	         					Login[0] = rs.getString(1);								        
	                            Login[1] = rs.getString(2);					                               
	                    //        System. out.println("RebelSports_username"+"  "+Login_username);	
	                     //      System. out.println("RebelSports_password"+"  "+Login_password);
	                   }		
	      			 // closing DB Connection		
	      			con.close();
					return Login;
			}
	}


