import java.util.*;
import java.io.*;
import java.sql.Timestamp;

public class Coupler{

//q1 part
	public static void main(String args[]) throws IOException{
		Boy boys[] = new Boy[12];
		Girl girls[] = new Girl[6];
		File file = new File("boys.csv");
		BufferedReader br = new BufferedReader(new FileReader("boys.csv"));
		String line;
		int i=0,j=0;
		while ((line = br.readLine()) !=null){
			String[] array = line.split(",");
			int type = type = (int)(Math.random()*3);
			switch(type){
				case 0: 
					boys[i] = new Miser(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
					Integer.parseInt(array[3]),Integer.parseInt(array[4]));
					break;
				case 1:
					boys[i] = new Generous(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
					Integer.parseInt(array[3]),Integer.parseInt(array[4]));
					break;
				case 2:
					boys[i] = new Geeks(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
					Integer.parseInt(array[3]),Integer.parseInt(array[4]));
					break;
			}
			
			i++;
		}
		br.close();  
		br = new BufferedReader(new FileReader("girls.csv"));
                i=0;
                while ((line = br.readLine()) !=null){
                        String[] array = line.split(",");
			int type = type = (int)(Math.random()*3);
			switch(type){
				case 0: 
					girls[i] = new Choosy(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
                        		Integer.parseInt(array[3]));
					break;
				case 1:
					girls[i] = new Normal(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
                        		Integer.parseInt(array[3]));
					break;
				case 2:
					girls[i] = new Desperate(array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]),
                        		Integer.parseInt(array[3]));
					break;
			}
                        
                        i++;
                }
                br.close();
		PrintWriter writer = new PrintWriter("logger.csv","UTF-8");

//Making couples and storing them in Couple type array
		int k=0;
		Couple couples[] = new Couple[10];
		for(i=0; i<6; i++){
			for(j=0; j<12; j++){
				Date date = new Date();
        			writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
				writer.println(girls[i].name+" is checking out "+boys[j].name);
				if(boys[j].status == "single" && girls[i].main_budget <= boys[j].main_budget && 
				girls[i].attractiveness >= boys[j].min_att_requir ){
					couples[k]= new Couple(boys[j],girls[i]);
					k++;
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

//q2 starts from here
//Compatibility printing and sorting issue
		System.out.println(k + " couples have been formed enter k less than " +k+ " for 3rd part's ansr or 0 for nothing");
		int p;
		Scanner scan = new Scanner(System.in);
		p =  scan.nextInt();
		SortCouple sortcouple= new SortCouple(couples,k);
		if(p>k)
			p=k;
		for(i=0; i<p; i++){
			if(i==0)
				System.out.println("\nCouples sorted by Compatibility:\n");
                        System.out.println(couples[i].boy.name + " in relation with " + couples[i].girl.name + " with compatibility: " + couples[i].compatibility);
                }

//Gifting printing and sorting issue

                Gift gifts[] = new Gift[100];
		Gift a = new Essential(2,5 ,5,4,8);
		Gift b = new Luxury(2,5 ,5,4,8);
		Gift c = new Utility(2,5 ,5,4,8);
		Giftsort giftsort = new Giftsort(gifts);
		Allocategifts allocategifts = new Allocategifts(gifts,couples,k);

//Happiness calculation
		Calculatehappy calculatehappy = new Calculatehappy(couples,k);
		SortcoupleH sortcoupleh = new SortcoupleH(couples, k);
		for(i=0; i<p; i++){
			if(i==0)
				System.out.println("\nCouples sorted by Happiness:\n");
                        System.out.println(couples[i].boy.name + " in relation with " + couples[i].girl.name + 
			" with happiness: " + couples[i].happiness);
                }
		
	}
}
