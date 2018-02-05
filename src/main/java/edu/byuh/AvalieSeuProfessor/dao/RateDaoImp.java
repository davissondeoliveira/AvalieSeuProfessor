package edu.byuh.AvalieSeuProfessor.dao;

import java.util.List;

import javax.sql.DataSource;

import edu.byuh.AvalieSeuProfessor.model.User;

public class RateDaoImp implements RateDao{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<User> getList(){
		
		return null;
	}
}
