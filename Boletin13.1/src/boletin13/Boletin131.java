/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo
 */
public class Boletin131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas obx = new ConversorTemperaturas();
        try{
            float grados = Integer.parseInt(JOptionPane.showInputDialog("Añade los centigrados"));
            JOptionPane.showMessageDialog(null, obx.centigradosAFahrenheit(grados)+" en fahrenheit");
            JOptionPane.showMessageDialog(null, obx.centigradorAReamur(grados)+" en Reamur");
        } catch (Excepcion e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
     
}
}