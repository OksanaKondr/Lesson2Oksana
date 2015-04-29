
public class Lesson2Oksana {

	public static void main(String[] args) {
		
		int [] a = new int[args.length];
		
		Toast Toast1 = new Toast("Toast with Strawberry Jam", 3);
		Coffee Coffee1 = new Coffee("Irish Coffee", 2);
		
		Toast toast;
		Coffee coffee;
		
		toast = Toast1;
		coffee = Coffee1;
			
		for (int i=0; i < args.length; i++) {
		
		try {	
			
			switch(args[i]) {	
			
			    case "-v": 
			    	 System.out.print("The Java program version is ");
			    	 System.out.println(System.getProperty("java.version"));
			         break;
			    
			    case "-h": 
				     System.out.println("Accepted commands:");
				     System.out.println("-h: To see the list of accepted commands.");
				     System.out.println("-v: To see the Java program version.");
				     System.out.println("-makeCoffee n: To see the number of prepared cups of coffee.");
				     System.out.println("-makeToast n: To see the number of prepared toasts.");			  
				     break;
				     
			    case "-makeCoffee":
			    {	    
			    	try {
			    		 if (i == args.length-1) 
			    			 {
			    			  Coffee1.make(1);
			    			  break;
			    			 }
			    	     a[i+1] = Integer.parseInt(args[i+1]);
			    	     Coffee1.make(a[i+1]);
			    	    } catch (NumberFormatException e)
			            { 
			    		 Coffee1.make(1); 
			            }
			    	     break;
			    }	 
				     
			    case "-makeToast":
			    {
			    	try {
			    		 if (i == args.length-1) 
		    			     {
		    			      Toast1.make(1);
		    			      break;
		    			     }
			    		 a[i+1] = Integer.parseInt(args[i+1]);
				    	 Toast1.make(a[i+1]); 	
			    	    } catch (NumberFormatException e)
			            { 
			    		 Toast1.make(1); 
			            }
				    	 break;
			    }
			   
			    default:
			    	break;
			}
			
			}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong input parameters!");		
		}
		
		}
		
	}

}

