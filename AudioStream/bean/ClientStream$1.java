
public class ClientStream$1 {
	ClientStream$1(ClientStream arg0, javazoom.jl.player.Player arg1);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  putfield ClientStream$1.this$0 : ClientStream [12]
    5  aload_0 [this]
    6  aload_2 [arg1]
    7  putfield ClientStream$1.val$player : javazoom.jl.player.Player [14]
   10  aload_0 [this]
   11  invokespecial java.lang.Thread() [16]
   14  return
     Line numbers:
       [pc: 0, line: 1]
       [pc: 10, line: 36]
     Local variable table:
       [pc: 0, pc: 15] local: this index: 0 type: new ClientStream(){}
 
 // Method descriptor #18 ()V
 // Stack: 2, Locals: 2
 public void run();
    0  aload_0 [this]
    1  getfield ClientStream$1.val$player : javazoom.jl.player.Player [14]
    4  invokevirtual javazoom.jl.player.Player.play() : void [24]
    7  goto 18
   10  astore_1 [e]
   11  getstatic java.lang.System.out : java.io.PrintStream [29]
   14  aload_1 [e]
   15  invokevirtual java.io.PrintStream.println(java.lang.Object) : void [35]
   18  return
     Exception Table:
       [pc: 0, pc: 7] -> 10 when : java.lang.Exception
     Line numbers:
       [pc: 0, line: 39]
       [pc: 7, line: 40]
       [pc: 11, line: 41]
       [pc: 18, line: 43]
     Local variable table:
       [pc: 0, pc: 19] local: this index: 0 type: new ClientStream(){}
       [pc: 11, pc: 18] local: e index: 1 type: java.lang.Exception
     Stack map table: number of frames 2
       [pc: 10, same_locals_1_stack_item, stack: {java.lang.Exception}]
       [pc: 18, same]

 Inner classes:
   [inner class info: #1 ClientStream$1, outer class info: #0
    inner name: #0, accessflags: 0 default]
 Enclosing Method: #49  #51 ClientStream.playSound()V
}
}
