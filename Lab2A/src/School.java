
public class School {

	public static void main(String [] args) {
		System.out.println("Person Class");
		Person p1 = new Person("Keble Chung","3E Cedar Run",4044923368L,"keblechung99@gmail.com");
		p1.displayInfo();
		
		System.out.println("\nStudentClass");
		Student s1 = new Student("Adam Chung","3E Cedar Run",6783303368L,"adamchung40@gmail.com","Sophmore");
		s1.displayStudent();
		
		System.out.println("\nEmployee Class");
		Employee e1 = new Employee("Khang Black","Address",4041651165L,"kblack@kennesaw.edu","J113",50000,"Sept 15, 2019");
		e1.displayEmployee();
		System.out.println(e1.getOffice());
		
		System.out.println("\nFaculty Class");
		Faculty f1 = new Faculty("Mary Parks","Address",7705684592L,"mparks@kennesaw.edu","A115",55000,"Aug 22, 2018","11am - 1pm","Assistant Professor");
		f1.displayFaculty();
		
		System.out.println("\nStaff Class");
		Staff st1 = new Staff("Jane Gunner","Address",404547825L,"jgunner@kennesaw.edu","B115",70000,"Oct 05, 2010","Principal");
		st1.displayStaff();
	}
}
