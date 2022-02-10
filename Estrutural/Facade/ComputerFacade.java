public class ComputerFacade {
      private Memoria memoria;
      private HD hd;
      private SO so;
      private CPU cpu;
      private Acessorios acessorios;

      public ComputerFacade(){
            this.memoria = new Memoria();
            this.hd = new HD();
            this.so = new SO();
            this.cpu = new CPU();
            this.acessorios = new Acessorios();
      }

      public void montarPc(){
            System.out.println("Montando uma nova maquina");
            memoria.adicionarMemoria();
            hd.adicionarHD();
            cpu.adicionarProcessador();
            acessorios.adicionarMonitor();
            acessorios.adicionarMouse();
            acessorios.adicionarTeclado();
            so.instalarSO();
            System.out.println("Montagem completa");
      }
}
