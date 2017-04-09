import java.util.*;
import java.io.*;
import java.sql.Timestamp;

public class Allocategifts {
	public Allocategifts(Gift[] gifts,Couple[] couples,int k) throws IOException{
		int i;
		PrintWriter writer = new PrintWriter("logger_2.csv","UTF-8");
		Getname getname = new Getname();
		for(i=0; i<k; i++){
			if(couples[i].boy instanceof Miser){
				int l=0;
				while(couples[i].boy.spent <= couples[i].girl.main_budget){
					if(couples[i].boy.spent + gifts[l].price > couples[i].boy.main_budget)
						break;
					couples[i].gifts[l]= gifts[l];
					couples[i].boy.spent += gifts[l].price;
					Date date = new Date();
        				writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
					writer.println(couples[i].boy.name + " gifted " + getname.get(gifts[l].type) + " to " + 
					 couples[i].girl.name);
					l++;
					couples[i].n_o_gifts = l;
				}
			}
			else if(couples[i].boy instanceof Generous){
				int l=0;
				while(couples[i].boy.spent + gifts[l].price <= couples[i].boy.main_budget){
					couples[i].gifts[l]= gifts[l];
                                        couples[i].boy.spent += gifts[l].price;
					Date date = new Date();
        				writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
					writer.println(couples[i].boy.name + " gifted " + getname.get(gifts[l].type) + " to " + 
					 couples[i].girl.name);
                                        l++;
					couples[i].n_o_gifts = l;
				}
			}
			else{
				int l=0;
                                while(couples[i].boy.spent <= couples[i].girl.main_budget){
                                        if(couples[i].boy.spent + gifts[l].price > couples[i].boy.main_budget)
                                                break;
                                        couples[i].gifts[l]= gifts[l];
                                        couples[i].boy.spent += gifts[l].price;
					Date date = new Date();
        				writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
					writer.println(couples[i].boy.name + " gifted " + getname.get(gifts[l].type) + " to " + 
					 couples[i].girl.name);
                                        l++;
					couples[i].n_o_gifts = l;
                                }
				int p=l;
				while(l<= gifts.length){
					if(couples[i].boy.spent + gifts[l].price > couples[i].boy.main_budget)
						break;
					if(gifts[l].type==1){
						couples[i].gifts[p]= gifts[l];
						couples[i].n_o_gifts = p+1;
                                        	couples[i].boy.spent += gifts[l].price;
						Date date = new Date();
						writer.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
						writer.println(couples[i].boy.name + " gifted " + getname.get(gifts[l].type) + " to " + 
						 couples[i].girl.name);
						writer.println("luxury gift given budget allowed");
						break;
					}
					l++;
				}
			}
		}
		writer.close();
	}
}
