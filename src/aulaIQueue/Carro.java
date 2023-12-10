package aulaIQueue;

import java.util.Objects;

public class Carro {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String marca() {
        return marca;
    }

    public Carro setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro carro)) return false;
        return Objects.equals(marca, carro.marca);
    }

    public boolean equalsObject(Object o) {
        return o instanceof Carro carro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
