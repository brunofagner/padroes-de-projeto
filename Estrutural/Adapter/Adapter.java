public class Adapter extends Adaptee implements Target{

      @Override
      public void request() {
            this.specificRequest();
            
      }
      
}
