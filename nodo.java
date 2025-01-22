/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CanchasDeportivas;

/**
 *
 * @author salaj
 */
public class nodo {
    
    String NameCliente;
    String Id;
    int DuracionHoras;
    int numCancha;
    nodo enlace;

    public nodo(String NameCliente, String Id, int DuracionHoras, int numCancha) {
        this.NameCliente = NameCliente;
        this.Id = Id;
        this.DuracionHoras = DuracionHoras;
        this.numCancha = numCancha;
        this.enlace = null;
    }

    @Override
    public String toString() {
        return "Nodo{" + "NameCliente=" + NameCliente + ", Id=" + Id + ", DuracionHoras=" + DuracionHoras + ", numCancha=" + numCancha + '}';
    }


    
    
    
}
