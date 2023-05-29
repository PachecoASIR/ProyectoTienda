package Catalogo;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList<>();
    }

    // Método para agregar un producto al catálogo
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto del catálogo
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para buscar un producto por nombre en el catálogo
    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // Método para obtener una lista de productos filtrados por precio máximo
    public ArrayList<Producto> filtrarPorPrecioMaximo(double precioMaximo) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() <= precioMaximo) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }
}