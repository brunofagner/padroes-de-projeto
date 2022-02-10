public class TeXConverter extends TextConverter {

      @Override
      public String convertChar(String s) {
            return "CHAR TeX ";
      }

      @Override
      public String convertFontChange(String s) {
            return "Font TeX ";
      }

      @Override
      public String convertParagraph(String s) {
            return "Paragraph TeX ";
      }
      
}
