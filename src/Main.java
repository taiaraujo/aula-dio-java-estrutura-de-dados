import static aulaAPilha.ChamadaPilha.chamadaPilha;
import static aulaBFila.ChamadaFila.chamadaFila;
import static aulaCListaEncadeada.ChamadaListaEncadeada.chamadaListaEncadeada;
import static aulaDListaDuplamenteEncadeada.ChamadaListaDuplamenteEncadeada.chamadaListaDuplamenteEncadeada;
import static aulaEListaCircular.ChamadaListaCircular.chamadaListaCircular;
import static aulaFArvore.ChamadaArvoreBinaria.chamadaArvoreBinaria;
import static aulaGEqualsEHashCode.ChamadaEqualsHashCode.chamadaEqualsHashCode;
import static aulaHStack.ChamadaStack.chamadaStack;
import static aulaIQueue.ChamadaQueue.chamadaQueue;
import static aulaJList.ChamadaList.chamadaList;
import static aulaKSet.ChamadaSet.chamadaSet;
import static aulaLMap.ChamadaMap.chamadaMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        chamadaFila();
        chamadaPilha();
        chamadaListaEncadeada();
        chamadaListaDuplamenteEncadeada();
        chamadaListaCircular();
        chamadaArvoreBinaria();
        chamadaEqualsHashCode();
        chamadaStack();
        chamadaQueue();
        chamadaList();
        chamadaSet();
        chamadaMap();
    }
}