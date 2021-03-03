
package com.mycompany.task2;

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
       
    
}