package edu.byuh.AvalieSeuProfessor.model;

import java.util.Date;

public class Rate{
	
	int id, prof_id;
	String course_code, prof_attendance, specifics, student_major;
	double prof_score, 	prof_level_diff;
	Date input_date;
	
	public int getId() {
		return id;
	}
	public Date getInput_date() {
		return input_date;
	}
	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProf_id() {
		return prof_id;
	}
	public void setProf_id(int prof_id) {
		this.prof_id = prof_id;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public String getProf_attendance() {
		return prof_attendance;
	}
	public void setProf_attendance(String prof_attendance) {
		this.prof_attendance = prof_attendance;
	}
	public String getSpecifics() {
		return specifics;
	}
	public void setSpecifics(String specifics) {
		this.specifics = specifics;
	}
	public String getStudent_major() {
		return student_major;
	}
	public void setStudent_major(String student_major) {
		this.student_major = student_major;
	}
	public double getProf_score() {
		return prof_score;
	}
	public void setProf_score(double prof_score) {
		this.prof_score = prof_score;
	}
	public double getProf_level_diff() {
		return prof_level_diff;
	}
	public void setProf_level_diff(double prof_level_diff) {
		this.prof_level_diff = prof_level_diff;
	}
	
	
}
