import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Creamos la clase Persona

class Persona {

    // Le asignamos sus variables del tipo string
    String nombre;
    String apellido;

    // Sumamos los métodos getter y setter para cada variable

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

// Creamos la clase pública ListarPersonas con el método main para correr el programa
public class ListarPersonas {
    public static void main(String[] args) {

        // Creamos la primera persona y seteamos nombre y apellido

        Persona primeraPersona = new Persona();

        primeraPersona.setNombre("Lionel");
        primeraPersona.setApellido("Messi");

        // Creamos la segunda persona y seteamos nombre y apellido

        Persona segundaPersona = new Persona();

        segundaPersona.setNombre("Rodrigo");
        segundaPersona.setApellido("De Paul");

        // Creamos la tercera persona y seteamos nombre y apellido

        Persona terceraPersona = new Persona();

        terceraPersona.setNombre("Enzo");
        terceraPersona.setApellido("Fernández");

        // Creamos la cuarta persona y seteamos nombre y apellido

        Persona cuartaPersona = new Persona();

        cuartaPersona.setNombre("Emiliano");
        cuartaPersona.setApellido("Martínez");

        // Creamos la quinta persona y seteamos nombre y apellido

        Persona quintaPersona = new Persona();

        quintaPersona.setNombre("Nicolás");
        quintaPersona.setApellido("Otamendi");

        // Creamos la lista que va a contener a las personas

        List<Persona> listaPersonas = new ArrayList<>();

        // Agregamos personas al listado

        listaPersonas.add(primeraPersona);
        listaPersonas.add(segundaPersona);
        listaPersonas.add(terceraPersona);
        listaPersonas.add(cuartaPersona);
        listaPersonas.add(quintaPersona);

        // Imprimimos los nombres en orden alfabético

        System.out.println("Nombres de personas en orden alfabético:");

        // Creamos un array para contener los nombres ordenados

        List<String> nombresOrdenados = new ArrayList<>();

        // Agregamos únicamente los nombres en el array

        for (int i = 0; i < listaPersonas.size(); i++) {
            nombresOrdenados.add(listaPersonas.get(i).getNombre());
        }

        // Utilizamos el método sort de Collections para ordenar el array por orden alfabético

        Collections.sort(nombresOrdenados);

        // Imprimimos en consola cada uno de los valores del array que contiene solo los nombres ordenados

        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(nombresOrdenados.get(i));
        }

        System.out.println("-------");

        // Imprimir los apellidos en orden alfabético. Repetimos el mismo procedimiento interno

        System.out.println("Apellidos de personas en orden alfabético:");

        List<String> apellidosOrdenados = new ArrayList<>();

        for (int i = 0; i < listaPersonas.size(); i++) {
            apellidosOrdenados.add(listaPersonas.get(i).getApellido());
        }

        Collections.sort(apellidosOrdenados);

        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(apellidosOrdenados.get(i));
        }

        System.out.println("-------");

        // Imprimir los apellidos en orden alfabético invertido

        System.out.println("Apellidos de personas en orden alfabético inverso:");

        // En este caso, tan solo invertimos el orden del loop for para que comience por el índice más alto
        // Reutilizamos el mismo array del punto anterior

        for (int i = (listaPersonas.size() - 1); i >= 0; i--) {
            System.out.println(apellidosOrdenados.get(i));
        }

        System.out.println("-------");

    }

}
