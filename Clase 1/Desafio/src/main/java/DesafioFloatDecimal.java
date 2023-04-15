import java.util.Scanner;
import java.math.BigDecimal;
public class DesafioFloatDecimal {
    public static void main(String[] args) {

        // Creamos un objeto scanner para procesar el input del usuario.

        Scanner scanner = new Scanner(System.in);

        // Pedimos por la consola al usuario que ingrese un número decimal.

        System.out.println("Ingrese un número decimal para dividir la parte entera de la parte decimal: ");

        // Creamos la variable float que alojará el valor ingresado por el usuario.

        float inputUsuario = scanner.nextFloat();

        // Cerramos el scanner.

        scanner.close();

        // Redondeamos el valor ingresado por el usuario para obtener la parte entera y se la asignamos a una nueva variable.

        int parteEntera = (int) Math.floor(inputUsuario);

        // Creamos un objeto BigDecimal que nos asegura la precisión de los valores decimales utilizados.
        // Utilizamos el método subtract de BigDecimal para realizar la resta entre inputUsuario y parteEntera.
        // A su vez, ambas partes son procesadas como objetos BigDecimal.
        // inputUsuario se utiliza como string para mantener la precisión decimal exacta.

        BigDecimal parteDecimal = new BigDecimal(Float.toString(inputUsuario)).subtract(BigDecimal.valueOf(parteEntera));

        // Imprimimos los valores resultantes en la consola.

        System.out.println("La parte entera es: " + parteEntera);
        System.out.println("La parte decimal es: " + parteDecimal);

    }
}
