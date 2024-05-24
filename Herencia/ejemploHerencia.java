
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}


public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}


public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje de Programación: " + lenguajeProgramacion);
    }
}


public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 45, 80000, "Ventas");
        Desarrollador desarrollador = new Desarrollador("Carlos", 30, 60000, "Java");

        gerente.mostrarInformacion();
        System.out.println();
        desarrollador.mostrarInformacion();
    }
}
