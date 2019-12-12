package observerdemo;

public class MrTaxiDriver implements Observer {
	
	public MrTaxiDriver(Observable observable) {
		observable.register(this);
	}

	@Override
	public void upDate() {
		System.out.println("You talking to me?");
	}

}
