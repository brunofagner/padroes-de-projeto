public class Cliente {
      public static void main(String[] args) {
            TCPConection tc = new TCPConection();

            tc.open();
            tc.acknowledge();
            tc.close();

            tc.setState(new TCPEstablished());
            tc.open();
            tc.acknowledge();
            tc.close();

            tc.setState(new TCPClosed());
            tc.open();
            tc.acknowledge();
            tc.close();
      }
}
