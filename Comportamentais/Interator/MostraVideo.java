public class MostraVideo {
      public static void main(String[] args) {
            VideoItem[] videoItens = new VideoItem[5];

            videoItens[0] = new VideoItem("Ben 10", 213.4);
            videoItens[1] = new VideoItem("Winx", 2.2);
            videoItens[2] = new VideoItem("Barbie", 10.0);
            videoItens[3] = new VideoItem("Tropa de elite", 1.0);
            videoItens[4] = new VideoItem("pirata do vale do silicio", 2.0);

            Interator videoInterator  = new VideoInterator(videoItens);
            videoInterator.remove();
            while (videoInterator.hasNext()) {
                  VideoItem videoItem = (VideoItem)videoInterator.next();
                  System.out.println(videoItem.nome+" = R$"+ videoItem.preco);
            }
      }
}
