
public class ServerStream {
	public ServerStream();
    0  aload_0 [this]
    1  invokespecial java.lang.Object() [8]
    4  return
      Line numbers:
        [pc: 0, line: 10]
      Local variable table:
        [pc: 0, pc: 5] local: this index: 0 type: ServerStream
  
  // Method descriptor #15 ([Ljava/lang/String;)V
  // Stack: 5, Locals: 4
  public static void main(java.lang.String[] args) throws java.io.IOException;
     0  new java.net.ServerSocket [19]
     3  dup
     4  sipush 6789
     7  invokespecial java.net.ServerSocket(int) [21]
    10  astore_1 [welcomeSocket]
    11  getstatic java.lang.System.out : java.io.PrintStream [24]
    14  ldc <String "Servidor iniciado."> [30]
    16  invokevirtual java.io.PrintStream.println(java.lang.String) : void [32]
    19  aload_1 [welcomeSocket]
    20  invokevirtual java.net.ServerSocket.accept() : java.net.Socket [38]
    23  astore_2 [connectionSocket]
    24  new java.lang.Thread [42]
    27  dup
    28  new AudioProcessor [44]
    31  dup
    32  aload_2 [connectionSocket]
    33  invokespecial AudioProcessor(java.net.Socket) [46]
    36  invokespecial java.lang.Thread(java.lang.Runnable) [49]
    39  astore_3 [t]
    40  aload_3 [t]
    41  invokevirtual java.lang.Thread.start() : void [52]
    44  goto 19
      Line numbers:
        [pc: 0, line: 13]
        [pc: 11, line: 15]
        [pc: 19, line: 22]
        [pc: 24, line: 24]
        [pc: 40, line: 25]
        [pc: 44, line: 18]
      Local variable table:
        [pc: 0, pc: 47] local: args index: 0 type: java.lang.String[]
        [pc: 11, pc: 47] local: welcomeSocket index: 1 type: java.net.ServerSocket
        [pc: 24, pc: 44] local: connectionSocket index: 2 type: java.net.Socket
        [pc: 40, pc: 44] local: t index: 3 type: java.lang.Thread
      Stack map table: number of frames 1
        [pc: 19, append: {java.net.ServerSocket}]
}
}
