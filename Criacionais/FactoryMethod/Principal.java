import javax.swing.JOptionPane;

public class Principal {
      public static void main(String[] args) {
         String texto = JOptionPane.showInputDialog(null);   
         new MensagemFactory();
         Mensagem mensagem = MensagemFactory.getMensagem(2);
         mensagem.enviar(texto);
      }
}
