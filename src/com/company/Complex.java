package com.company;

public class Complex {
    public int x=0;
    public int y=0;
    public  Complex(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void additions(Complex compl){
        int resultX=0;
        int resultY=0;
        resultX=this.x+compl.x;
        resultY=this.y+compl.y;
        System.out.println("z+q= "+resultX+" +i "+resultY);
    }

    public void substraction(Complex compl){
        int resultX=0;
        int resultY=0;
        resultX=this.x+ compl.x;
        resultY=this.y+compl.y;
        System.out.println("z-q= "+resultX+" -i "+resultY);
    }
    public void multiplication(Complex compl){
        int resultX=0;
        int resultY=0;
        resultX=this.x* compl.x-this.y*compl.y;
        resultY=this.y*compl.y+this.y*compl.x;
        System.out.println("z*q= "+resultX+" +i "+resultY);
    }
    public void division(Complex compl){
        int resultX=0;
        int resultY=0;
        resultX=(this.x*compl.x+this.y* compl.y)/(compl.x* compl.x+ compl.y* compl.y);
        resultY=(this.y* compl.x-this.x* compl.y)/(compl.x* compl.x+ compl.y* compl.y);
        System.out.println("z/q= "+resultX+" i "+resultY);
    }
    public void printInAlgebraForm(){
        System.out.println("z= "+this.x+" i "+this.y);
    }
    public void printInTrigonomForm(){
        double r=0;
        double fi=0;
        r=Math.sqrt(this.x*this.x+this.y*this.y);
        fi=Math.atan(this.y/this.x);
        System.out.println("z= "+r+" cos "+fi+" i*sin "+fi);
    }
    public boolean equals(Object anObject){
        if (this==anObject){
            return true;
        }
        if(anObject==null||getClass()!=anObject.getClass()){
            return false;
        }
        Complex com=(Complex) anObject;
        if(this.x==com.x&&this.y==com.y)
            return true;
        return false;
    }
}
