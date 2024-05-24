class OverloadDemo {
    void test() {
        System.out.println("No parámetros");
    }

    // Sobrecarga el método test con un parámetro entero.

    void test(int a) {
         System.out.println("en: " + a);
    }

    // Sobrecarga el método test con dos parámetros enteros.
    
    void test(int a, int b) { 
        System.out.println("a y b:" + a + "" + b);
    }

    // Sobrecarga el método test con un parámetro doble.

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double Resultado;

        // Llama a todas las versiones del test().
        
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        Resultado = ob.test(123.25);
        System.out.println("Resultado de ob.test(123.25): " + Resultado);
    }
}