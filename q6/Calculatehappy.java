public class Calculatehappy{
	public Calculatehappy(Couple[] couples,int k){
		int i;
		for(i=0; i<k ; i++){
			couples[i].happiness = Math.abs(couples[i].girl.happiness(couples[i]));
			couples[i].happiness += Math.abs(couples[i].boy.happiness(couples[i]));
			couples[i].happiness = Math.abs(couples[i].happiness);
		}
	}
}
