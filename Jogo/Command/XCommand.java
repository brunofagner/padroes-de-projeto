package Command;
public class XCommand implements Command{

      @Override
      public char[] execute(char[] jogo, int pos) {
            jogo[pos] = 'X';
            return null;
      }
      
}
