public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.gerarLinha();                                       //Gerador de Linhas
        System.out.println("SmartTv by Bruno");
        System.out.println("Estado da TV: " +smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);
        smartTv.gerarLinha();

        //Brincando com os métodos:
        //Ligando TV
        System.out.println("Brincando com os Métodos: ");
        smartTv.ligar();                                            //Estado alterado para ligado
        System.out.println("Estado da TV: " +smartTv.ligada);
        smartTv.aumentarCanal();                                    //Aumentei o canal em 1
        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.diminuirVolume();                                   //Diminui o volume em 1
        System.out.println("Volume Atual: " +smartTv.volume);
        smartTv.gerarLinha();

    }
}
