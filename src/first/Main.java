package first;

class Motorcycle{
	final static int speedlimit_new_word;
	
	static {
		speedlimit_new_word = 90;
	}
	



	final void	drive() {
	System.out.println("driving.......");
	}
}
public class Main extends Motorcycle{
	
	

	public static void main(String[] args) {
	
			Motorcycle m = new Motorcycle();
			m.drive();
			

	}

}
