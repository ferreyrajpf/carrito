/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openshop;
import java.util.ArrayList;
import java.math.BigDecimal;

/**
 *
 * @author juan
 */
public class Carrito {
    public static ArrayList<ProductoEnCarrito>Productos = new ArrayList<ProductoEnCarrito>();
	
    public static void Agregar(Producto producto, int cantidad) {
        
        ProductoEnCarrito prodEnCarrito = new ProductoEnCarrito();
        prodEnCarrito.Producto=producto;
        prodEnCarrito.Cantidad=cantidad;

        Productos.add(prodEnCarrito);	
    }
    
    public static void MostrarCarrito()
        {
            System.out.print("");
            System.out.print("Tienes en tu carrito: ");

            Double totalCarrito=0.0;
          
            for (ProductoEnCarrito item: Productos){
            
                Integer cantidad = item.Cantidad;
                Double precio = item.Producto.Precio;
                String nombre = item.Producto.Nombre;
                System.out.print(cantidad + "x " + nombre + " $" + cantidad * precio);

                totalCarrito=+ cantidad * precio;
            }

            System.out.print("Total: $" + totalCarrito);
        }

}
