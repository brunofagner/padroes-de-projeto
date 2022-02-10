public class ConcreteObserver extends Observer{

      private ConcreteSubject cs;
      
      public ConcreteObserver(ConcreteSubject cs){
            this.cs = cs;
      }
      @Override
      public void update() {
            System.out.println("Observer atualizado, estado = "+this.cs.getState());
            
      }
      
}
