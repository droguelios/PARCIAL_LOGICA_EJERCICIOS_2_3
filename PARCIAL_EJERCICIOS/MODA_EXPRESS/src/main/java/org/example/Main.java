package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre y apellidos del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Tipo de cliente (Regular o VIP): ");
        String tipoCliente = scanner.nextLine().toLowerCase();

        System.out.print("Cantidad de artículos comprados: ");
        int cantidadArticulos = scanner.nextInt();

        System.out.print("Precio total de la compra: ");
        double precioTotal = scanner.nextDouble();

        double descuento = 0;

        if (tipoCliente.equals("regular")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = 0.05;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = 0.10;
            } else if (cantidadArticulos > 6) {
                descuento = 0.15;
            }
        } else if (tipoCliente.equals("vip")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = 0.10;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = 0.15;
            } else if (cantidadArticulos > 6) {
                descuento = 0.20;
            }
        }

        double montoDescuento = precioTotal * descuento;
        double totalAPagar = precioTotal - montoDescuento;

        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Total a pagar: $" + totalAPagar);

        scanner.close();
    }
}
