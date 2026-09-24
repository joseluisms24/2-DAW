document.getElementById('verdadero1').onclick=function(e){
    document.getElementById('opc1').classList.remove('rojo');
    document.getElementById('opc1').classList.add('verde');

}
document.getElementById('falso1').onclick=function(e){
    document.getElementById('opc1').classList.remove('verde');
    document.getElementById('opc1').classList.add('rojo');
}

document.getElementById('verdadero2').onclick=function(e){
    document.getElementById('opc2').classList.remove('verde');
    document.getElementById('opc2').classList.add('rojo');

}
document.getElementById('falso2').onclick=function(e){
    document.getElementById('opc2').classList.remove('rojo');
    document.getElementById('opc2').classList.add('verde');
}

document.getElementById('verdadero3').onclick=function(e){
    document.getElementById('opc3').classList.remove('rojo');
    document.getElementById('opc3').classList.add('verde');

}
document.getElementById('falso3').onclick=function(e){
    document.getElementById('opc3').classList.remove('verde');
    document.getElementById('opc3').classList.add('rojo');
}