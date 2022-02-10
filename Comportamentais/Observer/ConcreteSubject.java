public class ConcreteSubject extends Subject {
      private String state;

      public void setState(String state) {
            this.state = state;
            notifyObservers();
      }
      public String getState() {
            return state;
      }
}
