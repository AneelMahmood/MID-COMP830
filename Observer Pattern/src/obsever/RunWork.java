package obsever;

public class RunWork{

	public static void main(String[] args) {
		// Creating manager and workers
		WorkManagerImplementation workManager = new WorkManagerImplementation();
		Worker worker1 = new Worker(1);
		Worker worker2 = new Worker(2);
		Worker worker3 = new Worker(3);
		Worker worker4 = new Worker(4);
		
		// Adding all the workers to the manager
		workManager.addObserver(worker1);
		workManager.addObserver(worker2);
		workManager.addObserver(worker3);
		workManager.addObserver(worker4);
		
		// Creating the work items and notifying the manager
		workManager.setWorkItem(new WorkItem("1", 1, "Get milk"));
		workManager.notifyObservers();
		
		workManager.setWorkItem(new WorkItem("3", 3, "Put the milk in the fridge"));
		workManager.notifyObservers();
		
		workManager.setWorkItem(new WorkItem("5", 0, "Close the fridge"));
		workManager.notifyObservers();
	}

}