public class TCPEstablished extends TCPState{

      @Override
      public void open() {
           System.out.println("Não é possivel abrir uma conexao já estabelecida");
            
      }

      @Override
      public void close() {
            System.out.println("Conexão fechada com sucesso");
            
      }

      @Override
      public void acknowledge() {
            System.out.println("Conexão reconhecida com sucesso");
            
      }
      
}
