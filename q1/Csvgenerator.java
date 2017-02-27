/**
* This class generates csv files randomly which is further 
* used by other classes
* @author  Anurag Kumar 
*/

import java.util.*;
import java.io.*;

public class Csvgenerator{
	public static void main(String args[]){
		
		//This class is generating csv file with the given name and randomly generated attributes
		
		String[] girls={"Ritika","Riddhima","Vaishnavi","Arpita","Nikita","Deepika"};
		String[] boys = {"Anurag","Shyam","Katta","Santosh","Ankit","Sarwar","Vidya","Raghav","Rachit","Pawan","Ramu","Raju"}; 

		try{
			PrintWriter writer = new PrintWriter("girls.csv", "UTF-8");
			for(int i=0; i<6; i++){
				writer.println(girls[i]+","+(int)(Math.random()*10 + 1)+","+ 
				(int)(Math.random()*100 + 1)+","+ (int)(Math.random()*5 + 1) );
			}
			writer.close();
			
			writer = new PrintWriter("boys.csv", "UTF-8");
                        for(int i=0; i<12; i++){
                                writer.println(boys[i]+","+(int)(Math.random()*10 + 1)+","+
                                (int)(Math.random()*100 + 1)+","+ (int)(Math.random()*5 + 1)+","+(int)(Math.random()*10 + 1) );
                        }
                        writer.close();

		} 
		catch (IOException e) {
			System.out.println("Some error occurred");
		}
	}
}
