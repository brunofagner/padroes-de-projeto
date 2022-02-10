public class Principal{
      public static void main(String[] args) {
            //Todos com o mesmo endereço de memoria, ou seja apenas uma instancia
            GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
            GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
            GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
            GerenciadorImpressao g4 = GerenciadorImpressao.getInstance();
            System.out.println(g1);
            System.out.println(g2);
            System.out.println(g3);
            System.out.println(g4);
      }
}