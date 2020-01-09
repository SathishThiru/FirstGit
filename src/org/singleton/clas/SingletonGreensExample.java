package org.singleton.clas;

public class SingletonGreensExample 
{
	public static SingletonGreensExample emp;//declaring variable emp of SingletonGreensExample type. it is static. so that the memory adress will always be the same
	
	private SingletonGreensExample()
	{
		System.out.println("Default const:");
	}
	
	public static SingletonGreensExample getObject()
	{
		if(emp == null)
		{
			emp = new SingletonGreensExample();
		System.out.println("done" +emp);
		}
		
		return emp;
		
	}
	
	public void empId()
	{
		System.out.println("Emp id is 123");
	}
	
	public void empName()
	{
		System.out.println("Emp name is sathish");
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		SingletonGreensExample e = getObject();
		e.empId();
		e.empName();
	}
}


class Company
{
	
public static void main(String[] args) {
	SingletonGreensExample e = SingletonGreensExample.getObject();
	e.empId();
	e.empName();
}
}