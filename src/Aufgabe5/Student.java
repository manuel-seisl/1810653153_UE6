package Aufgabe5;

public class Student
{

    private String name;
    private int matrikelnummer;
    private int jahrgang;

    public Student(String name, int matrikelnummer, int jahrgang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    @Override
    public String toString(){
        return "Name: " + name + " | Matrikelnummer: " + matrikelnummer + " | Jahrgang: " + jahrgang;
    }

}
