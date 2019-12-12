package observerdemo;

public class MrGrumpy implements Observer {
	
	public MrGrumpy(Observable observable) {
		observable.register(this);
	}

	@Override
	public void upDate() {
		System.out.println("Why do you bother me. I don't care!!!!");
	}
}
