package exercCD_v2.models;

public class Musica {
    private String nome;
    private float duracao;
    
    public Musica(String nome, float duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\nMusica: " + nome + ", duração: " + duracao + "m";
    }
    
}
