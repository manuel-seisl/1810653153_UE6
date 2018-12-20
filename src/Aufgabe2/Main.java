package Aufgabe2;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {

        int [] array1 = new int[Integer.parseInt(JOptionPane.showInputDialog("Bitte Array Länge eingeben:"))];

        for (int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random() * 1000);
        }

        for (int j = array1.length - 1; j >= 0; j--){
            System.out.println(array1[j]);
        }

    }

}
