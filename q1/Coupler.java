import java.util.*;
import java.io.*;
import java.sql.Timestamp;

public class Coupler{
	
	//This class is coupling girls with boys
	public static void main(String args[]) throws IOException{
		Boy boys[] = new Boy[12];
		Girl girls[] = new Girl[6];
		File file = new File("boys.csv");
		BufferedReader br = new BufferedReader(new FileReader("boys.csv"));
		String line;
		int i=0,j=0;
		
		//creating boys array with attributes taken from csv file which was generated randomly
		while ((line = br.readLine()) !=null){
			String[] array = line.split(",");
			boys[i] = new Boy(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
			Integer.parseInt(array[3]),Integer.parseInt(array[4]));
			i++;
		}
		br.close();  
		br = new BufferedReader(new FileReader("girls.csv"));
                i=0;
                while ((line = br.readLine()) !=null){
                        String[] array = line.split(",");
                        girls[i] = new Girl(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
                        Integer.parseInt(array[3]));
                        i++;
                }
                br.close();
		PrintWriter writer = new PrintWriter("logger.csv","UTF-8");
		
		//coupling girls with boys with given constraints
		for(i=0; i<6; i++){
			for(j=0; j<12; j++){
				Date date = new Date();
        			writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
				writer.println(girls[i].name+" is checking out "+boys[j].name);
				if(boys[j].status == "single" && girls[i].main_budget <= boys[j].main_budget && 
				girls[i].attractiveness >= boys[j].min_att_requir ){
					boys[j].status = "InRelationship";
					girls[i].bf_name = boys[j].name;
					date = new Date();
                			writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
					writer.println(girls[i].name+" checked out successfully and now is in relation with "+boys[j].name);
					break;
				}
			}
		}
		writer.close();
	}
}
