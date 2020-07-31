public class Relogio {

    // Parametros
    private int hour, min, sec;

    // Método construtor - Atributos da Classe
    public Relogio(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    // Método da classe
    public String getHora() {
        return hour + ":" +  min + ":" + sec;
    }

}