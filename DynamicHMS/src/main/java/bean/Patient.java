package bean;

import java.util.Date;
import java.util.Random;

public class Patient {
    private int id; // Add an ID field if necessary
    private String firstName;
    private String lastName;
    private String Email;
    private int RoomNumber;
    private int Weight;
    private int Height;
    private int Age;
    private String BloodGroup;
    private String PatientDOB;
    private String Gender;
    private String City;
    private int DoctorID;
    private String DoctorName;
    private String Address;
    private long ContactNumber;

    // Constructor without ID
    public Patient(String firstName, String lastName, String Email, int RoomNumber, int Weight,
                   int Height, int Age, String BloodGroup, String date, String Gender,
                   String City, int DoctorID, String DoctorName, String Address, long ContactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.RoomNumber = RoomNumber;
        this.Weight = Weight;
        this.Height = Height;
        this.Age = Age;
        this.BloodGroup = BloodGroup;
        this.PatientDOB = date;
        this.Gender = Gender;
        this.City = City;
        this.DoctorID = DoctorID;
        this.DoctorName = DoctorName;
        this.Address = Address;
        this.ContactNumber = ContactNumber;
    }

    // Constructor with ID (use if you need to create objects with an ID, e.g., when retrieving from the database)
    public Patient(int id, String firstName, String lastName, String Email, int RoomNumber, int Weight,
                   int Height, int Age, String BloodGroup, String date, String Gender,
                   String City, int DoctorID, String DoctorName, String Address, long ContactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.RoomNumber = RoomNumber;
        this.Weight = Weight;
        this.Height = Height;
        this.Age = Age;
        this.BloodGroup = BloodGroup;
        this.PatientDOB = date;
        this.Gender = Gender;
        this.City = City;
        this.DoctorID = DoctorID;
        this.DoctorName = DoctorName;
        this.Address = Address;
        this.ContactNumber = ContactNumber;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    // other getters and setters...


	 
	 
	public void setFirstName(String name) {
		this.firstName = name; 
	}
	
	public void setLastName(String name) {
		this.lastName = name; 
	}
	
	public void setRoomNumber(int roomNumber) {
		this.RoomNumber = roomNumber;
	}
	public void setWeight(int Weight) {
		this.Weight = Weight;
	}
	public void setHeight(int Height) {
		this.Height = Height;
	}
	public void setemail(String name) {
		this.Email = name; 
	}
	
	public void setcontact(long name) {
		this.ContactNumber = name; 
	}
	
	public void setDOB(String date) {
		this.PatientDOB = date; 
	}
	


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return Email;
	}
	
	public int getRoomNumber() {
		return RoomNumber;
	}
	public int getWeight() {
		return Weight;
	}
	public int getHeight() {
		return Height;
	}
	public int getAge() {
		return Age;
	}

	public String getBloodGroup() {
		return BloodGroup;
	}

	public String getDOB() {
		return PatientDOB;
	}

	public String getGender() {
		return Gender;
	}

	public String getCity() {
		return City;
	}

	public long getDoctorID() {
		return DoctorID;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public String getAddress() {
		return Address;
	}

	public long getContactNumber() {
		return ContactNumber;
	}

}
