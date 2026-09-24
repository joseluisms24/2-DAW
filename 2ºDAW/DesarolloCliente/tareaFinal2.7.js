//6,7 en binario - desplazamiento. 9  (dos operadores) y 10 con prompt(Añadir unicamente Salir en una opción salir)
//Ej1
let num1 = 7;
let num2 = 10;

if (num1 >= num2) {
    document.write("El "+num1+" es mayor o igual a "+num2+"<br>");
    
} else {
    document.write("El "+num2+" es mayor que "+num1+"<br>");

}

//Ej2

for (let i = 0; i <= 100; i++) {
   if(i % 5 == 0) {
        document.write (i+" ");
   }
}
document.write("<br>");
//ej3

for (let i = 0; i <= 100; i++) {
   if(i % 2 == 0 && i % 3 == 0) {
        document.write (i+" ");
   }
}
document.write("<br>");

//ej4

let numero1 = parseFloat(prompt("Dime un numero cualquiera."));
let numero2 = parseFloat(prompt("Dime un segundo numero cualquiera."));
let resultado = 0.0;

 document.write("El resultado es: ");
 document.write(resultado = numero1 + numero2);
 document.write("<br>");
 
 //ej5

 let ano = parseInt(prompt("Dime un año."));

 if (ano % 4 == 0) {
    if(ano % 100 == 0){
        if(año % 400 == 0 ) {
            document.write("El año "+ano+" es bisiesto");
        } else {
            document.write("El año "+ano+" no es un año bisiesto.");
        }
    } else {
        document.write("El año "+ano+" es bisiesto");
    }
 } else {
    document.write("El año "+ano+" no es un año bisiesto.");
 }

 //ej6


 