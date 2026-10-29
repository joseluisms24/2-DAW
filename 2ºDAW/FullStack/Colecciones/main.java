package Colecciones;

import java.util.ArrayList;

public class main {

            public static void main(String[] args) {
                ArrayList<Alumno> alumnos = new ArrayList<>();
/* 
                alumnos.add(new Alumno("Juan", 18, 7.5));
                alumnos.add(new Alumno("María", 20, 9.0));
                alumnos.add(new Alumno("Pedro", 17, 6.0));
                alumnos.add(new Alumno("Ana", 19, 8.5));


        
                // Mostrar los alumnos usando un bucle for-each
                for (Alumno a : alumnos) {
                    System.out.println("Alumno: " + a.getNombre() + ", Edad: " + a.getEdad() + ", Nota: " + a.getNota());

                }

                // Mostrar la cantidad de aprobados
                int cantidadAprobados = 0;
                int cantidadSuspensos = 0;
                for (Alumno a : alumnos) {
                    if (a.estaAprobado()) {
                        cantidadAprobados++;
                    } else {
                        cantidadSuspensos++;
                    }
                }
                System.out.println("Cantidad de aprobados: " + cantidadAprobados);
                System.out.println("Cantidad de suspensos: " + cantidadSuspensos);
                double notaMedia = 0.0;
                for (Alumno a : alumnos){
                    notaMedia += a.getNota();
                   
                }
                notaMedia /= alumnos.size();
                System.out.println("Nota media de la clase: " + notaMedia);

                //Si no hay alumnos, no se puede calcular la nota media ni la cantidad de aprobados y suspensos.
                  if(alumnos.isEmpty()){
                    System.out.println("No hay alumnos en la lista.");
                  }
        */
                  //Creacion de 6 alumnos más y añadirlos a la lista
                alumnos.add(new Alumno("Luis", 21, 5.0));
                alumnos.add(new Alumno("Sofía", 22, 4.5));
                alumnos.add(new Alumno("Carlos", 19, 6.5));
                alumnos.add(new Alumno("Lucía", 20, 8.0));
                alumnos.add(new Alumno("Diego", 18, 7.0));
                alumnos.add(new Alumno("Valentina", 23, 9.5));
                int cantidadAprobados6 = 0;
                int cantidadSuspensos6 = 0;
                double notaMasAlta = 0;
                double notaMasBaja = 10;
                Alumno alumnoMasAlta = null;
                Alumno alumnoMasBaja = null;
                double notaMedia6 = 0;
                for (Alumno a : alumnos) {
                    System.out.println("Alumno: " + a.getNombre() + ", Edad: " + a.getEdad());
                }
                int totalAlumnos = 0;
                 for (Alumno a : alumnos) {
                    
                    totalAlumnos = alumnos.size();
                    
                    
                    if (a.estaAprobado()) {
                        cantidadAprobados6++;
                    } else {
                        cantidadSuspensos6++;
                    }

                    if (a.getNota() > notaMasAlta) {
                        notaMasAlta = a.getNota();
                        alumnoMasAlta = a;
                    }

                    if (a.getNota() < notaMasBaja) {
                        notaMasBaja = a.getNota();
                        alumnoMasBaja = a;
                    }
                    //nota media
                    notaMedia6 += a.getNota();
                    
                }
                System.out.println("Total de alumnos: " + totalAlumnos);
                System.out.println("La cantidad de aprobados es: "+cantidadAprobados6);
                System.out.println("La cantidad de suspensos es: "+cantidadSuspensos6);
                System.out.println("El alumno nota más alta: "+alumnoMasAlta);
                System.out.println("El alumno nota mas baja: "+alumnoMasBaja);
                 notaMedia6 /= alumnos.size();
                System.out.println("Nota media de la clase: " + notaMedia6);
               
            }   
        }
    
