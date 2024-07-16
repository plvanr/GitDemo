
public class BasicJava1 implements CentralTraffic,Usa {

	public static void main(String[] args) {
		//Object in Java
		
		BasicJava2 obj = new BasicJava2();
		
		System.out.println(obj.ValidateHeader());
		System.out.println(obj.ValidaeFooter());
		
		
		//Strings in Java
		
		String str = "Payment $100 paid";
		
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf("$"));
		System.out.println(str.substring(8));
		
		// Print String in Reverse
		
		String str1 = "madam";
		String dummy = "";
		
		for (int i=str1.length()-1;i>=0; i-- ) 
		{
			
			dummy = dummy+str1.charAt(i);
		}
		if(str1==dummy) 
		{
			System.out.println("String is Palindrome");
		}
		else 
		{
			System.out.println("String is not Palindrome");
		}
		
		
		//Interface
		CentralTraffic a = new BasicJava1();
		a.RedStop();
		a.GreenGo();
		a.YellowSlowDown();
		
		Usa b = new BasicJava1();
		b.Walking();
		b.WalkSign();
		
		
		//Inheritance
		
		//Array
		
		int array[] = new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		for(int i=0;i<array.length;i++) 
		{
			System.out.println(array[i]);
		}
		
		int x=1;
		int y=2;
		int z=3;
		
		if (x>=y && x>=z) 
		{
			System.out.println(x +" x is the largest number");
		}
		else if (y>=x && y>=z)
		{
			System.out.println(y+" y is the largest number");
		}
		else 
		{
			System.out.println(z +" z is the largest number");
		}
		
	
	}

	
	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop Implemention ");
		
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo Implemention ");
	}

	@Override
	public void YellowSlowDown() {
		// TODO Auto-generated method stub
		System.out.println("YellowSlowDown Implemention ");
	}

	@Override
	public void WalkSign() {
		// TODO Auto-generated method stub
		System.out.println("Walk Sign is on");
		
	}

	@Override
	public void Walking() {
		// TODO Auto-generated method stub
		System.out.println("Walk Sign is off");
	}
	
}

