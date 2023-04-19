import java.util.Scanner;

public class MesDelAno {
    public static void main(String[] args) {

        System.out.println("Ingrese un mes del año: ");

        Scanner scanner = new Scanner(System.in);

        String intputUsuario = scanner.nextLine().toLowerCase();

        scanner.close();

        switch(intputUsuario) {

            case "enero":
                System.out.println("El mes ingresado es el número " + 1);
                break;
            case "febrero":
                System.out.println("El mes ingresado es el número " + 2);
                break;
            case "marzo":
                System.out.println("El mes ingresado es el número " + 3);
                break;
            case "abril":
                System.out.println("El mes ingresado es el número " + 4);
                break;
            case "mayo":
                System.out.println("El mes ingresado es el número " + 5);
                break;
            case "junio":
                System.out.println("El mes ingresado es el número " + 6);
                break;
            case "julio":
                System.out.println("El mes ingresado es el número " + 7);
                break;
            case "agosto":
                System.out.println("El mes ingresado es el número " + 8);
                break;
            case "septiembre":
                System.out.println("El mes ingresado es el número " + 9);
                break;
            case "octubre":
                System.out.println("El mes ingresado es el número " + 10);
                break;
            case "noviembre":
                System.out.println("El mes ingresado es el número " + 11);
                break;
            case "diciembre":
                System.out.println("El mes ingresado es el número " + 12);
                break;
            default:
                System.out.println("El valor ingresado no es un mes válido");
        }



    }

}
