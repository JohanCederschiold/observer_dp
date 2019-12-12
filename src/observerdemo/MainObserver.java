package observerdemo;

import java.util.Scanner;

public class MainObserver {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		MrGrumpy grumpy = new MrGrumpy(greeter);
		MrHappy happy = new MrHappy(greeter);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print new Message");
		greeter.setMessage(sc.nextLine());
		
		MrTaxiDriver high = new MrTaxiDriver(greeter);
		
		System.out.println("Print second Message");
		greeter.setMessage(sc.nextLine());
		
		greeter.deRegister(grumpy);
		
		System.out.println("Print second Message");
		greeter.setMessage(sc.nextLine());
		
	}

}
