

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
	/*TESTER FUNCTION
	public static void main(String args[]){
		Boy Amit =new Boy("Amit",5,1,4,7);
		System.out.println(Amit.name + "" + Amit.attractiveness+Amit.min_att_requir);
	}*/
}
