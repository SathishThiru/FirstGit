package org.privat.constructors;

// read comments inside both class first. then read steps
public class Demo {

	// step 1 main
	public static void main (String [] srgs)
	{
		// EmployeeDetails e = new EmployeeDetails(); -- ipdi oru object create panna mudiyuma?
		// normal scenario la mudiyum. so indha statement obj create pannum
		// and also EmployeeDetails nu oru default constructor ah invoke pannum
		//but EmployeeDetails nra class la namale oru connstructor ah define panni irukom
		// as u see in that class below
		// adhula andha constructor ah private nu vachurukom.
		//apa adha indha main method la call panna mudiyadhu.
		//coz main method in different class
		
		// apa andha Employeedetails oda object ah inga edukavae mudiyadha?
		//mudiyum. epdi na...EmployeeDetails class la poi
		// andha oru public method create panni
		//andha method la irundhu andha class oda object ah return statement ah kudukanum
		// perusa onnum illa. private nu nama oru variable ah vachurundha
		/// andha variable ah inooru class kulla vangaradhuku 
		// nama andha private variable ah oru public class kulla pass panni
		// andha public method ah innoru class la call panra apa
		// namaku andha private variable [ublic ah maari shareable ah maaridum
		//adhae dhan ingayum.
		EmployeeDetails e = EmployeeDetails.getEmployeeDetailsInstance(); // step 2 calling method // step 5 - 
		// e la ipa EmployeeDetails class oda objcet ukkandhurukum.
		//apa EmployeeDetails la iruka print method ah e vachu call panlam
		
		e.print(); // step 6 - calling print
	}
}


class EmployeeDetails

{
	//private constructor.
	private EmployeeDetails() 
	{
		
	}
	
	// keezha EmployeeDetails nradhu return Datatpye. 
	// and getEmployeeDetailsInstance ndradhu methodname
	//public  nu vachurukom. so that it can be shared with other classes.
	//step 3- method called
	public static EmployeeDetails getEmployeeDetailsInstance()
	{
		return new EmployeeDetails(); // step 4- returns object to main 
	}
	
	public void print() {
		System.out.println("printing from a method called from EmployeeDetails class.");
		System.out.println("this methood is called by object returned by getEmployeeDetailsInstance");
	}
	
}