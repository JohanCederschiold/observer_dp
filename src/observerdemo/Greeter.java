package observerdemo;

import java.util.ArrayList;
import java.util.List;

public class Greeter implements Observable {
	
	private List<Observer> observers = new ArrayList<>();
	private String message = "This is a standard message. Stand by for awesomeness";
	

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deRegister(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObervers() {
		for (Observer observer : observers) {
			observer.upDate();
		}
	}

	public void setMessage(String message) {
		this.message = message;
		notifyObervers();
	}
	
	
	

	
	
}
