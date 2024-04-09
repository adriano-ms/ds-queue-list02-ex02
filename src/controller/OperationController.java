package controller;

import br.edu.fateczl.queue.Queue;
import model.Client;

public class OperationController {

	public OperationController() {
		super();
	}

	public void checkout(Queue<Client> queue) throws Exception {
		while (!queue.isEmpty()) {
			Client currentClient = queue.remove();
			System.out.println(currentClient);
		}
	}

}
