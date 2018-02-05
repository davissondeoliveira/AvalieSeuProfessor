package edu.byuh.AvalieSeuProfessor.model;

public class Professor {
	int id;
	String prof_f_name, prof_l_name, school_name, department;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProf_f_name() {
		return prof_f_name;
	}
	public void setProf_f_name(String prof_f_name) {
		this.prof_f_name = prof_f_name;
	}
	public String getProf_l_name() {
		return prof_l_name;
	}
	public void setProf_l_name(String prof_l_name) {
		this.prof_l_name = prof_l_name;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
