/**
* This class sorts the gift according to their price
* so that it can be used to be allocated to girls
* according to the given algorithm.
* @author  Anurag Kumar 
*/

public class Giftsort{
	public Giftsort(Gift[] gifts){
                for(int i=0; i<100; i++){
                        gifts[i] = new Gift((int)(Math.random()*3),(int)(Math.random()*10 + 1),
                        (int)(Math.random()*10 + 1),(int)(Math.random()*100 + 1),(int)(Math.random()*100 + 1));
                }
		for(int i=0; i<100; i++){
                        for(int j=0; j<99; j++){
                                if(gifts[j].price > gifts[j+1].price){
                                        Gift temp;
                                        temp = gifts[j];
                                       	gifts[j]=gifts[j+1];
                                        gifts[j+1]=temp;
                                }
                        }
                }
	}
}
