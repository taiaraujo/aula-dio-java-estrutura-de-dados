package aulaFArvore;

import aulaFArvore.model.Obj;

public class ChamadaArvoreBinaria {
    public static void chamadaArvoreBinaria() {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));
        minhaArvore.remover(new Obj(32));

        minhaArvore.exibirEmOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
