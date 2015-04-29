
public class Toast extends Food {
	
	public Toast(String ToastName, int ToastNumber) {
		
		super(ToastName, ToastNumber);
		
	}
	
	@Override
    int make(int ToastNumber) {
		
		if (ToastNumber == 1)
			System.out.println(+ToastNumber+" toast has been prepared");
		else
    	System.out.println(+ToastNumber+" toasts have been prepared");
		return ToastNumber;
    	
	}

}
