 package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
	public static void main(String[] args) {
	
//		fileInputStreamDemo();
//		fileOutputStreamDemo();
//		fileReaderDemo();
//		fileWriterDemo();
		bufferReaderDemo() ;

	} 
static void fileInputStreamDemo()  {
	int i;
	File myfile = new File("C:\\Users\\ptamragouri\\Documents\\check.txt");
	try {
		FileInputStream fis=  new FileInputStream(myfile);
		System.out.println("File opened");
		System.out.println("-----------------");
		while((i=fis.read())!=-1){
			System.out.print((char) i);
		}
		fis.close();
	
	}catch(FileNotFoundException e) { 
		e.printStackTrace();
	}catch (IOException ex) {
		ex.printStackTrace();
//		System.out.println("Exception occured "+ex.getMessage());
	}
	
}
static void fileOutputStreamDemo() {
	int i;
	File myfile = new File("C:\\Users\\ptamragouri\\Documents\\check.txt");
	try {
		FileOutputStream fos=  new FileOutputStream(myfile);
		System.out.println("File opened");
		System.out.println("-----------------");
		String data = "From the program";
		byte[] dataByteArray = data.getBytes();
		fos.write(dataByteArray);
		fos.close();
	}catch(FileNotFoundException e) { 
		e.printStackTrace();
	}catch (IOException ex) {
		ex.printStackTrace();

	}
}

static void fileReaderDemo() {
	int i;
	File myfile = new File("C:\\Users\\ptamragouri\\Documents\\check.txt");
	try {
		FileReader fr=  new FileReader(myfile);
		System.out.println("File opened");
		System.out.println("-----------------");
		while((i=fr.read())!=-1){
			System.out.print((char) i);
		}
		fr.close();
	
	}catch(FileNotFoundException e) { 
		e.printStackTrace();
	}catch (IOException ex) {
		ex.printStackTrace();

	}
}
static void fileWriterDemo() {
	int i;
	File myfile = new File("C:\\Users\\ptamragouri\\Documents\\check.txt");
	try {
		FileWriter fw=  new FileWriter(myfile);
		System.out.println("File opened");
		System.out.println("-----------------");
		fw.write("Using file writer to write\n");
		fw.write("Using file writer to write one more line");
		fw.close();
	}catch(FileNotFoundException e) { 
		e.printStackTrace();
	}catch (IOException ex) {
		ex.printStackTrace();

	}
	
}

static void bufferReaderDemo() {
	String line;
	File myfile = new File("C:\\Users\\ptamragouri\\Documents\\check.txt");
	try {
		FileReader fr=  new FileReader(myfile);
		BufferedReader br= new BufferedReader(fr);
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
	
	}catch(FileNotFoundException e) { 
		e.printStackTrace();
	}catch (IOException ex) {
		ex.printStackTrace();

	}
}
}


