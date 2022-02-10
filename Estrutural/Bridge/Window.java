public abstract class Window{
      private WindowImp imp;

      
      public void drawRect(){
            imp.devDrawLine();
            imp.devDrawLine();
            imp.devDrawLine();
            imp.devDrawLine();
      };

      public void drawText(){
            imp.devDrawText();
      };

      public void setImp(WindowImp imp) {
            this.imp = imp;
      }
      public WindowImp getImp() {
            return imp;
      }
}