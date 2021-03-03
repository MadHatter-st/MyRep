
package com.mycompany.task1;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        PlayingCard koloda[] = new PlayingCard[
            PlayingCard.RANK_LIST.length*PlayingCard.SUITS_LIST.length
            ];
        System.out.println(koloda[0]);
    for (int i=0;i< PlayingCard.SUITS_LIST.length;i++){
        for (int j=0;j< PlayingCard.RANK_LIST.length;j++){
            koloda[i*PlayingCard.RANK_LIST.length+j] = new PlayingCard(
                    PlayingCard.SUITS_LIST[i],PlayingCard.RANK_LIST[j]
            );
        }
    }
        Random random = new Random();
       for(int i=0;i<100;i++){
           int i1=random.nextInt(koloda.length);
           int i2=random.nextInt(koloda.length);
           PlayingCard temp = koloda[i1];
           koloda[i1]=koloda[i2];
           koloda[i2]=temp;
       }
       
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        
    
    PlayingCard razdacha[] = new PlayingCard[num*5];
    if((num*5)>koloda.length)System.out.print("Ошибка!!");
    else {
        for(int j=koloda.length-1,i=0;i<5;i++){
            for(int k=i,l=1;l<=num;k=k+(5),l++){
                    razdacha[k] = koloda[j]; 
                    j--;
            }  
        }
    }
    
        for(int k=0,i=0;i<num;i++){
        System.out.println(" ");    
        System.out.println("Игрок"+" "+(i+1));
            for(int j=0;j<5;j++,k++){
              System.out.println(razdacha[k]);  
            }
        }
    }
}
