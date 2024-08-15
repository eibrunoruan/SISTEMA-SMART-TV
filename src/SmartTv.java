//Definindo as Variaveis que usaremos posteriormente.
public class SmartTv {
    boolean ligada = false; //como padrão sempre desligada;
    int canal = 1;
    int volume = 25;

    //Metodo para definir o novo canal;
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    //aumentar o canal em 1
    public void aumentarCanal () {
        canal++;
    }
    //diminuir o canal em 1
    public void diminuirCanal () {
        canal--;
    }
    //Aumentar volume em 1
    public void aumentarVolume () {
        volume++;
    }
    //diminuir volume em 1
    public void diminuirVolume () {
        volume--;
    }
    //metodo para ligar a Tv
    public void ligar() {
        ligada = true;
    }
    //metodo para desligar a tv
    public void desligar() {
        ligada = false;
    }
    public void gerarLinha() {
        String linha = "-----------------";
        System.out.println(linha);
    }

}