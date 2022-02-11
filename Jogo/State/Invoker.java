package State;
import java.util.HashMap;
import java.util.Map;

import Command.Command;
import Command.OCommand;
import Command.XCommand;

public class Invoker {
      public static Map<String, Command> comandos = new HashMap<String, Command>();

      static{
            comandos.put("X", new XCommand());
            comandos.put("O", new OCommand());
      }

      public void invoke(String command, char[] jogo, int pos){
            comandos.get(command).execute(jogo, pos);
      }
}
