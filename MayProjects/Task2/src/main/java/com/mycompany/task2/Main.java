package com.mycompany.task2;

import com.mycompany.task2.Climber;
import java.util.Scanner;
import java.util.Random;

public class Main {
      public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
        Climber man = new Climber();

        System.out.println("Введите длину маршута: ");
        int rout = in.nextInt();
        man.setRout(rout);
        System.out.println("Введите максимальную вершину: ");
        int maxh = in.nextInt();
        man.setMaxh(maxh);
        System.out.println("Введите максимальный перепад трех ближайших вершин: ");
        int step = in.nextInt();
        man.setStep(step);
        man.getrock();
       
    }
}