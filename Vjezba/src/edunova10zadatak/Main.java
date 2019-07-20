package edunova10zadatak;

class Base{
	int x;
	Base(int x){
		this.x = x;
	}
}

class Derived extends Base{
	int y;
	Derived(int x, int y){
		super(x);
		this.y = y;
	}
	void Display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

public class Main {

	public Main() {
		Derived d = new Derived(10, 20);
		d.Display();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
