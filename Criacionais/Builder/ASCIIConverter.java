public class ASCIIConverter extends TextConverter{

      @Override
      public String convertChar(String s) {
            return "CHAR ASCII ";
      }

      @Override
      public String convertFontChange(String s) {
            return "FONT ASCII ";
      }

      @Override
      public String convertParagraph(String s) {
            return "PARAGRAPH ASCII ";
      }
      
}
