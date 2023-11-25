package aulaEListaCircular;

public class ChamadaListaCircular {
    public static void chamadaListaCircular() {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("primeiro");
        listaCircular.add("segundo");
        listaCircular.add("terceiro");
        listaCircular.add("quarto");
        listaCircular.add("quinto");

        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.remove(3);
        System.out.println(listaCircular);

        listaCircular.remove(2);
        System.out.println(listaCircular);



    }
}
