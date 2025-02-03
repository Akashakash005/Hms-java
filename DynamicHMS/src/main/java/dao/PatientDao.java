package dao;
import bean.Patient;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.Patient;

public class PatientDao {

	// JDBC

	// connection
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
//		Connection conn = null;
//		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection	conn = DriverManager.getConnection("jdbc:derby:C:\\Users\\Megha\\MyDB;create=true");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		return conn;
	}

//	HTML form > request > servlet > set parameter as bean class and send to Dao > execute JDBC code
	// Patient registration
	public static int PatientRegistration(Patient p) throws ClassNotFoundException {
		int status = 0;

		try {
			Connection conn = PatientDao.getConnection();
			String insertQuery = "INSERT INTO PATIENT (FIRSTNAME,LASTNAME,EMAIL,ROOMNUMBER,WEIGHT,HEIGHT,AGE,BLOODGROUP,DOB,GENDER,CITY,DOCTORID,DOCTORNAME,ADDRESS,CONTACT) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, p.getFirstName());
			pstmt.setString(2, p.getLastName());
			pstmt.setString(3, p.getEmail());
			pstmt.setInt(4, p.getRoomNumber());
			pstmt.setInt(5, p.getWeight());
			pstmt.setInt(6, p.getHeight());
			pstmt.setInt(7, p.getAge());
			pstmt.setString(8, p.getBloodGroup());
//			java.sql.Date date = new java.sql.Date(p.getDOB().getTime());
			pstmt.setString(9, p.getDOB()); 
			pstmt.setString(10, p.getGender());
			pstmt.setString(11, p.getCity());
			pstmt.setLong(12, p.getDoctorID());
			pstmt.setString(13, p.getDoctorName());
			pstmt.setString(14, p.getAddress());
			pstmt.setLong(15, p.getContactNumber());

			status = pstmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error in executing the Insert query" + e);
		}

		return status;
	}

	// Retrieve All Patient details
	public ArrayList<Patient> RetrievePatientDetails() {
		ArrayList<Patient> arr = new ArrayList<>();

		try {
			
			Connection conn = PatientDao.getConnection();
			String selectQuery = "SELECT * FROM PATIENT";
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				
				int id=rs.getInt("REGID");
//				int id;
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String email = rs.getString(4);
				int RoomNumber = rs.getInt(5);
				int Weight = rs.getInt(6);
				int Height = rs.getInt(7);
				int Age = rs.getInt(8);
				String BloodGroup = rs.getString(9);
				String date = rs.getString(10);
				String Gender = rs.getString(11);
				String City = rs.getString(12);
				int DoctorID = rs.getInt(13);
				String DoctorName = rs.getString(14);
				String Address = rs.getString(15);
				long ContactNumber = rs.getLong(16);

				
				Patient pt = new Patient(id,firstName, lastName, email, RoomNumber, Weight, Height, Age, BloodGroup, date,
						Gender, City, DoctorID, DoctorName, Address, ContactNumber);
				arr.add(pt);
				
			}
conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return arr;
	}
	// view Patient details

	  public Patient getPatientById(int id) {
	        Patient patient = null;
	        try {
	            Connection conn = getConnection();
	            String selectQuery = "SELECT * FROM PATIENT WHERE regid = ?";
	            PreparedStatement pstmt = conn.prepareStatement(selectQuery);
	            pstmt.setInt(1, id);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                patient = new Patient(
	                    id, rs.getString("FIRSTNAME"),
	                    rs.getString("LASTNAME"),
	                    rs.getString("EMAIL"),
	                    rs.getInt("ROOMNUMBER"),
	                    rs.getInt("WEIGHT"),
	                    rs.getInt("HEIGHT"),
	                    rs.getInt("AGE"),
	                    rs.getString("BLOODGROUP"),
	                    rs.getString("DOB"),
	                    rs.getString("GENDER"),
	                    rs.getString("CITY"),
	                    rs.getInt("DOCTORID"),
	                    rs.getString("DOCTORNAME"),
	                    rs.getString("ADDRESS"),
	                    rs.getLong("CONTACT")
	                );
	                conn.close();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return patient;
	    }

	
	
	  public static int updatePatientById(Patient p) {
		    int status = 0;
		    try {
		        Connection con = PatientDao.getConnection();
		        
		        // Corrected SQL statement
		        String query = "UPDATE patient SET  EMAIL=?, ROOMNUMBER=?, WEIGHT=?, HEIGHT=?, AGE=?,  DOB=?,  CITY=?, ADDRESS=?, CONTACT=? WHERE regid=?";
		        
		        PreparedStatement pstmt = con.prepareStatement(query);
		        
		        // Set parameters
		       
		        pstmt.setString(1, p.getEmail());
		        pstmt.setInt(2, p.getRoomNumber());
		        pstmt.setInt(3, p.getWeight());
		        pstmt.setInt(4, p.getHeight());
		        pstmt.setInt(5, p.getAge());
		      
		        pstmt.setString(6, p.getDOB()); 
		        
		        pstmt.setString(7, p.getCity());
		   
		        pstmt.setString(8, p.getAddress());
		        pstmt.setLong(9, p.getContactNumber());
		        pstmt.setInt(10, p.getId()); // Ensure id is set last

		        // Execute update
		        status = pstmt.executeUpdate();
		        
		        con.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return status;
		}

	
	//delete patient records
	public static int delete(int id)
	{
		int status =0;
		try {
			Connection conn = PatientDao.getConnection();
			String selectQuery = "DELETE FROM PATIENT WHERE regid=?";
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);
			pstmt.setInt(1, id);
			status=pstmt.executeUpdate();
			conn.close();
		}
		catch (Exception e) {
				e.printStackTrace();
		}
		return status;
	}

}
