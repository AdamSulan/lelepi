/*
* File: MainConsole.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-02-20
* Github: https://github.com/AdamSulan/lelepi.git
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole {
    public MainConsole(){
        author();
        about();
        task();
    }
    public void author(){
        System.out.println("Sulan Ádám");
        System.out.println("SZOFT-I-1-N");
        System.out.println("2023-02-20");
    }
    public void about(){
        System.out.println("Feladat 0358 megoldása:");
        System.out.println("A paralelepipedon térfogata:");
    }
    private String input(String message){
        System.out.print(message);
        Scanner scanner=new Scanner(System.in);
        String value=scanner.nextLine();
        return value;
    }
    public void task(){
        String aStr=input("A él hossza: ");
        double a=Double.parseDouble(aStr);
        String bStr=input("B él hossza: ");
        double b=Double.parseDouble(bStr);
        String cStr=input("C él hossza: ");
        double c=Double.parseDouble(cStr);

        Paralelepipedon paralelepipedon=new Paralelepipedon();
        double eredmeny=paralelepipedon.terfogat(a, b, c);
        System.out.println("A paralelepipedon térfogata: "+eredmeny);
    }
}
