package command;

public class MoveEast implements CommandInterface {

	
	@Override
	public boolean undo() {
		int x = Player.getInstance().getX();
		Player.getInstance().setX(x - 1);
		return false;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int x = Player.getInstance().getX();
		Player.getInstance().setX(x+1);
		
	}	

}
