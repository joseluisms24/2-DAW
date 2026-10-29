//Por último, crearemos una clase Inventario que se encargará de gestionar una colección de productos (de distintos tipos) con los métodos agregar, eliminar, buscar y mostrar productos
class Inventario {
    productos;
    constructor() {
        this.productos = [];
    }

    agregarProducto(productos) {
       this.productos.push(productos);
    }

    eliminarProducto(nombre) {
        const index = this.productos.findIndex(producto => producto.nombre === nombre);
        if (index !== -1) {
            this.productos.splice(index, 1);
        } else {
            throw new Error("El producto no existe en el inventario");
        }
    }

    buscarProducto(nombre) {
        return this.productos.find(producto => producto.nombre === nombre);
    }

    mostrarProductos() {
        return this.productos;
    }
    
    calcularPrecioProductos(){
      for (let i = 0; i < this.productos.length; i++) {
        let precios = this.productos.precio();
        let sumaTotal;
        sumaTotal += precios; 
        console.log("La suma total de todos los productos es de: "+sumaTotal);
      }
        
    }

} 
