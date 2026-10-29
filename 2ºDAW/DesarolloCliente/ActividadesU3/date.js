/*
1)Para la siguiente fecha, dada en formato de string: 
Mon Oct 19 2020 18:58:50 GMT+0200 (hora de verano de Europa central), 
crear un objeto de tipo fecha con solo cuatro parámetros.  
*/

let fecha = new Date(2020, 9, 19, 18);
document.getElementById("ej1").innerHTML=fecha;

/* 
2) El siguiente código quiere mostrar o recoger en una variable el año 2020
pero esa forma de expresar el año es incorrecta porque le añade 2020 milisegundos a la fecha.
Empezando de la fecha 1970 de javascript y le sumará a esa fecha de comienzo los milisegundos correspondientes.
Si se puede corregir de la siguiente forma y con solo indicarle el mes mostrará el año y mes correspondiente:

*/

var d = new Date(2020, 0);
document.getElementById("ej2").innerHTML=d;