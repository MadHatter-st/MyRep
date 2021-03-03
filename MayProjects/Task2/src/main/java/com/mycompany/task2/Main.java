package com.mycompany.task2;

import com.mycompany.task2.Climber;
import java.util.Scanner;
import java.util.Random;

public class Main {
      public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину маршута: ");
        int rout = in.nextInt();
        System.out.println("Введите максимальную вершину: ");
        int maxh = in.nextInt();
        System.out.println("Введите максимальный перепад трех ближайших вершин: ");
        int step = in.nextInt();
        Climber man = new Climber(rout, maxh, step);
       
       Random random = new Random(); 
       int[] Rock = new int[man.getRout()];
       for(int i=0;i<man.getRout();i++){
           Rock[i]= random.nextInt(man.getMaxh());
       }
       for(int i=0;i<man.getRout();i++){
          System.out.print(Rock[i]);
       }
    }
}