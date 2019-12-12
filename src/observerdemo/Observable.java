package observerdemo;

public interface Observable {

	public void register(Observer observer);
	public void deRegister (Observer observer);
	public void notifyObervers();
}
