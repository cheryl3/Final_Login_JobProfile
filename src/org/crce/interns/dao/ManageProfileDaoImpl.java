package org.crce.interns.dao;


//import org.crce.interns.beans.ProfileBean;
import org.crce.interns.model.Criteria;
import org.crce.interns.model.Job;
import org.crce.interns.dao.ManageProfileDao;
//import org.crce.interns.model.Profile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("manageProfileDao")

public class ManageProfileDaoImpl implements ManageProfileDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	public void createProfile(Profile profile) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().saveOrUpdate(profile);	
	}
	*/
	
	public void createProfile(Job job) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(job);	
	}

	public void createProfile(Criteria criteria) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(criteria);	
	}


}
