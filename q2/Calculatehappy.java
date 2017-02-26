public class Calculatehappy{
	public Calculatehappy(Couple[] couples,int k){
		int i;
		for(i=0; i<k ; i++){
			if(couples[i].boy.type == 0){
				couples[i].happiness =  couples[i].boy.main_budget - couples[i].boy.spent;
				
				if(couples[i].girl.type == 0){
					couples[i].happiness += (int)Math.log(couples[i].boy.spent);
					
					for(int l=0; l<couples[i].n_o_gifts; l++){
						if(couples[i].gifts[l].type == 1)
							couples[i].happiness += couples[i].gifts[l].price;
					}
				}
				else if(couples[i].girl.type == 1){
                                        couples[i].happiness += couples[i].boy.spent;
					
                                        for(int l=0; l<couples[i].n_o_gifts; l++)
                                        	couples[i].happiness += couples[i].gifts[l].value;
                                }
				else
					couples[i].happiness += (int)Math.exp(couples[i].boy.spent);
	
			}
			else if(couples[i].boy.type == 1){
                                if(couples[i].girl.type == 0){
                                        couples[i].happiness += (int)Math.log(couples[i].boy.spent);
                                        for(int l=0; l<couples[i].n_o_gifts; l++){
                                                if(couples[i].gifts[l].type == 1)
                                                        couples[i].happiness += couples[i].gifts[l].price;
                                        }
                                }
                                else if(couples[i].girl.type == 1){
                                        couples[i].happiness += couples[i].boy.spent;
                                        for(int l=0; l<couples[i].n_o_gifts; l++)
                                                couples[i].happiness += couples[i].gifts[l].value;
                                }
                                else
                                        couples[i].happiness += (int)Math.exp(couples[i].boy.spent);
				couples[i].happiness = 2*couples[i].happiness;
                	}
			else{
                                couples[i].happiness =  couples[i].girl.intelligence;
                                if(couples[i].girl.type == 0){
                                        couples[i].happiness += (int)Math.log(couples[i].boy.spent);
                                        for(int l=0; l<couples[i].n_o_gifts; l++){
                                                if(couples[i].gifts[l].type == 1)
                                                        couples[i].happiness += couples[i].gifts[l].price;
                                        }
                                }
                                else if(couples[i].girl.type == 1){
                                        couples[i].happiness += couples[i].boy.spent;
					for(int l=0; l<couples[i].n_o_gifts; l++)
                                                couples[i].happiness += couples[i].gifts[l].value;
                                }
                                else
                                        couples[i].happiness += (int)Math.exp(couples[i].boy.spent);
                        }

		}
	}
}
