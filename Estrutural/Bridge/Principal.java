public class Principal {
      public static void main(String[] args) {
            
            IconWindow ic = new IconWindow();
            ic.setImp(new PMWindowImp());
            //ic.setImp(new XWindowImp());
            ic.drawBorder();
      }
}
