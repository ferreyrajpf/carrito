/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openshop;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class GestorVentas {

    public static ArrayList<Carrito>carrito = new ArrayList<>();
    public static ArrayList<FormasPago>formasDePago = new ArrayList<FormasPago>();
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        formasDePago.add(new FormasPago("Efectivo"));              
        formasDePago.add(new FormasPago("Tarjeta en 12 pagos"));
        
        while (true){
            boolean finalizado = Comprar();
            
            if(finalizado){
                break;
            }
        }
       
    }
    
    static public boolean Comprar(){
        //mostramos los productos disponibles
        RegistroProducto registrar = new RegistroProducto();
        registrar.MostrarProductos();
        
        System.out.println();
        System.out.print("Seleccione un producto");
        Scanner input = new Scanner(System.in);
        String productoIngresado= input.nextLine();
        Integer posicion = Integer.parseInt(productoIngresado) - 1;
        Producto producto= registrar.Productos.get(posicion);
    
        System.out.println();
        System.out.print("Introduzca la cantidad que desea comprar");
        input = new Scanner(System.in);
        String cantidadIngresada= input.nextLine();
        Integer intCantidad= Integer.parseInt(cantidadIngresada);
     
        Carrito.Agregar(producto,intCantidad);
        Carrito.MostrarCarrito();
        return true;
    }
    

	
}
