/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablaproductos;

/**
 *
 * @author YEFER
 */
public class TablaProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    dao.ProductoDAO dao = new dao.ProductoDAO();
    modelo.Producto p = new modelo.Producto();

    // --- PROCESO DE ACTUALIZACIÓN ---
    // 1. Definimos el ID de un producto que ya esté en Laragon (ejemplo: ID 1)
    p.setId(3); 
    
    // 2. Definimos los nuevos datos
    p.setNombre("Proteína Whey (Sabor Vainilla)");
    p.setCategoria("Suplementos Premium");
    p.setPrecio(62.50);
    p.setCantidad(30);

    // 3. Llamamos al método
    if (dao.actualizar(p) == 1) {
        System.out.println("¡SISTEMA GESBOX: Producto actualizado!");
    } else {
        System.out.println("Error: No se pudo actualizar el registro.");
    }
}    
}    
