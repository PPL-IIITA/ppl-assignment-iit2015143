/**
* This class defines attributes of a boy and has
* a constructor method
* @author  Anurag Kumar 
*/
public class Boy{
	String name;
	int attractiveness;
	int main_budget;
	int intelligence;
	int min_att_requir;
	String status;
	public Boy(String na, int attr,int main,int in,int min){
		name = na;
		attractiveness= attr;
		main_budget = main;
		intelligence = in;
		min_att_requir = min;
		status = "single";
	}
}
