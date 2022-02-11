package Command;
public class OCommand implements Command{

      @Override
      public char[] execute(char[] jogo, int pos) {
            jogo[pos] = 'O';
      return null;
      }
      
}
