package mulitipleInheretance_withInterfaces;

interface Print {
	void print();
	

}
interface Display{
	void display();
}
public class Doc implements Print, Display{

	@Override
	public void display() {
		System.out.println("Dispaly only....");
		
	}

	@Override
	public void print() {
		System.out.println("Printing.....");
		
	}
	public static void main(String args[]) {
		
		Doc doc = new Doc();
		
		
		doc.display();
		doc.print();
		
	}
	
}
