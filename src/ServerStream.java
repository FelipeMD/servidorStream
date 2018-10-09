import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerStream {

	public static void main(String[] args) throws IOException {
		ServerSocket welcomeSocket = new ServerSocket(6789);

		System.out.println("Servidor iniciado.");
		
		// loop infinito para atender varias conexoes
		while(true) 
		{
			// espera por uma conexao (bloqueia a aplicacao).
			// cria um novo socket local que ira tratar esta nova conexao
			Socket connectionSocket = welcomeSocket.accept();
		
			Thread t = new Thread(new AudioProcessor(connectionSocket));
			t.start();
		}
	}
}

class AudioProcessor implements Runnable {

	private OutputStream outputStream;

	public AudioProcessor(Socket connectionSocket) throws IOException {
		outputStream = connectionSocket.getOutputStream();
	}

	@Override
	public void run() {
		try {
			FileInputStream fileInputStream = new FileInputStream("edsheeran.mp3");
			
			pipe(fileInputStream, outputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void pipe(InputStream is, OutputStream os) throws IOException {
		  int n;
		  byte[] buffer = new byte[1024];
		  while((n = is.read(buffer)) > -1) {
		    os.write(buffer, 0, n);
		  }
		 os.close ();
	}
	
}
