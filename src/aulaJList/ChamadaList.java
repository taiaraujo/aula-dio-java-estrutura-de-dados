package aulaJList;

import java.util.ArrayList;
import java.util.List;

public class ChamadaList {
    public static void chamadaList() {
        List<Carro> carroList = new ArrayList<>();

        carroList.add(new Carro("Fiat"));
        carroList.add(new Carro("Renault"));
        carroList.add(new Carro("Ford"));

        System.out.println(carroList.contains(new Carro("Ford")));
        System.out.println(carroList.indexOf(new Carro("Fiat")));
        System.out.println(carroList.remove(2));
        System.out.println(carroList);

    }
}
