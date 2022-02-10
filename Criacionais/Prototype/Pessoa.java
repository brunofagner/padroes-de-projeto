public class Pessoa extends Prototype{
      String nome;
      int idade;

      public Pessoa clone() {
            Pessoa p = new Pessoa();
            p.setNome(this.nome);
            p.setIdade(this.idade);
            return p;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }
      public String getNome() {
            return nome;
      }

      public void setIdade(int idade) {
            this.idade = idade;
      }
      public int getIdade() {
            return idade;
      }
}
