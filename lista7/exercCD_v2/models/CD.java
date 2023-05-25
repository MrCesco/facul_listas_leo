package exercCD_v2.models;
import java.util.*;

public class CD {
    private String nomeDaBanda;
    private String nomeCd;
    private int anoLancamento;
    private List<Musica> musicas;
    private int numeroDeMusicas;
    private float tempoTotalDoCd;
    
    public CD(String nomeDaBanda, String nomeCd, int anoLancamento, List<Musica> musicas, int numeroDeMusicas,
            float tempoTotalDoCd) {
        this.nomeDaBanda = nomeDaBanda;
        this.nomeCd = nomeCd;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
        this.numeroDeMusicas = numeroDeMusicas;
        this.tempoTotalDoCd = tempoTotalDoCd;
    }

    public String getNomeDaBanda() {
        return nomeDaBanda;
    }

    public void setNomeDaBanda(String nomeDaBanda) {
        this.nomeDaBanda = nomeDaBanda;
    }

    public String getNomeCd() {
        return nomeCd;
    }

    public void setNomeCd(String nomeCd) {
        this.nomeCd = nomeCd;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public void setNumeroDeMusicas(int numeroDeMusicas) {
        this.numeroDeMusicas = numeroDeMusicas;
    }

    public float getTempoTotalDoCd() {
        return tempoTotalDoCd;
    }

    public void setTempoTotalDoCd(float tempoTotalDoCd) {
        this.tempoTotalDoCd = tempoTotalDoCd;
    }

    @Override
    public String toString() {
        return " CD da banda: " + nomeDaBanda + "\n Nome do album: " + nomeCd + "\n Ano de lançamento: " + anoLancamento 
        + "\n " + musicas + "\n Número de musicas: " + numeroDeMusicas + "\n Tempo total do CD: " + tempoTotalDoCd;
    }
    
}
