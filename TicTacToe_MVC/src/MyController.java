public class MyController {
	
	private MyModel model;
	private MyView view;
	
	public MyController(MyModel model, MyView view) {
		
		while(model.hasWon(model.getBoard())==false) {
			this.model = model;
			this.view = view;
			
			view.printMessage(model);
			
			while(model.isTaken(view.getRow(), view.getColumn())==true) {
				view.printTryAgain(model);
			}
			
			PlayMove();
			view.printBoard(model.getBoard());
			
		}
	}
	
	public void PlayMove() {
		
		model.Play(view.getRow(), view.getColumn());
		
	}

	

}
