

public class Girl{
	String name;
	int attractiveness;
	int main_budget;
	int intelligence;
	String bf_name;
	int type;
	public Girl(String na, int attr,int main,int in){
		name = na;
		attractiveness= attr;
		main_budget = main;
		intelligence = in;
		bf_name="";
		type = (int)(Math.random()*3);
	}
	/*TESTER FUNCTION
	public static void main(String args[]){
		Girl Maran =new Girl("Komala",5,1,4);
		System.out.println(Maran.name + "" + Maran.attractiveness+Maran.intelligence);
	}*/
}
