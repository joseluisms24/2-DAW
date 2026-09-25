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

let i = 0;
while (i <= 100) {
    if(i % 5 == 0) {
        document.write (i+" ");
   }
   i++;
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

 let anio = parseInt(prompt("Dime un año."));

 if (anio % 4 == 0) {
    if(anio % 100 == 0){
        if(anio % 400 == 0 ) {
            document.write("El año "+anio+" es bisiesto");
        } else {
            document.write("El año "+anio+" no es un año bisiesto.");
        }
    } else {
        document.write("El año "+anio+" es bisiesto");
    }
 } else {
    document.write("El año "+anio+" no es un año bisiesto.");
 }
  document.write("<br>");

 //ej6

 let res = 80>>2;
 document.write(res>>2);
  document.write("<br>");

 //ej7
 
 let res1 = 120<<16;
 document.write(res1);
  document.write("<br>");

 //ej8

 let numero = 0;

 while (numero <= 10) {
    document.write("Este es el valor actual de numero con while: "+numero);
    document.write("<br>");
    numero++;    

 }
document.write("<br>");

 for (let numeroFor = 0; numeroFor <= 10; numeroFor++) {
     document.write("Este es el valor actual de numero con for: "+numeroFor);
     document.write("<br>");
     numeroFor++;    
 }

 //ej9
 document.write(" <br> Se va a pedir valores para calcular dos numeros: primero la opcion del 1 al 4 y luego los numeros a calcular.");
 let opcion = parseInt(prompt("Dame una opción que es un numero del 1 al 4: 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.- Dividir, otro termina."));
 let numerosw1 = parseInt(prompt("Dame un numero tenga en cuenta que sea el primero para la división."));
  let numerosw2 = parseInt(prompt("Dame un numero tenga en cuenta que sea el segundo para la división."));
 document.write("<br>");
  let ressw = 0;
    switch (opcion) {
         case 1:
            ressw = numerosw1+numerosw2;
            document.write("El resultado de la suma es: "+ressw);
            break;
         case 2:
            ressw = numerosw1-numerosw2;
            document.write("El resultado de la resta es: "+ressw);
              break;    
        case 3:
            ressw = numerosw1*numerosw2;
            document.write("El resultado de la multiplicacion es: "+ressw);
             break;
       case 4:
            ressw = numerosw1/numerosw2;
            document.write("El cociente de la division es: "+ressw);
            break;
        default:
            document.write("Adios");
          break;
    }

     document.write("<br>");
    //ej 10
    document.write("Se va a pedir valores para calcular dos numeros: primero la opcion del 1 al 5 y luego los numeros a calcular.");
 let opcion1 = parseInt(prompt("Dame una opción que es un numero del 1 al 5: 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.- Dividir, 5.- termina. Y otro da error."));
 let numerosw12 = parseInt(prompt("Dame un numero tenga en cuenta que sea el primero para la división."));
  let numerosw23 = parseInt(prompt("Dame un numero tenga en cuenta que sea el segundo para la división."));
    let ressw1 = 0;
    while (opcion1 != 5) {
    switch (opcion1) {
         case 1:
            ressw1 = numerosw12+numerosw23;
           alert("El resultado de la suma es: "+ressw1);
            break;
         case 2:
            ressw1 = numerosw12-numerosw23;
            alert("El resultado de la resta es: "+ressw1);
              break;    
        case 3:
            ressw1 = numerosw12*numerosw23;
            alert("El resultado de la multiplicacion es: "+ressw1);
             break;
       case 4:
            ressw1 = numerosw12/numerosw23;
            alert("El cociente de la division es: "+ressw1);
            break;
        case 5:
          alert("Se cierra el programa. Adios!");
            break;
        default:
            console.log("Error en los datos");
            break;

        }
      opcion1 = parseInt(prompt("Dame una opción que es un numero del 1 al 5: 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.- Dividir, 5.- termina. Otra cosa da error."));
      numerosw12 = parseInt(prompt("Dame otro numero para otra operación"));
      numerosw23 = parseInt(prompt("Dame otro numero para otra operación"));
    }

document.write("<br> El resultado es: "+ressw1);

