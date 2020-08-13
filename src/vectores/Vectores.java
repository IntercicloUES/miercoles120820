/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas vas a almacenar?"));
        double suma = 0, promedio = 0;
        double[] notas = new double[numero];
        
        
        for(int i = 0; i < notas.length;i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota #" + (i+1)));
        }
        
        for(int i = 0; i < notas.length; i++){
            suma += notas[i];
        }
        
        promedio = suma / notas.length;
        
        JOptionPane.showMessageDialog(null, "El promedio es: " + notas);
    }
    
}
