public abstract class Decorator extends VisualComponent{
      private VisualComponent component;

      public Decorator(VisualComponent decorates){
            this.component = decorates;
      }
      public void draw() {
            component.draw();
      }
}
