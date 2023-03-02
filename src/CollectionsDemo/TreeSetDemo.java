package CollectionsDemo;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> intset = new TreeSet<Integer>();//comes in the sorted order
		//LinkedHashSet -> gives in the form of given order
		intset.add(10);
		intset.add(9);
		intset.add(12);
		intset.add(8);
		intset.add(5);
		intset.add(8);
		System.out.println(intset);
		
		Set<String> strset = new TreeSet<String>();
		strset.add("Max");
		strset.add("John");
		strset.add("Will");
		strset.add("Robert");
		strset.add("Zoe");
		System.out.println(strset);
		
		Set<String> strset2 = new TreeSet<String>(new StringComparator());
		strset2.add("Max");
		strset2.add("John");
		strset2.add("Will");
		strset2.add("Robert");
		strset2.add("Zoe");
		System.out.println(strset2);
		
		Set<Employee>employees = new TreeSet<Employee>();
		employees.add(new Employee(101,"Mark",15000,"AA10110"));
		employees.add(new Employee(102,"Ajoop",12000,"AA1001"));
		employees.add(new Employee(201,"Jhon",13000,"AB1002"));
		employees.add(new Employee(301,"Pooja",15000,"AC1003"));
		employees.add(new Employee(401,"Tota",19000,"AD1004 "));
		System.out.println(employees);
		
		//re-order the employees set by the employee name
		Set<Employee>employees2 = new TreeSet<Employee>(new EmployeeComparator());
		employees2.add(new Employee(121,"Mark",12000,"AA1001"));
		employees2.add(new Employee(101,"Ajoop",12000,"AA1001"));
		employees2.add(new Employee(102,"Jhon",13000,"AB1002"));
		employees2.add(new Employee(321,"Pooja",15000,"AC1003"));
		employees2.add(new Employee(421,"Tota",19000,"AD1004 "));
		System.out.println(employees2);
	}

}
//comparable-to provide natural ordering to objects
//comparator-to  change the natural ordering
class StringComparator implements Comparator<String>{
	
	@Override
public int compare(String str1, String str2) {
	int l1=str1.length();
	int l2=str2.length();
	if(l1<l2) {
		return -1;
	}else if(l1>l2) {
		return 1;
	}else {
//		return 0;
		return str1.compareTo(str2); //gives the natural ordering
	}
 }
}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;	
	String aadharno;
	
	Employee(int id, String name, double salary, String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
	@Override
	public String toString() {
		return this.id + "|"+this.name+"|"+this.salary+"|"+this.aadharno;
	}
	@Override
	public int compareTo(Employee o) {
	  return this.id < o.id ? -1: this.id>o.id ? 1:0;
	}
 }

class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}



