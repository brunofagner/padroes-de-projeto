public class RTFReader{

      private TextConverter builder;

      public RTFReader(TextConverter builder){
            this.builder = builder;
      }

      public void setBuilder(TextConverter builder) {
            this.builder = builder;
      }

      public String parseRTF(String texto){

            String saida = "";

            String[] tokens = texto.split(" ");
            
            for (String t : tokens) {
                  switch (t){
                        case "char":
                              saida += builder.convertChar(t);
                              break;
                        case "font":
                              saida += builder.convertFontChange(t);
                              break;
                        case "para":
                              saida += builder.convertParagraph(t);
                              break;
                  }

            }
            return saida;
      }
}