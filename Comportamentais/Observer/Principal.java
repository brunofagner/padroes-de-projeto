public class Principal {
      public static void main(String[] args) {
            ConcreteSubject subject = new ConcreteSubject();

            Observer o1 = new ConcreteObserver();
            Observer o2 = new ConcreteObserver();
            subject.attatch(o1);
            subject.attatch(o2);

            subject.setState("Novo estado");
      }
}
