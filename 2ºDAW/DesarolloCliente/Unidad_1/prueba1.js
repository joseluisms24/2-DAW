window.onload = inicio;
function inicio() 
{
     console.log("Mensaje enviado a la consola");
     document.write("Estoy usando el document.write para este mensaje");
     window.alert("Mensaje generado mediante una ventana emergente");
     document.getElementById("parrafo").innerHTML ="Muestra mensaje a través del innerHTML";
}
