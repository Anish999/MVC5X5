import java.util.Scanner;

public class MyView {
	
	private MyModel model;
	private int row;
	private int column;
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public MyView(MyModel model) {
		this.model = model;
		
	}
	
	public void printMessage(MyModel model) {
		this.model = model;
		
		char playerName = model.getPlayerID()%2==0? 'X':'O';
		
		System.out.println("Player "+ playerName +", Enter row:");
		Scanner sc =new Scanner(System.in);
		row = sc.nextInt();
		
		System.out.println("Player "+ playerName +", Enter column:");
		sc =new Scanner(System.in);
		column = sc.nextInt();
	}
	
	public void printBoard(int[][] board) {
		
		for( int row = 0; row < board.length; row++ ){
	         for( int col = 0; col < board.length; col++ ){
	            // Uses the "global" constants to print out appropriate letter.
	            if( board[row][col] == 1 )
	               System.out.print("X ");
	            else if(board[row][col] == -1 )
	               System.out.print("O ");
	            else 
	               System.out.print(". ");
	          }
	          // Goes to new line after printing each row
	          System.out.println("");
		}
		
	}
	
	public void printTryAgain(MyModel model) {
		
		System.out.println("Field already taken. Try again.");
		printMessage(model);
	}
}
