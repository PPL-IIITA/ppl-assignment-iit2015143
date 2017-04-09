//SortCouple sortcouple= new SortCouple(couples);
public class SortCouple{
	public SortCouple(Couple[] couples, int k){
		for(int i=0; i<k; i++){
                        for(int j=0; j<k-1; j++){
                                if(couples[j].compatibility < couples[j+1].compatibility){
                                        Couple temp;
                                        temp = couples[j];      
                                        couples[j]=couples[j+1];
                                        couples[j+1]=temp;
                                }
                        }
                }

	}
}
