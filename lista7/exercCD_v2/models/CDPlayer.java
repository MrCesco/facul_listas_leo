package exercCD_v2.models;

public class CDPlayer {
    private int faixa = 1;
    private boolean tocando;
    private CD cd;   

    public CDPlayer(CD cd) {
        this.cd = cd;
    }

    public int getFaixa() {
        return faixa;
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void alterarFaixa(int num) {
        int atual = getFaixa();
        atual += num;
        
        if(atual==0) {
            setFaixa(cd.getMusicas().size());
        } else if(atual > cd.getMusicas().size()) {
            setFaixa(1);
        } else {
            setFaixa(atual);
        }        
    }

    public void play() {
        System.out.printf("Tocando o CD na faixa %d "+ cd.getMusicas().get(faixa-1) +".%n", getFaixa());
        setTocando(true);
    }

    public void pause() {
        System.out.println("Música pausada.");
        setTocando(false);
        display();
    }
    
    public void stop() {
        System.out.println("Parando a música, voltando para a faixa 1.");
        setFaixa(1);
        setTocando(false);
    }

    public void next() {
        System.out.println("Pulando para a próxima faixa.");
        alterarFaixa(+1);
        display();
    }

    public void previous() {
        System.out.println("Voltando para a faixa anterior.");
        alterarFaixa(-1);
        display();
    }

    public void display() {
        if(isTocando()) {
            System.out.printf("O CD está tocando na faixa %d "+ cd.getMusicas().get(faixa-1) +".%n", getFaixa());
        } else {
            System.out.printf("O CD está pausado na faixa %d "+ cd.getMusicas().get(faixa-1) +".%n", getFaixa());
        }
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }
}
