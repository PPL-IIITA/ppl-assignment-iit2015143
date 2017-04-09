public class Choosy extends Girl{
	public Choosy(String na, int attr,int main,int in){
		super(na,attr,main,in);
	}
	public long happiness(Couple couple){
		long ans = (long)Math.log(couple.boy.spent);
					
		for(int l=0; l<couple.n_o_gifts; l++){
			if(couple.gifts[l].type == 1)
				ans += couple.gifts[l].price;
		}
		return ans;
	}
}
