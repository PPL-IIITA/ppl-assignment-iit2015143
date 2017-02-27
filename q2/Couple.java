/**
* This class defines attributes of a couple and has
* a constructor method
*
* @author  Anurag Kumar 
*/

public class Couple{
	Boy boy;
	Girl girl;
	int compatibility;
	long happiness;
	Gift[] gifts= new Gift[100];
	int n_o_gifts;
	public Couple(Boy a, Girl b){
		boy = a;
		girl  = b;
		compatibility = (boy.main_budget-girl.main_budget)+Math.abs(boy.attractiveness-girl.attractiveness)+ 
		Math.abs(boy.intelligence - girl.intelligence);
		happiness = 0;
		n_o_gifts=0;
	}
}
