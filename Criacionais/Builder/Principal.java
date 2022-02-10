public class Principal {
      public static void main(String[] args) {
            
            RTFReader reader = new RTFReader(new ASCIIConverter());
            String texto = reader.parseRTF("char font para");
            System.out.println(texto);

            reader.setBuilder(new TeXConverter());
            texto = reader.parseRTF("char font para");
            System.out.println(texto);
      }
}
