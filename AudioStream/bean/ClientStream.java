
public class ClientStream {
	public ClientStream(java.io.InputStream inputStream);
    0  aload_0 [this]
    1  invokespecial java.lang.Object() [10]
    4  aload_0 [this]
    5  aload_1 [inputStream]
    6  putfield ClientStream.inputStream : java.io.InputStream [13]
    9  return
     Line numbers:
       [pc: 0, line: 13]
       [pc: 4, line: 14]
       [pc: 9, line: 15]
     Local variable table:
       [pc: 0, pc: 10] local: this index: 0 type: ClientStream
       [pc: 0, pc: 10] local: inputStream index: 1 type: java.io.InputStream
 
 // Method descriptor #20 ([Ljava/lang/String;)V
 // Stack: 4, Locals: 4
 public static void main(java.lang.String[] args) throws java.net.UnknownHostException, java.io.IOException;
    0  new java.net.Socket [26]
    3  dup
    4  ldc <String "localhost"> [28]
    6  sipush 6789
    9  invokespecial java.net.Socket(java.lang.String, int) [30]
   12  astore_1 [clientSocket]
   13  aload_1 [clientSocket]
   14  invokevirtual java.net.Socket.getInputStream() : java.io.InputStream [33]
   17  astore_2 [inputStream]
   18  new ClientStream [1]
   21  dup
   22  aload_2 [inputStream]
   23  invokespecial ClientStream(java.io.InputStream) [37]
   26  astore_3 [clientStream]
   27  aload_3 [clientStream]
   28  invokevirtual ClientStream.playSound() : void [39]
   31  return
     Line numbers:
       [pc: 0, line: 20]
       [pc: 13, line: 22]
       [pc: 18, line: 24]
       [pc: 27, line: 25]
       [pc: 31, line: 27]
     Local variable table:
       [pc: 0, pc: 32] local: args index: 0 type: java.lang.String[]
       [pc: 13, pc: 32] local: clientSocket index: 1 type: java.net.Socket
       [pc: 18, pc: 32] local: inputStream index: 2 type: java.io.InputStream
       [pc: 27, pc: 32] local: clientStream index: 3 type: ClientStream
 
 // Method descriptor #12 ()V
 // Stack: 4, Locals: 3
 public void playSound();
    0  new java.io.BufferedInputStream [47]
    3  dup
    4  aload_0 [this]
    5  getfield ClientStream.inputStream : java.io.InputStream [13]
    8  invokespecial java.io.BufferedInputStream(java.io.InputStream) [49]
   11  astore_1 [bis]
   12  new javazoom.jl.player.Player [50]
   15  dup
   16  aload_1 [bis]
   17  invokespecial javazoom.jl.player.Player(java.io.InputStream) [52]
   20  astore_2 [player]
   21  new ClientStream$1 [53]
   24  dup
   25  aload_0 [this]
   26  aload_2 [player]
   27  invokespecial ClientStream$1(ClientStream, javazoom.jl.player.Player) [55]
   30  invokevirtual ClientStream$1.start() : void [58]
   33  goto 49
   36  astore_1 [ex]
   37  getstatic java.lang.System.out : java.io.PrintStream [61]
   40  ldc <String "Error with playing sound."> [67]
   42  invokevirtual java.io.PrintStream.println(java.lang.String) : void [69]
   45  aload_1 [ex]
   46  invokevirtual java.lang.Exception.printStackTrace() : void [75]
   49  return
     Exception Table:
       [pc: 0, pc: 33] -> 36 when : java.lang.Exception
     Line numbers:
       [pc: 0, line: 32]
       [pc: 12, line: 34]
       [pc: 21, line: 36]
       [pc: 30, line: 44]
       [pc: 33, line: 46]
       [pc: 37, line: 47]
       [pc: 45, line: 48]
       [pc: 49, line: 50]
     Local variable table:
       [pc: 0, pc: 50] local: this index: 0 type: ClientStream
       [pc: 12, pc: 33] local: bis index: 1 type: java.io.BufferedInputStream
       [pc: 21, pc: 33] local: player index: 2 type: javazoom.jl.player.Player
       [pc: 37, pc: 49] local: ex index: 1 type: java.lang.Exception
     Stack map table: number of frames 2
       [pc: 36, same_locals_1_stack_item, stack: {java.lang.Exception}]
       [pc: 49, same]

 Inner classes:
   [inner class info: #53 ClientStream$1, outer class info: #0
    inner name: #0, accessflags: 0 default]
}
}
