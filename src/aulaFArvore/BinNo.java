package aulaFArvore;

public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T conteudo() {
        return conteudo;
    }

    public BinNo<T> setConteudo(T conteudo) {
        this.conteudo = conteudo;
        return this;
    }

    public BinNo<T> noEsq() {
        return noEsq;
    }

    public BinNo<T> setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
        return this;
    }

    public BinNo<T> noDir() {
        return noDir;
    }

    public BinNo<T> setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
        return this;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
