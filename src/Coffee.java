
public class Coffee extends Drink {
	
    public Coffee(String CoffeeName, int CoffeeNumber) {
		
		super(CoffeeName, CoffeeNumber);
		
	}
    
    @Override
    int make(int CoffeeNumber) {
		
    	if (CoffeeNumber == 1)
			System.out.println(+CoffeeNumber+" cup of coffee has been prepared");
		else
    	System.out.println(+CoffeeNumber+" cups of coffee have been prepared");
    	return CoffeeNumber;
    	
	}

}
