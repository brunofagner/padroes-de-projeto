import java.util.Stack;

public class CareTaker {
      private Stack<Memento> estados =  new Stack<Memento>();
      private Originator o;

      public CareTaker(Originator o){
            this.o = o;
      }

      public void savestate(){
            estados.push(o.createMemento());
      }

      public void undo(){
            o.setMemento(estados.pop());
      }
}
