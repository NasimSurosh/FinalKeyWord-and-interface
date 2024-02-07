package mulitipleInheretance_withInterfaces;

interface Shape {
 
	void draw();
	 
  default void msg() {
	  System.out.println("Default method.");
  }
}
class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a circle ");
		
	}
}
	public class Doc1{
		public static void main(String args[]) {
			Shape shape = new Circle();
			
			shape.draw();
			shape.msg();
			
		
	}
	
}
