package com.projectname.scripts;
import java.io.FileWriter;
import java.io.IOException;


public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");
		generateCsvFile("C://Users//Administrator//Desktop//New folder//data.csv"); 

	}

	
	 private static void generateCsvFile(String sFileName)
	   {
		try
		{
		    FileWriter writer = new FileWriter(sFileName);
	 
		    writer.append("data");
		    writer.append(',');
		    writer.append("value");
		    writer.append('\n');
	 
		    writer.append("Santhosh");
		    writer.append(',');
		    writer.append("26");
	            writer.append('\n');
	 
		    writer.append("Sathish");
		    writer.append(',');
		    writer.append("29");
		    writer.append('\n');
	 
		    //generate whatever data you want
	
		    writer.flush();
		    writer.close();
		    System.out.println("file created");
		}
		catch(IOException e)
		{
		     e.printStackTrace();
		} 
	    }
}
