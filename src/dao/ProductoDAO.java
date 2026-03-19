package dao;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

public class ProductoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // 1. CREATE: Agregar producto
    public int agregar(Producto p) {
        String sql = "INSERT INTO productos(nombre, categoria, precio, cantidad) VALUES(?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getCategoria());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getCantidad());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) { return 0; }
    }

    // 2. READ: Listar productos
    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                lista.add(p);
            }
        } catch (Exception e) { System.out.println(e); }
        return lista;
    }
    
    // 3. UPDATE; Actualizar productos
    
    public int actualizar(modelo.Producto p) {
    // Definimos la consulta SQL apuntando al ID específico
    String sql = "UPDATE productos SET nombre=?, categoria=?, precio=?, cantidad=? WHERE id=?";
    try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        
        // Pasamos los nuevos valores
        ps.setString(1, p.getNombre());
        ps.setString(2, p.getCategoria());
        ps.setDouble(3, p.getPrecio());
        ps.setInt(4, p.getCantidad());
        
        // El quinto parámetro es el ID del producto que queremos cambiar
        ps.setInt(5, p.getId());
        
        ps.executeUpdate();
        return 1; // Éxito
    } catch (Exception e) {
        System.err.println("Error al actualizar en la DB: " + e);
        return 0; // Fallo
    }
}
    

    // 3. DELETE: Eliminar producto
    public void eliminar(int id) {
        String sql = "DELETE FROM productos WHERE id=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) { }
    }
}