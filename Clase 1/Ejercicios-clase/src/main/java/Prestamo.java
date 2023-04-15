import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {
        // Monto total: Capital Solicitado + interés a pagar
        // Interés a pagar = Capital Solicitado x interés x período en meses

        int capitalSolicitado = 120000;
        float interes = 0.1f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el período en meses: ");
        int periodoEnMeses = sc.nextInt();
        sc.close();

        float interesAPagar = capitalSolicitado * interes * periodoEnMeses;

        float montoTotal = capitalSolicitado + interesAPagar;

        System.out.println(montoTotal);

    }
}
