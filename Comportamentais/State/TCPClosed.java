public class TCPClosed extends TCPState{

      @Override
      public void open() {
           System.out.println("Não é possivel abrir uma conexão que já está fechada");
            
      }

      @Override
      public void close() {
            System.out.println("Conexão já fechada.");
            
      }

      @Override
      public void acknowledge() {
            System.out.println("Não é possivel reconhecer uma conexão fechada.");
            
      }
      
}
