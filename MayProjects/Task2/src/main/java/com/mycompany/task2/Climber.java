
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
         if(step>this.maxh){
           this.step=this.maxh/2;  
         }else
         this.step = step;
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
    
    public void getrock(){    //Метод создания пути
        Random random = new Random(); 
       int[] Rock = new int[this.getRout()];
       for(int i=0;i<this.getRout();i++){
           Rock[i]= random.nextInt(this.getMaxh()); //Создали случайный путь
       }
       
       
        if(Rock[0]>this.step){
            Rock[0]=this.step/2;
        }
        
        for(int i=0;i<Rock.length-1;i++){
            do
            {            
                if(Rock[i]<Rock[i+1]){
                    Rock[i+1]=Rock[i+1]-this.step/2;
                }else{
                        Rock[i+1]=Rock[i+1]+this.step/2;
                     }    
            }while(Math.abs(Rock[i]-Rock[i+1])>this.step);
        }  
        
        for(int i=0;i<Rock.length;i++){
            if(Rock[i]>this.maxh){
                Rock[i]=this.maxh;
            }
        }                              // Подогнали его под параметры скалолаза
        
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
        System.out.println("/** out"); //начало вывода
        System.out.print(" *    ");
        boolean k=true;
        for(int j=0;j<max;j++){
            if(j==max-1){
                k=false;
            };
            System.out.print("\n");
            System.out.print(" *    ");
            for(int i=0;i<this.getRout();InvertRock[i]--,i++){
                if(InvertRock[i]>0){
                    if(k){
                    System.out.print(' ');
                    }
                    else System.out.print('_');
                }else System.out.print('*');
            } 
        }
        System.out.print("\n");
        System.out.print(" *    ");
       for(int i=0;i<this.getRout();i++){
          System.out.print(Rock[i]);
       }
       System.out.print("\n");
       System.out.print(" */"); //конец вывода
    }
} // Программа работает не всегда корректно: для одних и тех же входных данных
// результаты разные. При выводе могут возникнуть проблемы если 
// максимальная вершина >=10.