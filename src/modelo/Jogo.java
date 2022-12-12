package modelo;

public class Jogo {
    
    private int rodada;
    private String palavra;
    private String letra;
    private int tentativa;
    private int erros;
    private String dica;
    private boolean vencedor;

    //iniciando o jogo
    public Jogo(int rodada, String palavra, int tentativa, int erros, String dica) {
        this.rodada = 1;
        this.palavra = palavra;
        this.tentativa = 1;
        this.erros = 0;
        this.dica = dica;
    }

    //ao longo da partida
    public Jogo(int rodada, String letra, int tentativa, int erros, boolean vencedor) {
        this.rodada = rodada;
        this.letra = letra;
        this.tentativa = tentativa;
        this.erros = erros;
        this.vencedor = vencedor;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public void setLetra(String letra) {
        this.palavra = letra;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }

    public int getRodada() {
        return rodada;
    }

    public String getLetra() {
        return palavra;
    }

    public int getTentativa() {
        return tentativa;
    }

    public int getErros() {
        return erros;
    }
    
}
