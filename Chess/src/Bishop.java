public class Bishop extends Piece{
	
	public boolean canMove(Box a, Box b) {
		if (Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()))
			return true;
		return false;
	}

}
