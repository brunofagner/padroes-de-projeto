package State;
public class EstadoJogo extends State {

      @Override
      public boolean ganho(char[] jogo) {
            if(jogo[0] != ' ' && jogo[0] == jogo[1] && jogo[1] == jogo[2])
            	return true;
		if(jogo[3] != ' ' && jogo[3] == jogo[4] && jogo[4] == jogo[5])
			return true;
		if(jogo[6] != ' ' && jogo[6] == jogo[7] && jogo[7] == jogo[8])
			return true;
		if(jogo[0] != ' ' && jogo[0] == jogo[3] && jogo[3] == jogo[6])
			return true;
		if(jogo[1] != ' ' && jogo[1] == jogo[4] && jogo[4] == jogo[7])
			return true;
		if(jogo[2] != ' ' && jogo[2] == jogo[5] && jogo[5] == jogo[8])
			return true;
		if(jogo[0] != ' ' && jogo[0] == jogo[4] && jogo[4] == jogo[8])
			return true;
		if(jogo[2] != ' ' && jogo[2] == jogo[4] && jogo[4] == jogo[6])
			return true;
            return false;            
      }
	//0 1 2
	//3 4 5
	//6 7 8
      
}
