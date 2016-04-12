1. Changed database properties.

2. Copied following contents from JobProfile_final2:

	2.1 Add button of create profile in TPO.jsp 
			<h2><a href="addProfile">
			<button>Create Job Profile</button>
			</a></h2>
	
	2.2 Add the addProfile.jsp page
	
	2.3 Add the controller,model,bean,service and DAO contents(add both DAO and DAOImpl in same 																		package	)
	    
	    Note: Do not add the Profile,ProfileBean. Also remove the imports of these
	    	   i.e.  import org.crce.interns.model.Profile;
	    	   		  import org.crce.interns.beans.ProfileBean;
	    	   		   
	    	   from controller and any other place where these imports are used
	    	   
3. In the ManageProfile Controller the class should extend HttpServlet

	i.e. public class ManageProfile extends HttpServlet
	
4. Now its ready to run


