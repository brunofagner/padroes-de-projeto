public class Principal {
      public static void main(String[] args) {
            Graphic g = new Picture();

            Picture p = new Picture();
            Lline l = new Lline();
            Rectangle r = new Rectangle();
            Text t = new Text();
            p.add(l);
            p.add(r);
            p.add(t);

            Lline l1 = new Lline();
            Rectangle r1 = new Rectangle();
            
            g.add(p);
            g.add(l1);
            g.add(r1);

            g.draw();
      }

}
