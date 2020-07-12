public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		
		if((square/8) % 2 == 0) { //determine even or odd row
			if(square % 2  == 0) { //check if cell in current row is even
				return false;
			}
		}
		else {
			if(square % 2!= 0)
				return false;
		}
		
		return true;
		// WRITE YOUR LOGIC HERE...
		
	}

}
