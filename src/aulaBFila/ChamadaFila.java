package aulaBFila;

public class ChamadaFila {
    public static void chamadaFila() {
        Fila<String> fila = new Fila<>();

        System.out.println(fila);

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("quarto");

        System.out.println(fila);

        System.out.println(fila.dequeue());

        System.out.println(fila);

        fila.enqueue("ultimo");

        System.out.println(fila);

        System.out.println(fila.first());

        System.out.println(fila);
    }
}
