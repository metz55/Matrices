import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Agenda*/
        //Nombre
        //Telefono
        //Correo

        //Cada fila representa un contacto
        //Cada columna representa el dato del contacto

        int cantidadContactos = 3;

        String[][] agenda = new String[cantidadContactos][3];

        //Ingresar informacion
        for (int i = 0; i < cantidadContactos; i++){
            System.out.println("Contacto #" + (i + 1));

            System.out.println("Nombre: ");
            agenda[i][0] = scanner.nextLine();

            System.out.println("Telefono: ");
            agenda[i][1] = scanner.nextLine();

            System.out.println("Correo: ");
            agenda[i][2] = scanner.nextLine();
        }

        //Mostar Datos
        System.out.println("----------- Agenda de Contactos -----------");
        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println("Contacto#" + (i + 1));
            System.out.println("Nombre: " + agenda[i][0]);
            System.out.println("Telefono: " + agenda[i][1]);
            System.out.println("Correo: " + agenda[i][2]);

        }

        scanner.close();
    }
}
