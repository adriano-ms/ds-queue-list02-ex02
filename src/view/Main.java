package view;

import br.edu.fateczl.queue.Queue;
import controller.OperationController;
import model.Client;

public class Main {

	public static void main(String[] args) {

		try {
			Queue<Client> queue = new Queue<>();
			OperationController controller = new OperationController();
			fillQueue(queue);
			controller.checkout(queue);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void fillQueue(Queue<Client> queue) {
		for (int i = 1; i <= 20; i++) {
			String name = "Client " + i;
			int partsAmount = (int) ((Math.random() * 31) + 20);
			double partsPrice = ((Math.random() * 95.00) + 5.0);
			queue.insert(new Client(name, partsAmount, partsPrice));
		}
	}

}
