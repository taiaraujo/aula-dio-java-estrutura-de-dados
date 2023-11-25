package aulaBFila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                primeiroNo = primeiroNo.getRefNo();
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            noAuxiliar.setRefNo(null);
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
            while (noAuxiliar.getRefNo() != null) {
                noAuxiliar = noAuxiliar.getRefNo();
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
            }
        }
        stringRetorno += "null";
        return stringRetorno;
    }
}
