// Clase base Animal
class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico de un animal");
    }
}

// Clase derivada Perro
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}

// Clase derivada Gato
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.hacerSonido(); // Salida: "Guau guau!"
        animal2.hacerSonido(); // Salida: "Miau miau!"
    }
}
