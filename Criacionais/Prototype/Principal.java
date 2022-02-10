public class Principal{
      public static void main(String[] args) {
            Pessoa p = new Pessoa();
            p.nome = "Bruno";
            p.idade = 19;
            Pessoa pClone = p.clone();
            System.out.println("Pessoa real: nome: "+p.nome +" idade: "+p.idade);
            System.out.println("Pessoa Clone: nome: "+pClone.nome +" idade: "+pClone.idade);

            PrototypeAleatorio aleatorio = new PrototypeAleatorio();
            PrototypeAleatorio aleatorioClone = aleatorio.clone();
      }
}