package com.mycompany.task2;

import com.mycompany.task2.Rock;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        Rock test = new Rock();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину маршута: ");
        int length = in.nextInt();
        

        System.out.println("Введите максимальную вершину: ");
        int max_height = in.nextInt();
        

        System.out.println("Введите максимальный перепад трех ближайших вершин: ");
        int step = in.nextInt();
        
       
    }
}