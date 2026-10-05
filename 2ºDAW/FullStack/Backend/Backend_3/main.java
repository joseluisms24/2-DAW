package Backend_3;

public class main {
    //CINCO OBJETOS Y CALCULAR LA NOTA MEDIA, NUM DE APROBADOS Y SUSPENSO, NOTA MAX Y MINIMA Y CUANTOS SON MAYORES DE EDAD Y MENORES DE EDAD
    public static void main(String[] args) {
        alumno alumno1 = new alumno("Juan", 20, 8);
        alumno alumno2 = new alumno("Maria", 22, 9);
        alumno alumno3 = new alumno("Pedro", 18, 4);
        alumno alumno4 = new alumno("Ana", 19, 6);
        alumno alumno5 = new alumno("Luis", 21, 10);

        // Calcular la nota media
        double notaMedia = (alumno1.getNota() + alumno2.getNota() + alumno3.getNota() + alumno4.getNota() + alumno5.getNota()) / 5;
        System.out.println("Nota media: " + notaMedia);

        // Contar el número de aprobados y suspensos
        int numAprobados = 0;
        int numSuspensos = 0;
        if (alumno1.estaAprobado()) numAprobados++; else numSuspensos++;
        if (alumno2.estaAprobado()) numAprobados++; else numSuspensos++;
        if (alumno3.estaAprobado()) numAprobados++; else numSuspensos++;
        if (alumno4.estaAprobado()) numAprobados++; else numSuspensos++;
        if (alumno5.estaAprobado()) numAprobados++; else numSuspensos++;    

        System.out.println("Número de aprobados: " + numAprobados);
        System.out.println("Número de suspensos: " + numSuspensos);

        // Calcular la nota máxima y mínima
        double notaMaxima = Math.max(Math.max(alumno1.getNota(), alumno2.getNota()), Math.max(alumno3.getNota(), Math.max(alumno4.getNota(), alumno5.getNota())));
        double notaMinima = Math.min(Math.min(alumno1.getNota(), alumno2.getNota()), Math.min(alumno3.getNota(), Math.min(alumno4.getNota(), alumno5.getNota())));

        System.out.println("Nota máxima: " + notaMaxima);
        System.out.println("Nota mínima: " + notaMinima);

        // Contar cuántos son mayores de edad y cuántos son menores de edad
        int numMayoresEdad = 0;
        int numMenoresEdad = 0;
        if (alumno1.esMayorDeEdad()) numMayoresEdad++; else numMenoresEdad++;
        if (alumno2.esMayorDeEdad()) numMayoresEdad++; else numMenoresEdad++;
        if (alumno3.esMayorDeEdad()) numMayoresEdad++; else numMenoresEdad++;
        if (alumno4.esMayorDeEdad()) numMayoresEdad++; else numMenoresEdad++;
        if (alumno5.esMayorDeEdad()) numMayoresEdad++; else numMenoresEdad++;

        System.out.println("Número de mayores de edad: " + numMayoresEdad);
      
    }
}
