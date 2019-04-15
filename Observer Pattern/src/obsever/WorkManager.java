package obsever;

public interface WorkManager {

	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}