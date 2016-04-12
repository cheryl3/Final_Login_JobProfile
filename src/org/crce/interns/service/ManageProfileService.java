package org.crce.interns.service;

import org.crce.interns.beans.CriteriaBean;
import org.crce.interns.beans.JobBean;

//import org.crce.interns.beans.ProfileBean;

public interface ManageProfileService {

	//public void addProfile(ProfileBean profileBean);
	//public void addProfile(TryBean tryBean);
	public void addProfile(JobBean jobBean);
	public void addProfile(CriteriaBean criteriaBean);

}
