package edu.byuh.AvalieSeuProfessor.service;

import java.util.List;

import edu.byuh.AvalieSeuProfessor.dao.RateDao;
import edu.byuh.AvalieSeuProfessor.model.User;

public class RateServiceImp implements RateService{
	
	private RateDao rateDao;
	
	public void setRateDao(RateDao cid) {
		this.rateDao = cid;
	}
	
	public List<User> getAllStudents(){
		return rateDao.getList();
	}
}
