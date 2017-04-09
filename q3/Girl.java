

public class Girl{
	String name;
	int attractiveness;
	int main_budget;
	int intelligence;
	String bf_name;
	public Girl(String na, int attr,int main,int in){
		name = na;
		attractiveness= attr;
		main_budget = main;
		intelligence = in;
		bf_name="";
	}
	public long happiness(Couple couple){
		return 0;
	}
	/*TESTER FUNCTION
	public static void main(String args[]){
		Girl Maran =new Girl("Komala",5,1,4);
		System.out.println(Maran.name + "" + Maran.attractiveness+Maran.intelligence);
	}*/
}
