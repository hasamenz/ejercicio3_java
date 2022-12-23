public class HolaMundo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 20;
        cliente.telefono = 956412352;
        cliente.nombre = "Hugo";
        cliente.credito = 1500;

        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.nombre);
        System.out.println(cliente.credito);

        System.out.println("***************************");
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.telefono = 932123523;
        trabajador.nombre = "Roberto Merino";
        trabajador.salario = 2500;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.salario);

    }
}

class Persona {
    public int edad;
    public String nombre;
    public int telefono;
}

class Cliente extends Persona{
    public int credito;
}

class Trabajador extends Persona {
    public double salario;
}

