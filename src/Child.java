// this is the example of single inheritance
public class Child extends Father {
	
	String street="Automation Street";
	
	//This is function Overriding
	public void country_func()
	{
		System.out.println("I am Child country function");
		//Use of Super Keyword to access methods and properties of Parent Class
		System.out.println("Use of Super Keyword "+ super.postcode);
	}

}
