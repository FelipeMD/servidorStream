import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javazoom.jl.player.Player;

public class ClientStream {

	private InputStream inputStream;
	
	public ClientStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// criando um socket cliente. Conexao com socket servidor
		Socket clientSocket = new Socket("localhost", 6789);

		InputStream inputStream = clientSocket.getInputStream();

		ClientStream clientStream = new ClientStream(inputStream);
		clientStream.playSound();
		
	}

	public void playSound() {

		try {
			BufferedInputStream bis = new BufferedInputStream(inputStream);

			final Player player = new Player(bis);

			new Thread() {
				public void run() {
					try {
						player.play();
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
}
