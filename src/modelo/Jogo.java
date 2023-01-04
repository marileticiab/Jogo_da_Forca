package modelo;

public class Jogo {
   
    //variáveis
    private String palavra;
    private String letra;
    private int tentativa;
    private int erros;
    private String dica;
    private boolean vencedor;

    //CONSTRUTOR 1 - iniciando o jogo
    //ação do jogador 1 -> panel 1
    public Jogo(String palavra, String dica) {
        this.palavra = palavra;
        this.tentativa = 1;
        this.erros = 0;
        this.dica = dica;
    }

    //CONSTRUTOR 2 - ao longo da partida
    //ação do jogador 2 -> panel 2
    public Jogo(String letra, int tentativa, int erros, boolean vencedor) {
        this.letra = letra;
        this.tentativa = tentativa;
        this.erros = erros;
        this.vencedor = vencedor;
    }

    //setters --> possível alteração
    public void setLetra(String letra) {
        this.palavra = letra;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    //getters --> possível acesso
    public String getLetra() {
        return palavra;
    }

    public int getTentativa() {
        return tentativa;
    }

    public int getErros() {
        return erros;
    }

    public String getDica() {
        return dica;
    }

    public String getPalavra() {
        return palavra;
    }
  
}
