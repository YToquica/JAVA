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

    // --- AGREGANDO PRODUCTO PARA EL GIMNASIO ---
    p.setNombre("Proteina");
    p.setCategoria("Suplementos");
    p.setPrecio(55.0);
    p.setCantidad(20);
    
    dao.agregar(p);

    // --- MOSTRANDO EL INVENTARIO DE GESBOX ---
    System.out.println("======= INVENTARIO GESBOX =======");
    System.out.printf("%-5s %-20s %-15s %-10s %n", "ID", "NOMBRE", "CATEGORÍA", "STOCK");
    
    for (modelo.Producto item : dao.listar()) {
        System.out.printf("%-5d %-20s %-15s %-10d %n", 
            item.getId(), item.getNombre(), item.getCategoria(), item.getCantidad());
    }
      
}    
}
