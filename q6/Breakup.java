public class Breakup{
	public Breakup(Couple couples[], int d_o_m, int k){
		for(int i=0; i<k; i++){
			if(couples[i].happiness < d_o_m){
				couples[i].girl.ex = couples[i].boy.name;
				couples[i].girl.bf_name="";
				couples[i].boy.status = "single";
				couples[i].boy.spent = 0;
				System.out.println(couples[i].girl.name + " broke up with " + couples[i].boy.name);
				couples[i] = null;
			}
		} 
	}
}
