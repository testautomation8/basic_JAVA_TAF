
public class java_basics {

	public static void main(String[] args) {
		
		final int c; // Variable marked as final cannot be re-assigned
		c=10;
		System.out.println("Value of C is " + c);
		
		//Inheritance example
		/*Child have inherited father so able to use its own function as well
		as of father however vice-versa is not true
		*/
		Child chl = new Child();
		chl.country_func();
		chl.professsion_func();// Function belong to father
		Father fth = new Father();
		fth.country_func();
		System.out.println(chl.postcode); // Belongs to father
		System.out.println(chl.street);
		
		
		GrandChild gc = new GrandChild();
		gc.country_func();
		gc.professsion_func();//Belong to Father
		System.out.println(gc.postcode); // Belongs to father
		System.out.println(gc.street);//Belongs to Child
		System.out.println(gc.building);
		
		//Getter Setter Example
		 
		GetterSetter getset = new GetterSetter();
		getset.setName("This is new name");
		System.out.println("The new name is "+ getset.getName());
		
		
	
		
	}

}
