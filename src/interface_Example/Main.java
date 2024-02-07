package interface_Example;

interface Shape {
	void draw();

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing a cilrcle.");

	}

}

class Rectingle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing rectingle. ");

	}

}

public class Main {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape rectingle = new Rectingle();

		rectingle.draw();
		circle.draw();

	}

}
