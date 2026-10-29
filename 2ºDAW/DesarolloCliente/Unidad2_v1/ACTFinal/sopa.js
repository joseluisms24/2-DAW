let tablero;
//PETICION DE FILAS Y COLUMNAS
let filas = parseInt(prompt("Dame el numero de filas (debe ser entre 1 y 12)"));
/* El || se utiliza para que entre si al menos una de las condiciones es validas.
 en este caso es necesario porque no existe un numero <1 que sea tambien < 12.
 */
while (isNaN(filas) || filas <=  0 || filas >= 13) {
    alert('Te has pasado del rango permitido debe ser ENTRE 1 Y 12, lo has puesto vacío o has puesto una letra.');
    filas = parseInt(prompt("Dame el numero de filas (debe ser entre 1 y 12)"));
}

//Comprobación de posibles casos de error en filas y columnas comprobando que no le de a cancelar, esté vacio, no sea un numero y sea mayor a 0 y menor a 13
let columnas = parseInt(prompt("Dame el numero de columnas(debe ser entre 1 y 12)"));
   while (isNaN(columnas) ||  columnas <= 0 || columnas >= 13){
        alert('Te has pasado del rango permitido debe ser ENTRE 1 Y 12, lo has puesto vacío o has puesto una letra  .');
        columnas = parseInt(prompt("Dame el numero de columnas (debe ser entre 1 y 12)"));
         
}


document.getElementById('titulo').innerHTML='Sopa de Letras';
//Botones inactivos hasta no dar válido los valores de la tabla.
document.getElementById('palabra').hidden=false;
document.getElementById('mostrarSopa').hidden=false;
//document.getElementById('comprobar').hidden=false;

inicializarTablero(filas, columnas);


/*Funcion principal la cual ejecutará la acción principal de la sopa de letra 
que añadirá o permitirá palabras en el tablero con las validaciones*/
function ejecutarPalabra() {

    let palabra = prompt("Dame una palabra para poner en el tablero");
    //Comprueba que el usuario le dé a cancelar
    //El === sirve para realizar una comparación más estricta que el == que es este es más permisivo.
    if (palabra === null) return;

    // Validar que no esté vacía
    while (palabra.trim() === "") {
        palabra = prompt("La palabra no puede estar vacía. Introduce una palabra:");

        if (palabra === null) return;
    }

    let letras = palabra.split('');

    // PEDIR DIRECCIÓN PARA COLOCAR LAS LETRAS
    let direccion = parseInt(prompt("Elige la dirección que quieres darle a la palabra: 1 Derecha ->, 2 Izquierda <-, 3 ^ Arriba, 4 Abajo"));

    // Validar dirección
    while (isNaN(direccion) || direccion <= 0 || direccion >= 5) {
    alert('Te has pasado del rango permitido debe ser ENTRE 1 Y 4 o lo has puesto vacío.');
    direccion = parseInt(prompt("Elige la dirección que quieres darle a la palabra: 1 Derecha ->, 2 Izquierda <-, 3 ^ Arriba, 4 Abajo"));
}

    // SWITCH PARA DETERMINAR EL MOVIMIENTO QUE SE HARA EN LA COLOCACIÓN DE LA PALABRA Y PARA LOS CALCULOS POSTERIORES.
    let movimientoF = 0;
    let movimientoC = 0;

    switch (direccion) {

        case 1: // DERECHA
            movimientoC = 1;
            break;

        case 2: // IZQUIERDA
            movimientoC = -1;
            break;

        case 3: // ARRIBA
            movimientoF = -1;
            break;

        case 4: // ABAJO
            movimientoF = 1;
            break;
    }

    let posicionF;
    let posicionC;
    let valido = false;

    // REPETIR HASTA ENCONTRAR UNA POSICIÓN VÁLIDA
    while (!valido) {
        //En las entradas del usuario para colocar se resta uno para ir en concordancia con el tablero en Arrays
        posicionF = parseInt(prompt("Dame la fila inicial (entre 1 y " + tablero.length + ")"))-1;
        posicionC = parseInt(prompt("Dame la columna inicial (entre 1 y " + tablero[0].length + ")"))-1;

    // VALIDAMOS QUE LAS POSICIONES SEAN CORRECTAS SINO SE PIDE DE NUEVO.
    if (isNaN(posicionF) || isNaN(posicionC) || posicionF < 0 || posicionF >= tablero.length || posicionC < 0 || posicionC >= tablero[0].length) {
        alert("Fila o columna incorrecta. Inténtalo de nuevo.");
        //LOS CONTINUE LO QUE HACE ES QUE VUELVA AL PRINCIPIO Y PIDE OTRAS POSICIONES.
        continue;
    }

        // CALCULAR DÓNDE TERMINARÍA LA PALABRA
        let filaFinal = posicionF + (letras.length - 1) * movimientoF;
        let columnaFinal = posicionC + (letras.length - 1) * movimientoC;

        // COMPROBAR SI CABE
        if (filaFinal < 0 || filaFinal >= tablero.length || columnaFinal < 0 || columnaFinal >= tablero[0].length) {
            alert("La palabra no cabe en esa dirección. Elige otra posición.");
            continue;
        }

        // COMPROBAR SI ALGUNA POSICIÓN ESTÁ OCUPADA
        let ocupado = false;

        for (let i = 0; i < letras.length; i++) {

            let filaActual = posicionF + i * movimientoF;
            let columnaActual = posicionC + i * movimientoC;

            if (tablero[filaActual][columnaActual] !== '?') {
                ocupado = true;
                break;
            }
        }

        if (ocupado) {
            alert("Esa posición está ocupada. Elige otra posición.");
            continue;
        }

        // Si llega aquí, todo es correcto
        valido = true;
    }

    // INTRODUCIR LA PALABRA EN EL TABLERO

    for (let i = 0; i < letras.length; i++) {

        tablero[posicionF][posicionC] = letras[i];

        posicionF += movimientoF;
        posicionC += movimientoC;
    }

    // ACTUALIZAR EL TABLERO VISUALMENTE
    mostrarTablero();

    alert("Palabra introducida correctamente.");
}

//Enseña el tablero por la página estructurado en una variable para mostrar en el html
function mostrarTablero(filas, columnas) {

    let tabla = "<table border='2'>";

    for (let x = 0; x < tablero.length; x++) {

        tabla += "<tr>";

        for (let y = 0; y < tablero[x].length; y++) {

            tabla += "<td style='border: 2px solid black; text-align: center; width: 30px; height: 30px;'>";

            tabla += tablero[x][y];

            tabla += "</td>";
        }

        tabla += "</tr>";
    }

    tabla += "</table>";

    document.getElementById("tablero").innerHTML = tabla;
}

//Función independiente que inicializa el tablero

function inicializarTablero(filas, columnas) {
    
    tablero = new Array(filas);

    for (let x = 0; x < tablero.length; x++) {

        tablero[x] = new Array(columnas);

        for (let y = 0; y < tablero[x].length; y++) {

            tablero[x][y] = '?';

        }
    }

    mostrarTablero();

}

//Función que completará el tablero añadiendo palabras aleatorias quedando escondidas las introducidas.
function mostrarSopa() {
    let abecedario = "abcdefghijklmnopqrstuvwxyz";
    let arrayabecedario = abecedario.split('');
      /* AQUÍ EXPLICO LOS VALORES DE ++ QUE BASICAMENTE UN INCREMENTO DE LA VARIABLE EN EL CASO DE ABAJO 
    I PARA INCREMENTARSE AL ACABAR EL FOR COMPLETO*/
    for (let i = 0; i < tablero.length; i++) {
        for (let j = 0; j < tablero[i].length; j++) {
            if (tablero[i][j] === '?' ) {
                //ELIGE UN NUMERO AL AZAR DE FORMA ALEATORIA Y PASO EL ABECEDARIO A UN ARRAY 
                // Y PONGO EN UN ? UNA LETRA ALEATORIA
                let numeroAleatorio = Math.floor(Math.random()*26);
                tablero[i][j] = arrayabecedario[numeroAleatorio];
            }

        }
        
    }
    mostrarTablero();
    document.getElementById('palabra').hidden=false;
    document.getElementById('mostrarSopa').hidden=false;
}
