
let numeroUsuario = parseInt(prompt("Dame un numero del 1 al 100. Presiona 0 si quieres terminar el juego."));
let numeroAleatorio = Math.floor(Math.random()*100)+1;
let numIntentos = 0;

while (numeroUsuario != 0 && numeroAleatorio != numeroUsuario) {
numIntentos++;

    if (numeroUsuario > numeroAleatorio) {
      alert("El numero que has puesto es más grande que el secreto. Si te rindes pulsa 0");
     
    } else if (numeroUsuario < numeroAleatorio) {
      alert("El numero que has puesto es más pequeño que el secreto. Si te rindes pulsa 0");
    } 

    numeroUsuario = parseInt(prompt("Dame otro numero o Presiona 0 si quieres terminar el juego."));
}

if (numeroUsuario === numeroAleatorio) {
    numIntentos++; // Contamos el último intento que ha sido el correcto
    alert("¡Enhorabuena! Has acertado el número.");
} else {
    alert("Te has rendido.");
}


document.write("El juego se ha terminado con este numero de intentos: "+numIntentos+" y el numero secreto era: "+numeroAleatorio);
