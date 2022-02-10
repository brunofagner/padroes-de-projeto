public class Principal {
      public static void main(String[] args) {
            Originator o = new Originator();
            CareTaker ct = new CareTaker(o);
            o.moveLeft();
            o.moveLeft();
            ct.savestate();
            o.moveRight();
            o.moveLeft();
            ct.savestate();
            o.moveRight();
            ct.undo();
            ct.undo();
      }
}
