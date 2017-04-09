public class Desperate extends Girl{
	public Desperate(String na, int attr,int main,int in){
		super(na,attr,main,in);
	}

	public long happiness(Couple couple){
		return (long)Math.exp(couple.boy.spent);
	}
	
}
