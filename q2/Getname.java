/**
* This class returns the name of the gift based on the
* value of type.
*
* @author  Anurag Kumar 
*/

public class Getname{
	public String get(int i){
		if(i==0)
			return "Essential gift";
		else if(i==1)
			return "Luxury gift";
		else
			return "Utility gift";
	}
}
