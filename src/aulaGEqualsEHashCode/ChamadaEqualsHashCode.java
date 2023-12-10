package aulaGEqualsEHashCode;

import java.util.ArrayList;
import java.util.List;

public class ChamadaEqualsHashCode {
    public static void chamadaEqualsHashCode() {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Volskwagem"));

        System.out.println(carros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        System.out.println(carros.get(0).equals(carros.get(1)));

        Carro carroTest1 = new Carro("Ford");
        Carro carroTest2 = new Carro("Chevrolet");

        System.out.println(carroTest1.equals(carroTest2));
        System.out.println(carroTest1.equalsObject(carroTest2));
    }
}
