package corejava;

public class Execution {
	
	public static void main (String[] args) {
		//object creation  of a class
		
		Computer refVar = new Computer();
		//class name + reference variable = new + constructor
		refVar.Model = "Asus";
		
		
		System.out.println(refVar.Model);
		System.out.println(refVar.display);
		System.out.println(refVar.Keys);
		
	}

}
