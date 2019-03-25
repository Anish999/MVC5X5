
public class TicTacToe {

	public static void main(String[] args) {
		
		MyModel model = new MyModel();
		MyView view = new MyView(model);
		MyController controller = new MyController(model, view);
		
		}

}
