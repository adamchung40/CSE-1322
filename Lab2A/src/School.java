
public class School {

	public static void main(String [] args) {
		Person p1 = new Person("Harry Potter","3E Cedar Run",4044923368L,"hpotter5@gmail.com");
		System.out.println(p1.toString());
		
		Student s1 = new Student("Adam Chung","3E Cedar Run",6783303368L,"adamchung40@gmail.com","Sophmore");
		System.out.println(s1.toString());
		
		Employee e1 = new Employee("Khang Black","58 Mountainview Dr. Leominster, MA 01453",4041651165L,"kblack14@kennesaw.edu","J113",50000,"Sept 15, 2019");
		System.out.println(e1.toString());
	
		Faculty f1 = new Faculty("Mary Parks","9538 East Street Rock Hill, SC 29730",7705684592L,"mparks3@kennesaw.edu","A115",55000,"Aug 22, 2018","11am - 1pm","Assistant Professor");
		System.out.println(f1.toString());
		
		Staff st1 = new Staff("Jane Gunner","4 S. Walt Whitman Dr. Valdosta, GA 31601",404547825L,"jgunner7@kennesaw.edu","B115",70000,"Oct 05, 2010","Principal");
		System.out.println(st1.toString());
	}
}
