public class Miser extends Boy{
	public Miser(String na, int attr,int main,int in,int min){
		super(na, attr,main, in,min);
	}

	public long happiness(Couple couple){
		return (couple.boy.main_budget - couple.boy.spent);
	}	
}
