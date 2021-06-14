package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {
	//public class EmployeeDAOImplOracle implements EmployeeDAO {
		  public List<Dept> getAllDepts() {
		    List<Dept> list = new ArrayList<>();
		    String QUERY = "select deptno,dname,loc from dept";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(QUERY))
			    {	
					while(rs.next()){
					int no = rs.getInt("deptno");
					String name = rs.getString("dname");
					String location = rs.getString("loc");
					System.out.println("Connection");
					System.out.println(no + "," +name+ "," +location );
				}//try
			} catch (SQLException e) {e.printStackTrace(); }
		
			return list;
		  };
		  
		  
//		  public List<Employee> getEmployeesByLocation(String location) {
//		    List<Employee> list = new ArrayList<>();
//		    // JDBC code here...
//			return list;
//		  };
//		  public void updateEmployeeById(int id) {
//		    // JDBC code here...
//		  };
//		  public void deleteEmployeeById(int id) {
//		    // JDBC code here...
//		  };
//		  public static int rowDelete()
//			{
//				int row=0;
//				String QUERY = "Delete from dept where deptno = ?";
//			     try (Connection conn = ConnectionUtil.getConnection();
//			             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
//			     {		
//			    	 preparedStatement.setInt(1, 80);
//			        row = preparedStatement.executeUpdate();
//			         // rows affected
//			         System.out.println(row);
//			    	 
//			     }catch( SQLException e)
//			     {
//			    	 System.out.println(" Row cannot be deleted");
//			     }
//				   return row; 
//			}
//		  public void addEmployee(Employee e) {
//		    // JDBC code here...
//		  };
		}

