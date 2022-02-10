public abstract class HelpHandler{

      private HelpHandler handler;

      public HelpHandler(HelpHandler handler){
            this.handler = handler;
      }

      public void handleHelp(){

            if (this.handler != null){
                  System.out.println("Repassou chamada do help");
                  this.handler.handleHelp();
            }else
                  System.out.println("Não foi possivel tratar o evento de help");
      }

}