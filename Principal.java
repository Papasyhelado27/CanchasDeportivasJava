/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CanchasDeportivas;

import javax.swing.JOptionPane;

/**
 *
 * @author salaj
 */
public class Principal {

    public static void main(String[] args) {

        lista lis = new lista();

        while (true) {
            String opcion = JOptionPane.showInputDialog(" "
                    + "1......Introducir un Reserva a la lista \n"
                    + "2......buscar un Reserva con la identificacion del cliente en la lista \n"
                    + "3......Mostrar las reservas \n"
                    + "4......Eliminar Reserva la reserva con la identificacion del Usuario \n"
                    + "5......Salir  \n"
            );

            int opc = Integer.parseInt(opcion);

            if (opc >= 5 || opc == 0) {

                JOptionPane.showInputDialog(null, "El numero Ingresado no se encuentra entre las opciones");

            }

            switch (opc) {
                case 1:

                    String nameCliente = JOptionPane.showInputDialog("Ingrese el Nombre del Cliente:");
                    String id = JOptionPane.showInputDialog("Ingrese la Identificación:");
                    String duracionHorasStr = JOptionPane.showInputDialog("Ingrese la Duración de la Reserva (en horas):");
                    String numCancStr = JOptionPane.showInputDialog("Ingrese el Número de la Cancha:");

                    // Convertir las entradas a enteros
                    int duracionHoras = Integer.parseInt(duracionHorasStr.trim());
                    int numCanc = Integer.parseInt(numCancStr.trim());

                    // Llamar al método para insertar la reserva
                    lis.insertarReservaInicio(nameCliente, id, duracionHoras, numCanc);

                    JOptionPane.showMessageDialog(null, "Reserva creada exitosamente!");
                    break;

                case 2:
                    String Buscar = JOptionPane.showInputDialog("Bucar Reserva con Identificacion del usuario");

                    nodo N = lis.buscarId(Buscar);
                    System.out.println(" Esta es la reserva encontrada: " + N.toString());
                    break;

                case 3:
                    lis.verReservas();
                    System.out.println("");
                    break;

                case 4:
                    String idEliminar = JOptionPane.showInputDialog("Ingrese la Identificación de la Reserva a Eliminar:");

                    boolean eliminado = lis.eliminarReserva(idEliminar);
                    if (eliminado) {
                        JOptionPane.showMessageDialog(null, "Reserva eliminada exitosamente!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ninguna reserva con esa identificación.");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

            }
        }
    }

}
