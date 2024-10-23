import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerteclado = new Scanner(System.in);

        String nombreCliente;
        String apellidoCliente;
        String cedulaCliente;
        String ciudadCliente;
        byte edadCliente = 18;
        float valorBoleta = 450000;
        int cantidadBoletasCompradas;
        float totalVenta;

        System.out.println("***********************************************");
        System.out.println("BIENVENIDO AL CONCIERTO DE HECTOR Y TITO BUENO");
        System.out.println("***********************************************");

        System.out.print("Digita tu nombre: ");
        nombreCliente = leerteclado.nextLine();
        System.out.print("Digita tu apellido: ");
        apellidoCliente = leerteclado.nextLine();
        System.out.print("Digita tu cedula: ");
        cedulaCliente = leerteclado.nextLine();
        System.out.print("Ciudad: ");
        ciudadCliente = leerteclado.nextLine();
        System.out.print("Digita tu edad: ");
        edadCliente = leerteclado.nextByte();


        if (edadCliente >= 18) {
            System.out.print("Cuantas boletas deseas comprar: ");
            cantidadBoletasCompradas = leerteclado.nextInt();
            leerteclado.nextInt();

            if (cantidadBoletasCompradas > 4) {
                System.out.println("Lo sentimos, solo puedes comprar hasta 4 boletas.");
            } else {
                totalVenta = cantidadBoletasCompradas * valorBoleta;
                System.out.println("Bienvenido, te esperamos en el concierto.");
                System.out.println("El costo total de tu compra es: $" + totalVenta);
            }
        } else {
            System.out.println("Lo sentimos, no tienes la edad suficiente.");
        }
    }
}


















