/**
 * 
 */
package package_Database;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

/**
 * @author ANUP
 *
 */
public class ConnectToMySQL2_Insert_Output_DB {
	
		
				
	  
			/**
			 * @param output
			 * @throws ClassNotFoundException
			 * @throws SQLException
			 */
			public void test_output(String[] output) throws  ClassNotFoundException, SQLException {													
					//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
	                String dbUrl = "jdbc:mysql://localhost:3306/automation";					

					//Database Username		
					String username = "anupcranbourne";	
	                
					//Database Password		
					String password = "starwars1";				

					//Query to Execute		
					String query = "insert into amazon_test_output values('"+output[0]+"','"+output[1]+"','"+output[2]+"','"+output[3]+"','"+output[4]+"','"+output[5]+"','"+output[6]+"','"+output[7]+"')";    	
	                
	         	    //Load mysql jdbc driver		
	           	    Class.forName("com.mysql.jdbc.Driver");			
	           
	           		//Create Connection to DB		
	            	Connection con = DriverManager.getConnection(dbUrl,username,password);
	          
	          		//Create Statement Object		
	        	   Statement stmt = con.prepareStatement(query);			
	       
	       			// Execute the SQL Query). Store results in ResultSet		
	         		stmt.executeUpdate(query);	
	         		
	         
	         		// While Loop to iterate through all data and print results		
	         /*		String[] Login = new String[2];
	         		while (rs.next()){
	         		
	         					Login[0] = rs.getString(1);								        
	                            Login[1] = rs.getString(2);					                               
	                        //    System. out.println("Amazon_username"+"  "+Login_username);	
	                         //  System. out.println("Amazon_password"+"  "+Login_password);
	                   }		*/
	      			 // closing DB Connection		
	      			con.close();
					
			}

			
	}


