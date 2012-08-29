
public class GreeterTest {
	public static void main (String args[]) {
		Greeter worldGreeter = new Greeter("World");
		String helloWorld = worldGreeter.sayHello();
		System.out.println(helloWorld);
	}

}

