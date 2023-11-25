package aulaEListaCircular;

public class ListaCircular<T> {
    private No<T> refEntrada;
    private No<T> primeiroNo;
    private int tamanhoLista = 0;

    public ListaCircular() {
        primeiroNo = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if(primeiroNo == null) {
            primeiroNo = novoNo;
            novoNo.setNoProximo(primeiroNo);
        } else {
            No<T> noAtual = getNo(size()-1);
            noAtual.setNoProximo(novoNo);
            novoNo.setNoProximo(primeiroNo);
        }

        refEntrada = novoNo;
        tamanhoLista++;
    }

    public void remove(int index) {
        validaIndice(index);
        No<T> noAnteriorAoEscolhido;
        if(index == 0) {
            primeiroNo = getNo(1);
            noAnteriorAoEscolhido = getNo(size()-1);
        } else {
            noAnteriorAoEscolhido = getNo(index-1);
        }
        noAnteriorAoEscolhido.setNoProximo(getNo(index).getNoProximo());
        tamanhoLista--;

    }
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    private int size() {
        return tamanhoLista;
    }

    private boolean isEmpty() {
        return tamanhoLista == 0;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += primeiroNo;
        return strRetorno;
    }


}
