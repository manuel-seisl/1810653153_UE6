package Aufgabe4;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args){

        List<Freund> freunde = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            freunde.add(new Freund(JOptionPane.showInputDialog("Bitte " + (i + 1) + ". Freund eingeben:")));
        }

        for (Freund item : freunde){
            System.out.println(item.toString());
        }

    }

}
