//Adam Chung

public class Person //Superclass
{
	private String name;
	private String address;
	private long phoneNum;
	private String email;
	
	public Person() {} // Default Constructor
	public Person(String name, String address, long phoneNum, String email) { // Overloaded Constructor
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getName() 
	{ return this.name; }
	
	public String getAddress() 
	{ return this.address; }
	
	public long getPhoneNum() 
	{ return this.phoneNum; }
	
	public String getEmail() 
	{ return this.email; }
	
	public String getClassName() 
	{ return this.getClass().getSimpleName(); }
	
	public String toString() {
		String output = getClassName() + ":\nName: " + this.name + "\nAddress: "+ this.address +
						"\nPhone#: "+ this.phoneNum + "\nEmail: "+ this.email; 
		return output;
		}
}

class Student extends Person //Subclass
{
	private String classStatus;
	
	public Student() {} // Default Constructor
	public Student(String name, String address, long phoneNum, String email, String classStatus) { // Overloaded Constructor
		super(name,address,phoneNum,email);
		this.classStatus = classStatus;
	}
	
	public String getClassStatus() 
	{ return this.classStatus; }
	
	public String toString() {
		String output = "\n" + super.toString() + "\nClass Status: "+ this.classStatus;
		return output;
	}
	
}

class Employee extends Person //Subclass
{
	private String office;
	private double salary;
	private String dateHired;
	
	public Employee() {} // Default Constructor
	public Employee(String name, String address, long phoneNum, String email, String office, double salary, String dateHired) { // Overloaded Constructor
		super(name,address,phoneNum,email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() 
	{ return this.office; }
	
	public double getSalary() 
	{ return this.salary; }
	
	public String getDateHired() 
	{ return this.dateHired; }
	
	public String toString() {
		String output = "\n" + super.toString() +"\nOffice: "+this.office+ "\nSalary: "+this.salary+
						"\nDate Hired: "+ this.dateHired;
		return output;
	}
}

class MyDate 
{
	String year;
	String month;
	String day; 
	String startDay;
	
	public MyDate() {} // Default Constructor
	public MyDate(String year, String month, String day) {  // Overloaded Constructor
		this.year = year;
		this.month = month;
		this.day = day;
		this.startDay = this.month +" "+this.day+", "+this.year;
	}
}

class Faculty extends Employee
{
	private String officeHrs;
	private String rank;
	
	public Faculty() {} // Default Constructor
	public Faculty(String name, String address, long phoneNum, String email, String office, double salary, String dateHired, String officeHrs, String rank) { // Overloaded Constructor
		super(name,address,phoneNum,email,office,salary,dateHired);
		this.officeHrs = officeHrs;
		this.rank = rank;
	}
	
	public String getOfficeHrs() 
	{ return this.officeHrs; }
	
	public String getRank() 
	{ return this.rank; }
	
	public String toString() {
		String output = super.toString()+ "Office Hours: "+getOfficeHrs()+ "\nRank: "+getRank(); 
		return output;
	}
}

class Staff extends Employee
{
	private String title;
	
	public Staff() {} // Default Constructor
	public Staff(String name, String address, long phoneNum, String email, String office, double salary, String dateHired, String title) { // Overloaded Constructor
		super(name,address,phoneNum,email,office,salary,dateHired);
		this.title = title;
	}
	
	public String getTitle() 
	{ return this.title; }
	
	public String toString() {
		String output = super.toString()+ "Title: "+this.title;
		return output;
	}
}