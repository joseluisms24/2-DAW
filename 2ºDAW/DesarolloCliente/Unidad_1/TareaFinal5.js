document.getElementById('Espanol').onclick=function(e){
    document.getElementById('texto').classList.remove('morado');
    document.getElementById('texto').classList.remove('azul');
    document.getElementById('texto').classList.add('amarillo');
    document.getElementById('texto').innerHTML= "Bienvenido a nuestro sitio web";
}

document.getElementById('Ingles').onclick=function(e){
    document.getElementById('texto').classList.remove('amarillo');
    document.getElementById('texto').classList.remove('morado');
    document.getElementById('texto').classList.add('azul');
    document.getElementById('texto').innerHTML= "Wellcome to our website";
}

document.getElementById('Ruso').onclick=function(e){
    document.getElementById('texto').classList.remove('amarillo');
    document.getElementById('texto').classList.remove('azul');
    document.getElementById('texto').classList.add('morado');
    document.getElementById('texto').innerHTML= "Добро пожаловать на наш сайт";
}