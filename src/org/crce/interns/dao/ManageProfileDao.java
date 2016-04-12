package org.crce.interns.dao;

import org.crce.interns.model.Criteria;
import org.crce.interns.model.Job;

//import org.crce.interns.model.Profile;

public interface ManageProfileDao {

	//public void createProfile(Profile profile);
	public void createProfile(Job job);
	public void createProfile(Criteria criteria);

}
