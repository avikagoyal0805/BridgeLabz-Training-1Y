class TypesofVariable{
	
	int id = 10; // INSTANCE VARIABLE
	String name = "Avika";  // INSTANCE VARIABLE
	
	int rollNo; //instance variable
	
	static int age = 18; // STATIC VARIABLE
	
	void display()  //METHOD
	{
		String status = "Active";  //LOCAL VARIABLE
		System.out.println("Status: "+status);  //PRINTING STATEMENT
	}
	public static void main(String args[]){  //MAIN METHOD
		
		TypesofVariable var= new TypesofVariable();
		var.display(); //non static method so we have to create object
		var.rollNo=20; //instance variable access using object
		
		System.out.println(age); //static variable access without any object                                                                 
		
		
		
		
		
		
		
		
	}
}