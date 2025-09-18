/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author anyi4
 */
import Modelo.modelo_noroeste;
import vista.MetodoEsquinaNoreste;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Controlador_Noroeste {
     private MetodoEsquinaNoreste  vista;
     private modelo_noroeste modelo;

    public Controlador_Noroeste(MetodoEsquinaNoreste vista, modelo_noroeste modelo) {
        this.vista = vista;
        this.modelo = modelo;
        initController();
    }
     private void initController (){
      
     }

   
}
