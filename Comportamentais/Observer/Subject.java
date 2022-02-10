import java.util.ArrayList;
import java.util.List;

public abstract class Subject{
      private List<Observer> observers = new ArrayList<Observer>();

      public void attatch(Observer o){
            this.observers.add(o);
      }

      public void detach(Observer o){
            observers.remove(o);
      }

      public void notifyObservers(){
            for (Observer observer : observers) {
                  observer.update();
            }
      }
}