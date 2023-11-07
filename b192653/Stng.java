import java.util.*;


class Stng {
       static void comapre(String A,String B) {
       		int o = A.compareTo(B);
       		if(o == 0) { 
       			System.out.println("both the Strings are equal");
       		}
       		else if(o > 0) {
       			System.out.println("Sting one is Greater than string B");
       		}
       		else {
       			System.out.println("string B is Lower than String a");
       		}
       }
       static void equal(String A,String B) {
       		boolean end = A.equals(B);
       		System.out.println(end);
       	      }
        static void equalIgnore(String A,String B) {
       		boolean end = A.equalsIgnoreCase(B);
       		System.out.println(end);
       	      }
       	static void concat(String A,String B) {
       		String S1 = A.concat(B);
       		System.out.println(S1);
       		
       	}
       	public static void Countvowels(String A) {
       		int vowelCount = 0;
       		int ConCount = 0;
       		char [] ch = {'a','e','i','o','u'};
       		for(int i = 0; i < A.length();i++) {
       			if(A.charAt(i) == 'a' || A.charAt(i) == 'e'|| A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U') {
       				vowelCount++;
       			}
  
       			else {
       				ConCount++;
       			}
       		}
       		System.out.println("vowels " + vowelCount);
       		System.out.println("consonents " + ConCount);
       	}
       	
       	public static void Reverse(String A) {
       			String but = "";
       			for(int i = (A.length()-1);i >= 0;i--) {
       				but = but + A.charAt(i);
       			}
       			System.out.println(but);
       	}
       	public static void Start(String A,String f ,String s) {
       		for(int i = 0; i < A.length();i++) {
       			for(int j = i+1;j <= A.length();j++) {
       				String eww = A.substring(i,j);
       				if(eww.startsWith(f) && eww.endsWith(s)) {
       					System.out.println(eww);
       				}
       			}
       		}
       	}
       	public static void change(String A) {
       		A = A.toUpperCase();
       		System.out.println(A);
       		A = A.toLowerCase();
       		System.out.println(A);
       	}
       	public static void emp_details(String name,int age,String destniation,String gender,int salary) {
       		System.out.println(name + " " + age + " " + destniation + " " + gender + " " + salary + "LPA");
       	}
       	
       	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println("Enter the starting and ending char");
		String start = sc.next();
		String end = sc.next();
		comapre(A,B);
		equal(A,B);
		equalIgnore(A,B);
		concat(A,B);
		Countvowels(A);
		Reverse(A);
		Start(A,start,end);
		change(A);
		emp_details("Jennu suryateja",20,"mumbai","Male",97);
	
	}
}
