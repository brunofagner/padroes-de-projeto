public class TCPConection{
      private TCPState state = new TCPListen();//estado padrão
      
      public void setState(TCPState state) {
            this.state = state;
      }
      public TCPState getState() {
            return state;
      }
      
      public void open(){
            state.open();
      }

      public void close(){
            state.close();
      }

      public void acknowledge(){
            state.acknowledge();
      }
}