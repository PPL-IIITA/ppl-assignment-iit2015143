//SortCouple sortcouple= new SortCouple(couples);
public class SortcoupleH{
	public SortcoupleH(Couple[] couples, int k){
		for(int i=0; i<k; i++){
                        for(int j=0; j<k-1; j++){
                                if(couples[j].happiness < couples[j+1].happiness){
                                        Couple temp;
                                        temp = couples[j];      
                                        couples[j]=couples[j+1];
                                        couples[j+1]=temp;
                                }
                        }
                }

	}
}
