let resRespondidas = 0;
let EsVerdadero = false;
let correctas = 0;
var elegiste1 = new Boolean();
var elegiste2 = new Boolean();
var elegiste3 = new Boolean();

//funciones para guardar los valores de las respuestas y contar
function guardarValor1() {
    resRespondidas++;
    correctas++;
    document.getElementById('verdadero1').classList.add('ocultar');
    document.getElementById('falso1').classList.add('ocultar');
    elegiste1 = true;

}

function guardarValorFalsa1() {
    resRespondidas++;
    document.getElementById('falso1').classList.add('ocultar');
    document.getElementById('verdadero1').classList.add('ocultar');
    elegiste1 = false;
}

function guardarValor2() {
    resRespondidas++;
    elegiste2 = true;
    document.getElementById('verdadero2').classList.add('ocultar');
    document.getElementById('falso2').classList.add('ocultar');
}

function guardarValorFalsa2() {
    resRespondidas++;
    correctas++;    
    elegiste2 = false;
    document.getElementById('falso2').classList.add('ocultar');
    document.getElementById('verdadero2').classList.add('ocultar');
}


function guardarValor3() {
    resRespondidas++;
    correctas++;
    elegiste3 = true;
    document.getElementById('verdadero3').classList.add('ocultar');
    document.getElementById('falso3').classList.add('ocultar');
}

function guardarValorFalsa3() {
    resRespondidas++;
    elegiste3 = false;
    document.getElementById('falso3').classList.add('ocultar');
    document.getElementById('verdadero3').classList.add('ocultar');
}

//boton al dar enviar.
function enviarForm() {
   if (resRespondidas < 3) {
    alert("Se han marcado a: "+resRespondidas+  
        "\nNo se ha respondido a todas las respuestas.");
   } else {
    alert("El numero de aciertos es: "+correctas);
    var ventana = new Boolean();
    ventana = window.confirm('Haga clic en Aceptar para ver los resultados de su test o pulse Cancelar para ver las soluciones');
    //Verifica que cuando la ventana vaya a aceptar tenga su estilo y cuando sea falsa vaya a otro estilo.
    if (ventana === true) {
            document.getElementById('cabecera').innerHTML="RESUTADO TEST USUARIO";
            document.getElementById('vacio').innerHTML='Cuando la pregunta esté en color verde significa que la respuesta es correcta, y si está en rojo es que has fallado';
           //Los elegiste son para marcar las opciones del usuario.
            if (elegiste1 === true) {
                document.getElementById('vacioa').innerHTML="Elegiste verdadero";
                 document.getElementById('Andalucia').classList.add('verde');
            } else {
                document.getElementById('vacioa').innerHTML="Elegiste falso";
                 document.getElementById('Andalucia').classList.add('rojo');
            }
             if (elegiste2 === true) {
                document.getElementById('vaciob').innerHTML="Elegiste verdadero";
                document.getElementById('Barca').classList.add('rojo');

            } else {
                document.getElementById('vaciob').innerHTML="Elegiste falso";
                document.getElementById('Barca').classList.add('verde');
            }
             if (elegiste3 === true) {
                document.getElementById('vacioj').innerHTML="Elegiste verdadero";
                document.getElementById('javascript').style.color='green';
            } else {
                document.getElementById('vacioj').innerHTML="Elegiste falso";
                document.getElementById('javascript').style.color='red';
            }
    } else {
            document.getElementById('cabecera').innerHTML="TEST SOLUCIÓN";
            document.getElementById('vacio').innerHTML='Cuando la pregunta esté en color verde significa que la respuesta es correcta, y si está en rojo es que has fallado';
            document.getElementById('Andalucia').classList.add('verde');
            document.getElementById('vacioa').innerHTML="Es verdadera";
            document.getElementById('Barca').classList.add('rojo');
            document.getElementById('vaciob').innerHTML="Es falsa";
            document.getElementById('javascript').style.color='green';               
            document.getElementById('vacioj').innerHTML="Es verdadera";

         }
    
 }

}
//reinicio de la pagina.
function reiniciarpag() {
    location.reload();
    
}

