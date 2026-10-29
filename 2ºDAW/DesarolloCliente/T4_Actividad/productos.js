class IProducto {
    aplicarDescuento() {}
    mostrarInformacion() {}

}

class Producto extends IProducto {
    #nombre;
    #precio;
    #marca;

    constructor(nombre, precio, marca) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    //getters y setters de la clase
    get nombre() {
        return this.#nombre;
    }

    set nombre(nombre) {
        //comprobamos que el nombre no sea vacío y que sea una cadena de texto
        if (nombre === "" || typeof nombre !== "string") {
            throw new Error("El nombre no puede estar vacío y debe ser una cadena de texto");
        } else {
             this.#nombre = nombre;
        }
    }

    get precio() {
        return this.#precio;
    }

    set precio(precio) {
        //comprobamos que el precio sea un número positivo
        if (typeof precio !== "number" || precio < 0) {
            throw new Error("El precio debe ser un número positivo");
        } else {
            this.#precio = precio;
        }
    }

    get marca() {
        return this.#marca;
    }

    set marca(marca) {
        //comprobamos que la marca no sea vacía y que sea una cadena de texto
        if (marca === "" || typeof marca !== "string") {
            throw new Error("La marca no puede estar vacía y debe ser una cadena de texto");
        } else {
            this.#marca = marca;
        }
    }

    //metodos estáticos de producto
    static precioPromedio(productos){
        console.log('Precio promedio: ' + productos.reduce((acumulador, producto) => acumulador + producto.precio, 0) / productos.length);
    }

   static contarPorMarca(inventarios) {
        let resultado;
        resultado += inventarios.filter((MismaMarca) => MismaMarca.marca().equals(this.#marca));        
        console.log('El número de marcas coincidentes es de: '+resultado);

    }

    aplicarDescuento(descuento){
        this.precio = (this.precio - descuento)/100;
    }

    mostrarInformacion(){
        console.log("Los valores del producto: su nombre:"+this.#nombre+", su precio: "+this.#precio+", su marca: "+this.#marca);

    }

}

class EquipoInformatico extends Producto {
    memoriaRam;
    procesador;
    constructor(nombre, precio, marca, memoriaRam, procesador) {
        super(nombre, precio, marca);
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
    }   

    //getters y setters de la clase
    get memoriaRam() {
        return this.memoriaRam;
    }

    get procesador() {
        return this.procesador;
    }

    set memoriaRam(memoriaRam) {
       //comprobamos que el procesador sea una cadena de texto
        if (typeof memoriaRam !== "string") {
            throw new Error("La memoria RAM debe ser una cadena de texto");
        } else {
            this.memoriaRam = memoriaRam;
        }
    }

    set procesador(procesador) {
        //comprobamos que el procesador sea una cadena de texto
        if (typeof procesador !== "string") {
            throw new Error("El procesador debe ser una cadena de texto");
        } else {
            this.procesador = procesador;
        }
    }

    aplicarDescuento(descuento) {
            if (this.marca === "acer") {
                this.precio = (this.precio - 15)/100;
            }
    }

}

class Electrodomestico extends Producto {
    #consumoEnergetico;
    #garantia;

    constructor(nombre, precio, marca, consumoEnergetico, garantia) {
        super(nombre, precio, marca);
        this.consumoEnergetico = consumoEnergetico;
        this.garantia = garantia;
    }

    //getters y setters de la clase
    get consumoEnergetico() {
        return this.#consumoEnergetico;
    }

    get garantia() {
        return this.#garantia;
    }

    set consumoEnergetico(consumoEnergetico) {
    
       if (!["A++", "A+", "B", "C"].includes(consumoEnergetico)) {
        throw new Error("Consumo energético incorrecto");
    }

        this.#consumoEnergetico = consumoEnergetico;
    }

    set garantia(garantia) {
        //comprobamos que la garantia sea un número positivo
        if (typeof garantia !== "number" || garantia < 0) {
            throw new Error("La garantía debe ser un número positivo");
        } else {
            this.#garantia = garantia;
        }
    }

    aplicarDescuento(){
        if (this.precio > 600) {
            let descuento = (this.precio - 10)/100;
            this.precio = this.precio - descuento;
        }
    }

}

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


//Ejemplos de casos de uso de las clases para ver que funcionan correctamente
let producto1 = new Producto("Producto 1", 100, "Marca 1");
let producto2 = new Producto("Producto 2", 200, "Marca 2");
let producto3 = new Producto("Producto 3", 300, "Marca 1");

//Ejemplo de uso de la clase EquipoInformatico
let equipo1 = new EquipoInformatico("Equipo 1", 500, "Marca 1", "16GB", "Intel i7");
let equipo2 = new EquipoInformatico("Equipo 2", 500, "Acer", "16GB", "Intel i5");

//Ejemplo de uso de la clase Electrodomestico
let electrodomestico1 = new Electrodomestico("Electrodomestico 1", 700, "Marca 1", "A++", 2);
let electrodomestico2 = new Electrodomestico("Electrodomestico 1", 1500, "Marca 2", "B", 2);
let electrodomestico3 = new Electrodomestico("Electrodomestico 3", 1200, "Marca 3", "A+", 2);

//Ejemplo de uso de los métodos de las clases
producto1.mostrarInformacion();
producto2.mostrarInformacion();
equipo1.mostrarInformacion();
electrodomestico1.mostrarInformacion();

//Ejemplo de uso del método aplicarDescuento
producto1.aplicarDescuento(10);
equipo1.aplicarDescuento();
electrodomestico1.aplicarDescuento();
//Mostrar el precio del electrodomestico con descuento
electrodomestico1.mostrarInformacion();

//Ejemplo de uso del método precioPromedio
Producto.precioPromedio([producto1, producto2, producto3]);

//Ejemplo de uso del método contarPorMarca
Producto.contarPorMarca([producto1, producto2, producto3]);

//Ejemplo de uso del método contarPorMarca
equipo1.contarPorMarca([equipo1, producto1, producto2, producto3]);

//Ejemplo de Inventario
//Crear un inventario y añadir productos al mismo
let inventario = [];
inventario.push(producto1);
inventario.push(producto2);
inventario.push(producto3);
inventario.push(equipo1);
inventario.push(electrodomestico1);

//Ejemplo de uso del inventario
console.log("Inventario: ");

inventario.forEach(producto => {
    producto.mostrarInformacion();
});

