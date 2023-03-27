public class Main {
    public static void main(String[] args) {
        Cliente persona = new Cliente();
        persona.edad = 23;
        persona.credito = 20;
        persona.nombre = "federico";
        persona.telefono = "2213186889";
        System.out.println(persona.edad);
        System.out.println(persona.credito);
        System.out.println(persona.nombre);
        System.out.println(persona.telefono);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 19;
        trabajador.nombre = "Ignacio";
        trabajador.telefono = "32439841";
        trabajador.salario = 200;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);


    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}

/*
1. Crear una clase Persona con las siguientes variables:
    - edad
    - nombre
    - telefono
2. Una vez creada la clase, crea una nueva clase "Cliente" que herede de Persona, esta nueva clase tendrá una variable "credito" SOLO para esa clase.
3. Crea ahora un objeto de la clase Ciliente que debe tener como propiedades la edad, telefono, nombre y el credito, tenes que darles valor y mostrarlas en pantalla.
3. Una vez hecho el paso 3, hace lo mismo con la clase "Trabajador" que herede de Persona, y con una variable "salariod que solo tenga la clase trabajador."
* */
