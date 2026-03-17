package modelo;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidad;

    public Producto() {
    }

    // Getters y Setters de ID
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Getters y Setters de Nombre
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Getters y Setters de Categoria
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    // Getters y Setters de Precio
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Getters y Setters de Cantidad
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}