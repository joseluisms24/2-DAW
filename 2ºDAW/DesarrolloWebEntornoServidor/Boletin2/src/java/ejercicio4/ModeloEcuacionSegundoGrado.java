/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author vboxuser
 */
public class ModeloEcuacionSegundoGrado {
    
    /**
     * Resuelve la ecuación de segundo grado 
     * @param a Coeficiente de x2
     * @param b coeficiente de x
     * @param c Término independiente.
     * @return Un array con las dos soluciones o vácio en caso de no tener solución.
     */
    
    public double[] resolver(double a, double b, double c){
        double[] resultado = new double[0];
        double Positiva;
        
        double raiz = ((b * b) - 4 * a * c);
        if (raiz > 0){
            Positiva = (-b + Math.sqrt(raiz))/(2*a);
            double Negativa = (-b - Math.sqrt(raiz))/(2*a);
            resultado = new double[2];
            resultado[0] = Positiva;
            resultado[1] = Negativa;
            
        } else if (raiz == 0){
            Positiva = (b+Math.sqrt(raiz))/(2*a);
            resultado = new double[1];
            resultado[0] = Positiva;
        } else {
        }
        return resultado;
        
    }
}
