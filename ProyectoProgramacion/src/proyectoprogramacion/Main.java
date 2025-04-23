
package proyectoprogramacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistorialAccesos historial = new HistorialAccesos();

        while (true) { // Menú del usuario
            System.out.println("1. Registrar acceso");
            System.out.println("2. Ver historial");
            System.out.println("3. Estadisticas por usuario");
            System.out.println("4. Estadisticas por motivo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt(); // Variable que almacena la opción seleccionada
            sc.nextLine();

            switch (opcion) { // Casos según la opción elegida por el usuario
                case 1:
                    System.out.print("Usuario: ");
                    String usuario = sc.nextLine(); 
                    System.out.print("Hora: ");
                    String hora = sc.nextLine();
                    System.out.print("Motivo: ");
                    String motivo = sc.nextLine();
                    historial.registrarAcceso(usuario, hora, motivo);
                    break;
                case 2:
                    historial.mostrarAccesosOrdenados();
                    break;
                case 3:
                    historial.mostrarEstadisticasPorUsuario();
                    break;
                case 4:
                    historial.mostrarEstadisticasPorMotivo();
                    break;
                case 0:
                    System.out.println("Saliendo...");  // Salida del bucle
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}