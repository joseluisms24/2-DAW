package Backend_1;

public class producto {
    private String nombre;
    private double precio;
    private int stock;
    

    public producto (String nombre, double precio, int stock) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null  && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
                }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
         if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
    }

    @Override
    public String toString() {
        return "producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
    }

    public double calcularValorTotal(double precio, int stock) {
         return precio*stock;
    }
    
    public boolean hayStock(){
        return stock > 0;

    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        double descuento = precio * (porcentaje / 100);
        precio -= descuento;
    }

    public boolean esMasCaroQue(producto otroProducto) {
        return this.precio > otroProducto.getPrecio();
    }
   public double calcularPrecioTotal(int unidades) {
        return precio * unidades;
    }

}