package command;

public class MoveNorth implements CommandInterface {

	
	@Override
	public boolean undo() {
		int y = Player.getInstance().getY();
		Player.getInstance().setY(y - 1);
		return false;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int y = Player.getInstance().getY();
		Player.getInstance().setY(y + 1);
		
	}

}


