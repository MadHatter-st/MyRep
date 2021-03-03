/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

import java.util.Random;

/**
 *
 * @author Nikita
 */
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
       for (int i=1;koloda.length>=i;i++){
                System.out.println(koloda[i]);
} 
}
}

