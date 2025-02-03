package service;

import java.util.ArrayList;
//import java.util.List;

import bean.Patient;
import dao.PatientDao;

public class PatientService {
	PatientDao ptDao =new PatientDao();
	public int registerpatient(Patient p) throws ClassNotFoundException 
	{
		return ptDao.PatientRegistration(p);
	}
	
	public ArrayList<Patient> getPatient()
	{
		return ptDao.RetrievePatientDetails();
	}
	
	public Patient getPatientById(int id)
	{
		return ptDao.getPatientById(id);
	}
	
	public int updatePatient(Patient p)
	{
		return ptDao.updatePatientById(p);
	} 
	
	
	public int deletePatient(int id)
	{
		return ptDao.delete(id);
	}

	public ArrayList<Patient> RetrievePatientDetails() {
		return ptDao.RetrievePatientDetails();
	}
	
	

	
}
