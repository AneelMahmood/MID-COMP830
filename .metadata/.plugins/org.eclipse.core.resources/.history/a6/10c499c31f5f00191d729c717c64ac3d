package obsever;

import java.util.ArrayList;

import java.util.List;

public class WorkManagerImplementation implements WorkManager {

	private List<Observer> observers;
	private WorkItem WorkItem;
	
	
	public WorkManagerImplementation() {
		observers = new ArrayList<>();
	}
	
    
    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
        	observers.remove(i);
        }
        
    }

    @Override
    public void notifyObservers() {
    	WorkItem temporaryWorkItem = WorkItem;
    	for (int i = 0; i < observers.size(); i++) {
    		Worker worker = (Worker) observers.get(i);
    		temporaryWorkItem = worker.update(WorkItem);
    		
    		if (temporaryWorkItem != null) {
    			this.WorkItem = temporaryWorkItem;
    			System.out.println(worker.getWorkerID() + ": Completed work on WorkItem<" + WorkItem.getItemID() + ">");
    		}

    		if (WorkItem.getItemID() > 4) {
    			break;
    		}
    		
    	}
    			
    }
    
    public void setWorkItem(WorkItem workItem) {
    	this.WorkItem = workItem;
    }
}    