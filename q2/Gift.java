/**
* This class defines attributes of a gift and has
* a constructor method
* @author  Anurag Kumar 
*/

public class Gift{
	int type;
	int price;
	int value;
	int lux_rating;
	int lux_diff;
	int util_value;
	int util_class;

	public Gift(int t, int p, int v, int l_r , int l_d){
                type = t;
                price =p;
                value = v;
		if(t==1){
                	lux_rating = l_r;
                	lux_diff= l_d;
                	util_class= 0;
                	util_value = 0;
		}
		else if(t==2){
                        lux_rating = 0;
                        lux_diff= 0;
                        util_value= l_r;
                        util_class= l_d;
                }
		else{
			lux_rating = 0;
                        lux_diff= 0;
                        util_value= 0;                        
                        util_class= 0;
		}

        }
	

}


