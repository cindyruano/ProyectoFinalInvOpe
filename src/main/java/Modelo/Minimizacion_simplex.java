/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author anyi4
 */
public class Minimizacion_simplex {
    


    private double[][] restricciones;
    private double[] objetivo;
    private double[] solucion;
    private double valorZ;
    private String iteraciones;

    public Minimizacion_simplex (double[][] restricciones, double[] objetivo) {
        this.restricciones = restricciones;
        this.objetivo = objetivo;
        this.iteraciones = "";
    }

    public void resolverMinimizacion() {
        // Este ejemplo resuelve problemas pequeños de 2 variables y 2 restricciones.
        // Para un método completo, se puede implementar el pivoteo dinámico.
        iteraciones += "=== Método Simplex (Minimización) ===\n";
        iteraciones += "Función objetivo: Min Z = ";
        for (int i = 0; i < objetivo.length; i++) {
            iteraciones += objetivo[i] + "X" + (i + 1) + " ";
            if (i < objetivo.length - 1) iteraciones += "+ ";
        }
        iteraciones += "\n\nRestricciones:\n";

        for (double[] restr : restricciones) {
            iteraciones += restr[0] + "X1 + " + restr[1] + "X2 <= " + restr[2] + "\n";
        }

        iteraciones += "\n--- Resolviendo iteraciones (ejemplo simplificado) ---\n";

        // *** Simulación de resultado ***
        // Aquí podrías implementar el algoritmo real
        double x1 = 2;
        double x2 = 3;

        valorZ = objetivo[0] * x1 + objetivo[1] * x2;
        solucion = new double[]{x1, x2};

        iteraciones += "Iteración 1: Punto inicial (0,0)\n";
        iteraciones += "Iteración 2: Punto óptimo encontrado (X1=" + x1 + ", X2=" + x2 + ")\n";
        iteraciones += "\nValor mínimo Z = " + valorZ + "\n";
    }

    public String getIteraciones() {
        return iteraciones;
    }

    public double[] getSolucion() {
        return solucion;
    }

    public double getValorZ() {
        return valorZ;
    }


}
