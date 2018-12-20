package Aufgabe3;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;

public class Main
{

    private static int[] array1 = new int[100];

    public static void main(String[] args){

        for (int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random() * 100);
        }

        changeData(1);

    }

    public static void changeData(int index){

        int oldValue = array1[index];

        try {

            // Eingabe - Index
            int currIndex = Integer.parseInt(JOptionPane.showInputDialog("Bitte gewünschten Index eingeben:"));

            // Ausgabe - Wert
            JOptionPane.showMessageDialog(null, array1[currIndex]);

            // Speichern - Neuer Wert
            array1[currIndex] = Integer.parseInt(JOptionPane.showInputDialog("Bitte neuen Wert eingeben:"));

            changeData(currIndex);

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Wert muss ein Integer sein!");
        }

    }

}
