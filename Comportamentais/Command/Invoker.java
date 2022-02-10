import java.util.HashMap;
import java.util.Map;

public class Invoker {
      public static Map<String, Command> comandos = new HashMap<String, Command>();

      static{
            comandos.put("A", new ACommand());
            comandos.put("B", new BCommand());
      }

      public static void invoke(String command){
            comandos.get(command).execute();
      }
}
