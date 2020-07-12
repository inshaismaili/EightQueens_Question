public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int cn = cellId%8;
		return cn;
			// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int rn=cellId/8;
		return rn;
		// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		int i,j;
		for( i=0; i<8; i++) {
			if(placedQueens[row][i]) {
				return false;
			}
		}
		
		for( i=0; i<8; i++) {
			if(placedQueens[i][col]) {
				return false;
			}
		}
		int x= row;
		int y= col;
		while(x < 8 && y < 8 && x>=0 && y>=0) {
			if(placedQueens[x][y] == true) {
				return false;
			}
			x++;
			y++;
		}
		
	    x= row;
		y= col;
		while(x < 8 && y < 8 && x>=0 && y>=0) {
			if(placedQueens[x][y] == true) {
				return false;
			}
			x++;
			y--;
		}
		
		x= row;
		y= col;
		while(x < 8 && y < 8 && x>=0 && y>=0) {
			if(placedQueens[x][y] == true) {
				return false;
			}
			x--;
			y--;
		}
		
		x= row;
		y= col;
		while(x < 8 && y < 8 && x>=0 && y>=0) {
			if(placedQueens[x][y] == true) {
				return false;
			}
			x--;
			y++;
		}
		placedQueens[row][col] = true;	
		numQueens++;
		return isValid;
	}
}





















