package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Creating an object to the streams-->ObjectOutputSream
public class SerializationDemo {
	public static void main(String[] args) {
		
//		Employee emp=new Employee(1,"Mark",12000,"AA1001");
//		System.out.println(emp);
//		Employee emp2=new Employee(2,"John",15000,"AB1001");
//		System.out.println(emp2); whenever object is inside the sysout ->toString() method is called.
		
//		SerializationDemo();
		SerializationDemoSimplified();
		DeserializatioDemo();
		}
	
	private static void DeserializatioDemo() {
		try(FileInputStream fis= new FileInputStream ("C:\\Users\\ptamragouri\\Documents\\ObjectStreams\\emp.scr");
				ObjectInputStream ois=new ObjectInputStream (fis);) {	
			Employee emp= (Employee) ois.readObject();
			System.out.println("Object Deserialized-"+emp);
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace(); 
	    	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	    }
	
	

	private static void SerializationDemo() {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos= new FileOutputStream("C:\\Users\\ptamragouri\\Documents\\ObjectStreams\\emp.scr");
			oos=new ObjectOutputStream (fos);
			Employee emp1=new Employee(1,"Mark",12000,"AA1001");
			oos.writeObject(emp1);
			System.out.println("Object serialized");
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
        }finally {
        	try {
        		 oos.close();
        		 fos.close(); 
        	}catch(IOException e) {
        		e.printStackTrace();
        	}
        }
       
	}


private static void SerializationDemoSimplified() {
	//try-with block(AutoCloseable)
	try(FileOutputStream fos= new FileOutputStream("C:\\Users\\ptamragouri\\Documents\\ObjectStreams\\emp.scr");
			ObjectOutputStream oos=new ObjectOutputStream (fos);) {	
		Employee emp1=new Employee(1,"Ajoooop",19000,"AB1001009");
		oos.writeObject(emp1);
		System.out.println("Object serialized");
	
}catch(FileNotFoundException e) {
	e.printStackTrace();
}catch (IOException e) {
	e.printStackTrace(); 
    	}
    }
}



//Marker Interface
class Employee implements Serializable{
	int id;
	String name;
	double salary;	
	transient String aadharno;
	
	Employee(int id, String name, double salary, String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
	public String toString() {
		return this.id + "|"+this.name+"|"+this.salary+"|"+this.aadharno;
	}
 }
