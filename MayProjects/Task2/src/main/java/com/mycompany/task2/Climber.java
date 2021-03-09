
package com.mycompany.task2;


import java.util.Scanner;
import java.util.Random;
public class Climber {

    private int rout;
    private int maxh;
    private int step;

    public Climber(int rout, int maxh, int step) {
        
        this.rout = rout;
        this.maxh = maxh;
        this.step = step;
    }

    public Climber() {
    }
       
    public void setRout(int rout) {
     if (rout >4){
         this.rout = rout;
     } else{
         System.out.println("Путь должен быть не менее 4");
     }
    }

    public void setMaxh(int maxh) {
        this.maxh = maxh;
    }

    public void setStep(int step) {
         if (step < maxh) {
            this.step = step;
        }
        else {
            this.step = maxh;
        }this.step = step;
    }
    
    public int getRout() {
        return rout;
    }

    public int getMaxh() {
        return maxh;
    }

    public int getStep() {
        return step;
    }
    
    public void getrock(){
        Random random = new Random(); 
       int[] Rock = new int[this.getRout()];
       for(int i=0;i<this.getRout();i++){
           Rock[i]= random.nextInt(this.getMaxh());
       }
       for(int i=0;i<this.getRout();i++){
          System.out.print(Rock[i]);
       }
       int max=Rock[0];
        for (int i=1;i<Rock.length;i++){
            if (Rock[i-1]<Rock[i]){
               max=Rock[i]; 
            }
        }
        int[] InvertRock = new int[this.getRout()];
        for (int i=0;i<InvertRock.length;i++){
            InvertRock[i]=max-Rock[i];
        }
        for(int i=0;i<this.getRout();i++){
          System.out.print(InvertRock[i]);
        }
        boolean k=true;
        System.out.print('\n');
        for(int j=0;j<max;j++){
            if(j==max-1){
                k=false;
            }
            System.out.print('\n');
            for(int i=0;i<this.getRout();InvertRock[i]--,i++){
                if(InvertRock[i]>0){
                    if(k){
                    System.out.print(' ');
                    }
                    else System.out.print('_');
                }else System.out.print('*');
            }    
        }
        
    }
}