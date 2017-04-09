public class Normal extends Girl{
	public Normal(String na, int attr,int main,int in){
		super(na,attr,main,in);
	}
	public long happiness(Couple couple){
		long ans = couple.boy.spent;
					
                for(int l=0; l<couple.n_o_gifts; l++)
                	ans += couple.gifts[l].value;
		return ans;
	}
}
