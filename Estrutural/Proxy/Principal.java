public class Principal {
      public static void main(String[] args) {
            Image i = new Image();
            Graphic g = new ImageProxy(i);
            g.draw();
            g.getExtent();
            
            g = i;

            g.draw();
            g.getExtent();
      }
}
