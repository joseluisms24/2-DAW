let resRespondidas = 0;
let EsVerdadero = false;
let correctas = 0;


function guardarValor() {
    resRespondidas++;
    correctas++;
}

function guardarValorFalsa() {
    resRespondidas++;
}




function clickEnviar(boton) {
  boton.disabled = true; 
}