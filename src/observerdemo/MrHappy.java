package observerdemo;

public class MrHappy implements Observer {
	
	public MrHappy(Observable observable) {
		observable.register(this);
	}

	@Override
	public void upDate() {
		System.out.println("NEW MESSAGE. Can't believe it. Drop everything and come look!!!!");
	}

}
