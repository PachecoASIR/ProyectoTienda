package Catalogo;

public class Producto {
        private String nombre;
        private double precio;
        private String descripcion;
        private String imagen;
    
        public Producto(String nombre, double precio, String descripcion, String imagen) {
            this.nombre = nombre;
            this.precio = precio;
            this.descripcion = descripcion;
            this.imagen = imagen;
        }
    
        // Métodos get y set para los atributos
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        public void setPrecio(double precio) {
            this.precio = precio;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public String getImagen() {
            return imagen;
        }
    
        public void setImagen(String imagen) {
            this.imagen = imagen;
        }
    }
