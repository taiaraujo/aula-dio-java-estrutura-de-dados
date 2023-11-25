package aulaFArvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        }

        if (novoNo.conteudo().compareTo(atual.conteudo()) < 0) {
            atual.setNoEsq(inserir(atual.noEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.noDir(), novoNo));
        }
        return atual;
    }

    public void exibirEmOrdem() {
        System.out.println("\nExibindo InOrdem");
        exibirEmOrdem(raiz);
    }

    private void exibirEmOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirEmOrdem(atual.noEsq());
            System.out.print(atual.conteudo() + ", ");
            exibirEmOrdem(atual.noDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.noEsq());
            exibirPosOrdem(atual.noDir());
            System.out.print(atual.conteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\nExibindo PreOrdem");
        exibirPreOrdem(raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.conteudo() + ", ");
            exibirPreOrdem(atual.noEsq());
            exibirPreOrdem(atual.noDir());
        }
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temporario = null;

            while (atual != null && !atual.conteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.conteudo()) < 0){
                    atual = atual.noEsq();
                } else {
                    atual = atual.noDir();
                }
            }

            if (atual == null) {
                System.out.println("conteudo nao encontrado. Bloco try");
            }

            if (pai == null) {
                if(atual.noDir() == null){
                    this.raiz = atual.noEsq();
                } else if(atual.noEsq() == null) {
                    this.raiz = atual.noDir();
                } else {
                    for(temporario = atual, filho = atual.noEsq();
                        filho.noDir() != null;
                        temporario = filho, filho = filho.noEsq()
                    ) {
                        if(filho != atual.noEsq()){
                            temporario.setNoDir(filho.noEsq());
                            filho.setNoEsq(raiz.noEsq());
                        }
                    }
                    filho.setNoDir(raiz.noDir());
                    raiz = filho;
                }
            } else if(atual.noDir() == null){
                if(pai.noEsq() == atual){
                    pai.setNoEsq(atual.noEsq());
                }else {
                    pai.setNoDir(atual.noEsq());
                }
            }else if(atual.noEsq() == null){
                if(pai.noEsq() == atual){
                    pai.setNoEsq(atual.noDir());
                }else {
                    pai.setNoDir(atual.noDir());
                }
            }else{
                for(
                        temporario = atual, filho = atual.noEsq();
                        filho.noDir() != null;
                        temporario = filho, filho = filho.noDir()
                ){
                    if(filho != atual.noEsq()){
                        temporario.setNoDir(filho.noEsq());
                        filho.setNoEsq(atual.noEsq());
                    }
                    filho.setNoDir(atual.noDir());
                    if(pai.noEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }


        } catch (NullPointerException erro) {
            System.out.println("conteudo nao encontrado. Bloco catch");
        }
    }
}
