public class Breakup{
	public Breakup(Couple couples[], int p, int k){
		for(int i=k-1; i>=k-p; i--){
			couples[i].girl.ex = couples[i].boy.name;
			couples[i].girl.bf_name="";
			couples[i].boy.status = "single";
			couples[i].boy.spent = 0;
			System.out.println(couples[i].girl.name + " broke up with " + couples[i].boy.name);
			couples[i] = null;
		} 
	}
}
