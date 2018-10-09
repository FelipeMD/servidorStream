
	public AudioProcessor(java.net.Socket connectionSocket) throws java.io.IOException;
    aload_0 [this]
    invokespecial java.lang.Object() [15]
    aload_0 [this]
    aload_1 [connectionSocket]
    invokevirtual java.net.Socket.getOutputStream() : java.io.OutputStream [18]
    putfield AudioProcessor.outputStream : java.io.OutputStream [24]
    return
     Line numbers:
       [pc: 0, line: 34]
       [pc: 4, line: 35]
       [pc: 12, line: 36]
     Local variable table:
       [pc: 0, pc: 13] local: this index: 0 type: AudioProcessor
       [pc: 0, pc: 13] local: connectionSocket index: 1 type: java.net.Socket
 
 // Method descriptor #17 ()V
 // Stack: 3, Locals: 2
 public void run();
    0  new java.io.FileInputStream [33]
    3  dup
    4  ldc <String "edsheeran.mp3"> [35]
    6  invokespecial java.io.FileInputStream(java.lang.String) [37]
    9  astore_1 [fileInputStream]
   10  aload_0 [this]
   11  aload_1 [fileInputStream]
   12  aload_0 [this]
   13  getfield AudioProcessor.outputStream : java.io.OutputStream [24]
   16  invokevirtual AudioProcessor.pipe(java.io.InputStream, java.io.OutputStream) : void [40]
   19  goto 35
   22  astore_1 [e]
   23  aload_1 [e]
   24  invokevirtual java.io.FileNotFoundException.printStackTrace() : void [44]
   27  goto 35
   30  astore_1 [e]
   31  aload_1 [e]
   32  invokevirtual java.io.IOException.printStackTrace() : void [49]
   35  return
     Exception Table:
       [pc: 0, pc: 19] -> 22 when : java.io.FileNotFoundException
       [pc: 0, pc: 19] -> 30 when : java.io.IOException
     Line numbers:
       [pc: 0, line: 41]
       [pc: 10, line: 43]
       [pc: 19, line: 44]
       [pc: 23, line: 45]
       [pc: 30, line: 46]
       [pc: 31, line: 47]
       [pc: 35, line: 49]
     Local variable table:
       [pc: 0, pc: 36] local: this index: 0 type: AudioProcessor
       [pc: 10, pc: 19] local: fileInputStream index: 1 type: java.io.FileInputStream
       [pc: 23, pc: 27] local: e index: 1 type: java.io.FileNotFoundException
       [pc: 31, pc: 35] local: e index: 1 type: java.io.IOException
     Stack map table: number of frames 3
       [pc: 22, same_locals_1_stack_item, stack: {java.io.FileNotFoundException}]
       [pc: 30, same_locals_1_stack_item, stack: {java.io.IOException}]
       [pc: 35, same]
 
 // Method descriptor #43 (Ljava/io/InputStream;Ljava/io/OutputStream;)V
 // Stack: 4, Locals: 5
 public void pipe(java.io.InputStream is, java.io.OutputStream os) throws java.io.IOException;
    0  sipush 1024
    3  newarray byte [8]
    5  astore 4 [buffer]
    7  goto 18
   10  aload_2 [os]
   11  aload 4 [buffer]
   13  iconst_0
   14  iload_3 [n]
   15  invokevirtual java.io.OutputStream.write(byte[], int, int) : void [56]
   18  aload_1 [is]
   19  aload 4 [buffer]
   21  invokevirtual java.io.InputStream.read(byte[]) : int [62]
   24  dup
   25  istore_3 [n]
   26  iconst_m1
   27  if_icmpgt 10
   30  aload_2 [os]
   31  invokevirtual java.io.OutputStream.close() : void [68]
   34  return
     Line numbers:
       [pc: 0, line: 53]
       [pc: 7, line: 54]
       [pc: 10, line: 55]
       [pc: 18, line: 54]
       [pc: 30, line: 57]
       [pc: 34, line: 58]
     Local variable table:
       [pc: 0, pc: 35] local: this index: 0 type: AudioProcessor
       [pc: 0, pc: 35] local: is index: 1 type: java.io.InputStream
       [pc: 0, pc: 35] local: os index: 2 type: java.io.OutputStream
       [pc: 10, pc: 18] local: n index: 3 type: int
       [pc: 26, pc: 35] local: n index: 3 type: int
       [pc: 7, pc: 35] local: buffer index: 4 type: byte[]
     Stack map table: number of frames 2
       [pc: 10, append: {int, byte[]}]
       [pc: 18, full, stack: {}, locals: {AudioProcessor, java.io.InputStream, java.io.OutputStream, _, byte[]}]
}
}
