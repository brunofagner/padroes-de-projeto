public class GerenciadorImpressao {
      private static GerenciadorImpressao gerenciadorimpressao;
      private GerenciadorImpressao(){}

      public static GerenciadorImpressao getInstance(){
            if (gerenciadorimpressao == null) {
                  gerenciadorimpressao = new GerenciadorImpressao();
            }
            return gerenciadorimpressao;
      }
}
