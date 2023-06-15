package pageObjects;

public interface PostJobElement {
	
	 String jobtitle="jobTitle";
	 String location="address";
	 String functionalarea="functionalArea";
	 String subfunctional="selectSubFunctionalArea";
	 String role="selectrole";
	 String check="//*[@id=\"addJob\"]/div[10]/label";
	 String jobsector="selectjobSector";
	 String jobtype="selectjobType";
	 String wfh="workFromHome";
	 String Jobsector="selectjobSector";
	 String JobType="selectjobType";
	 String jobtime="selectJobTime";
	 String jobshift="selectJobShift";
	 String jobposition="positions";
	 String date="lastDateOfAppl";
	 String minsalary="minSalary";
	 String maxsalary="maxSalary";
	 String mineducation="selectminEducation";
	 String minexp="minExperience";
	 String minprimexp="minPrimExp";
	 String minotherexp="minOtherExp";
	 String personname="contactPersonName";
	 String personemail="contactPersonEmail";
	 String phone="//*[@id=\"addJob\"]/div[27]/div/div[3]/div/input";
	 String desc="//*[@id=\"addJob\"]/div[30]/div/div/div[2]/div[2]/div";
	 String publish="//*[@id=\"addJob\"]/div[31]/button[2]";
	 
	 
	
	
}
