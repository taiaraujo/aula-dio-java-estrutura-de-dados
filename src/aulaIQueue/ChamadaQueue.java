package aulaIQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ChamadaQueue {
    public static void chamadaQueue(){
        Queue<Carro> carroQueue = new LinkedList<>();

        carroQueue.add(new Carro("Ford"));
        carroQueue.add(new Carro("Chevrolet"));
        carroQueue.add(new Carro("Fiat"));

        System.out.println(carroQueue.add(new Carro("Renault")));
        System.out.println(carroQueue);


        System.out.println(carroQueue.peek());
        System.out.println(carroQueue);

        System.out.println(carroQueue.poll());
        System.out.println(carroQueue);

        System.out.println(carroQueue.isEmpty());
        System.out.println(carroQueue.size());

    }
}
