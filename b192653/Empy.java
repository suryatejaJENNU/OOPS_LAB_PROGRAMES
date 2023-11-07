import java.util.*;

class Employ {
	int id;
	String emp_name;
	int emp_age;
	String emp_gender;
	String emp_des;
	int emp_salary;
	String emp_address;

}

class Empy {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the n");
		int n = sc.nextInt();
		Employ e[] = new Employ[n];
		for(int i = 0; i < n; i++) {
			e[i] = new Employ();
			System.out.print("Enter the id: ");
			e[i].id = sc.nextInt();
			System.out.print("Enter the name");
			e[i].emp_name = sc.next();
			System.out.print("Enter the age");
			e[i].emp_age = sc.nextInt();
			System.out.print("Enter the Gender");
			e[i].emp_gender = sc.next();
			System.out.print("Enter the dest");
			e[i].emp_des = sc.next();
			System.out.print("Enter the salary");
			e[i].emp_salary = sc.nextInt();
			System.out.print("Enter the address:");
			e[i].emp_address = sc.next();		
		}
		System.out.println("Enter the id of the employ to get details");
		int fid = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("id: "+e[i].id);
			System.out.print("name" + e[i].emp_name );
		
			System.out.print("age"+ e[i].emp_age);
			System.out.print("Gender" + e[i].emp_gender);
			System.out.print("dest" + e[i].emp_des);
			
			System.out.print("salary" + e[i].emp_salary);
			System.out.print("address:" + e[i].emp_address);
			
		}
	}
}
