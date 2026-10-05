package Backend_1;

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
    }
}