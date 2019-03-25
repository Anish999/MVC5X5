
public class MyModel {
	
	private int[][] board;
	private int playerID;
	private static int playCount;
	public boolean hasWon=false;
	
	public MyModel(){
		board = new int[5][5];
		playCount = 0;
	}
	
	
	//Getter and Setter
	public int[][] getBoard() {
		return board;
	}
	
	public void setBoard(int[][] board) {
		this.board=board;
	}
	
	public int getPlayerID() {
		return playerID;
	}

	//Update the board model
	public void Play(int x, int y) {
		
		if(playerID%2 == 0) {
			board[x][y] = 1;
		}
		else {
			board[x][y] = -1;
		}
		
		playCount++;
		updatePlayerID();
	}
	
	public void updatePlayerID() {
		if(playCount%2==0) {
			playerID=0;
		}
		else {
			playerID=1;
		}
	}
	
	public boolean hasWon( int [][] matrix ){
	      //Variable holds the "result" of hasWon. True if a winner was found.
	      boolean retVal = false;
	      
	      //Check for horizontal win
	      for( int row = 0; row < matrix.length; row++ ){
	         int sum = 0;
	         for( int col = 0; col < matrix[0].length; col++ ){
	            sum += matrix[row][col];
	         }
	         //Check to see if the sum of that row was 3 or -3, a win...
	         if( sum == 5 ){
	            System.out.println("X wins.");
	            retVal = true;
	         } else if ( sum == -5 ) {
	            System.out.println("O wins.");
	            retVal = true;
	         }
	      }
	      
	      //Check for vertical win
	      for( int col = 0; col < matrix[0].length; col++ ){
	         int sum = 0;
	         for( int row = 0; row < matrix.length; row++ ){
	            sum += matrix[row][col];
	         }
	         //Check to see if the sum of that column was 3 or -3, a win...
	         if( sum == 5 ){
	            System.out.println("X wins.");
	            retVal = true;
	         } else if ( sum == -5 ) {
	            System.out.println("O wins.");
	            retVal = true;
	         }
	      }
	      
	      //Check for diagonal win
	      if( (matrix[0][0] + matrix[1][1] + matrix[2][2]+ matrix[3][3] + matrix[4][4]) == 5 ){
	         System.out.println("X wins.");
	         retVal = true;
	      } else if ( (matrix[0][0] + matrix[1][1] + matrix[2][2]+ matrix[3][3] + matrix[4][4]) == -5 ) {
	         System.out.println("O wins.");
	         retVal = true;
	      }
	      if( (matrix[0][4] + matrix[1][3] + matrix[2][2]+matrix[3][1]+matrix[4][0]) == 5 ){
	         System.out.println("X wins.");
	         retVal = true;
	      } else if ( (matrix[0][4] + matrix[1][3] + matrix[2][2]+matrix[3][1]+matrix[4][0]) == -5 ) {
	         System.out.println("O wins.");
	         retVal = true;
	      }
	      
	      //Check for cat game
	      boolean foundSpace = false;
	      for( int row = 0; row < matrix.length; row++ ){
	         for( int col = 0; col < matrix[0].length; col++ ){
	            if( matrix[row][col] == 0 ) 
	               foundSpace = true;
	         }
	      }
	      if( foundSpace == false ){
	         System.out.println("Ends in tie.");
	         retVal = true;
	      }
	      
	      return retVal;
	   }

	public boolean isTaken(int x, int y) {
		if(board[x][y]!=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
