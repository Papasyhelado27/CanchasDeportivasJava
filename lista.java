/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CanchasDeportivas;

import javax.swing.JOptionPane;

/**
 *
 * @author salazarJp
 */
public class lista {
    
    public nodo inicio;
    
    public lista(){
        
        inicio = null;
        
    }public lista insertarReservaInicio(String NameCliente, String Id, int DuracionHoras, int numCanc) {
        try {
            if (numCanc > 0) {
                nodo nuevaReserva = new nodo(NameCliente, Id, DuracionHoras, numCanc);
                nuevaReserva.enlace = inicio;
                inicio = nuevaReserva;
            } else {
                throw new IllegalArgumentException("El número de cancha debe ser positivo.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa solo números.");
        }
        return this;
              
        
        }public void verReservas() {
    nodo actual = inicio; // Inicializa 'actual' con el nodo de inicio

    // Verifica si la lista está vacía
    if (actual == null) {
        JOptionPane.showMessageDialog(null, "Lista Vacía");
    } else {
        StringBuilder reservas = new StringBuilder(); // Usar StringBuilder para concatenar reservas
        while (actual != null) {
            reservas.append(actual.toString()).append("\n"); // Agregar la reserva al StringBuilder
            actual = actual.enlace; // Avanzar al siguiente nodo
        }
        
        // Mostrar todas las reservas de una vez
        JOptionPane.showMessageDialog(null, reservas.toString(), "Reservas", JOptionPane.INFORMATION_MESSAGE);
    }
}  public void agregarFinal(nodo newNodo){
                    nodo tempo = inicio;
                    
                    if(tempo==null){
                        inicio = newNodo;
                    }else{
                        
                        while(tempo.enlace != null){
                            
                            tempo = tempo.enlace;
                        }
                        tempo.enlace = newNodo;
                        }
                    
                    }public nodo buscarId(String Id){
                    nodo actual = inicio;
                    
                    while(actual != null){
                        
                        if(actual.Id.equals(Id)){
                            
                            return actual;
                        }
                        
                        actual = actual.enlace;
                    }
                     return null;
                    } public boolean eliminarReserva(String Id){
                     nodo actual = inicio;
                     nodo anterior = null;
                     
                     while(actual != null){
                     if(actual.Id.equals(Id)){
                      if(anterior == null){
                       inicio = actual.enlace;
                      }else{
                          anterior.enlace = anterior.enlace;
                      }
                      return true;
                     }
                     anterior = actual;
                     actual = actual.enlace;
                     }
                     return false;
                     }
                    
                    }    
                
                
                
                
        
                
        
        
    
    
    
    
    

