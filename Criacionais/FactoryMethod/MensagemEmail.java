import javax.swing.JOptionPane;

public class MensagemEmail implements Mensagem {
      @Override
      public void enviar(String mensagem) {
            JOptionPane.showMessageDialog(null, "Email: "+ mensagem);
            
      }
}
