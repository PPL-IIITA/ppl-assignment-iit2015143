public class Geeks extends Boy{
	public Geeks(String na, int attr,int main,int in,int min){
		super(na, attr,main, in,min);
	}

	public long happiness(Couple couple){
		return couple.girl.intelligence;
	}	
}
