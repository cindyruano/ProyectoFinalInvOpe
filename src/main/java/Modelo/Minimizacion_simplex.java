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
    private double[] funcionObjetivo;
    private String tipo; 

    public Minimizacion_simplex (double[][] restricciones, double[] funcionObjetivo, String tipo) {
        this.restricciones = restricciones;
        this.funcionObjetivo = funcionObjetivo;
        this.tipo = tipo;
    }

    public String resolver() {
       int numRest = restricciones.length;
        int numVar = funcionObjetivo.length;

        int ancho = numVar + numRest + 1; // variables + holgura + RHS
        double[][] tabla = new double[numRest + 1][ancho]; // +1 fila para Z

        // 1️⃣ Copiar restricciones a la tabla
        for (int i = 0; i < numRest; i++) {
            for (int j = 0; j < numVar; j++) {
                tabla[i + 1][j] = restricciones[i][j];
            }
            tabla[i + 1][numVar + i] = 1; // variable de holgura
            tabla[i + 1][ancho - 1] = restricciones[i][numVar]; // RHS
        }

        // 2️⃣ Copiar función objetivo
        for (int j = 0; j < numVar; j++) {
            // Minimización: Simplex maximiza, así que multiplicamos por -1
            tabla[0][j] = -funcionObjetivo[j];
        }

        // 3️⃣ Ciclo del Simplex
        while (true) {
            // Buscar columna pivote (menor valor en fila Z)
            int colPivote = 0;
            double min = tabla[0][0];
            for (int j = 1; j < ancho - 1; j++) {
                if (tabla[0][j] < min) {
                    min = tabla[0][j];
                    colPivote = j;
                }
            }
            if (min >= 0) break; // optimizado

            // Buscar fila pivote
            int filaPivote = -1;
            double minRatio = Double.MAX_VALUE;
            for (int i = 1; i <= numRest; i++) {
                double val = tabla[i][colPivote];
                if (val > 0) {
                    double ratio = tabla[i][ancho - 1] / val;
                    if (ratio < minRatio) {
                        minRatio = ratio;
                        filaPivote = i;
                    }
                }
            }
            if (filaPivote == -1) return "Problema no acotado";

            // Dividir fila pivote por el pivote
            double pivote = tabla[filaPivote][colPivote];
            for (int j = 0; j < ancho; j++) {
                tabla[filaPivote][j] /= pivote;
            }

            // Hacer ceros en columna pivote
            for (int i = 0; i <= numRest; i++) {
                if (i != filaPivote) {
                    double factor = tabla[i][colPivote];
                    for (int j = 0; j < ancho; j++) {
                        tabla[i][j] -= factor * tabla[filaPivote][j];
                    }
                }
            }
        }

        // 4️⃣ Leer resultados
        double[] resultado = new double[numVar];
        for (int j = 0; j < numVar; j++) {
            boolean esBasica = false;
            double val = 0;
            for (int i = 1; i <= numRest; i++) {
                if (tabla[i][j] == 1) {
                    int cont = 0;
                    for (int k = 1; k <= numRest; k++) {
                        if (tabla[k][j] != 0) cont++;
                    }
                    if (cont == 1) {
                        esBasica = true;
                        val = tabla[i][ancho - 1];
                    }
                }
            }
            resultado[j] = esBasica ? val : 0;
        }

        double z = tabla[0][ancho - 1];

        StringBuilder sb = new StringBuilder("Solución: ");
        for (int i = 0; i < resultado.length; i++) {
            sb.append("X").append(i + 1).append("=").append(resultado[i]).append(", ");
        }
        sb.append("Z=").append(z);

        return sb.toString();
    }
}
