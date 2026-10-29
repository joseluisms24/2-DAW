package backend_4;

public class main {
    public static void main(String[] args) {

 
        producto producto1 = new producto("Teclado", 25.99, 10);

        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Hay stock: " + producto1.hayStock());
        System.out.println("Valor total del stock: "
                + producto1.calcularValorTotal(producto1.getPrecio(), producto1.getStock()) + " €");

        producto producto2 = new producto("Raton", 15.99, 20);

        System.out.println("Producto: " + producto2.getNombre());
        System.out.println("Hay stock: " + producto2.hayStock());
        System.out.println("Valor total del stock: "
                + producto2.calcularValorTotal(producto2.getPrecio(), producto2.getStock()) + " €");

        producto producto3 = new producto("Monitor", 199.99, 5);

        System.out.println("Producto: " + producto3.getNombre());
        System.out.println("Hay stock: " + producto3.hayStock());
        System.out.println("Valor total del stock: "
                + producto3.calcularValorTotal(producto3.getPrecio(), producto3.getStock()) + " €");

         String[] productosDisponibles = {producto1.getNombre(), producto2.getNombre(), producto3.getNombre()};
         for (String producto : productosDisponibles) {
            System.out.println("Producto disponible: " + producto);
         }

         //Calcular en valor total de dos productos
            double valorTotalProductos = producto1.calcularValorTotal(producto1.getPrecio(), producto1.getStock())
                    + producto2.calcularValorTotal(producto2.getPrecio(), producto2.getStock());
            System.out.println("Valor total de los productos: " + valorTotalProductos + " €");


         //Calcular el producto con mayor stock
         producto productoConMayorStock = producto1;
         if (producto2.getStock() > productoConMayorStock.getStock()) {
             productoConMayorStock = producto2;
         }
         if (producto3.getStock() > productoConMayorStock.getStock()) {
             productoConMayorStock = producto3;
         }
         System.out.println("Producto con mayor stock: " + productoConMayorStock.getNombre() + " (Stock: " + productoConMayorStock.getStock() + ")");

    }

   

}