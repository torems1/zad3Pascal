package com.company;

public class Pascal {
    long triangle[][];
    int height;
    int width;
    public Pascal(int height,int width){
        this.height=height;
        this.width=width;
        triangle=new long[height][width];
        for (Integer i=0;i<height;i++){
            triangle[i][0]= 1L;
            for (Integer j=1;j<width;i++) {
                triangle[i][j] = j < i ? triangle[i - 1][j] + triangle[i - 1][j - 1] : 0;
            }
            triangle[i][i]=1L;
        }
    }
    public String toString(){
        String result="";
        for (Integer i=0;i<height;i++){
            for (Integer j=0;j<width;j++){
                if(triangle[i][j]!=0)
                    result+=triangle[i][j]+" ";
            }
            result+="\n";
        }
        return result;
    }
    public static void main(String[] args){
        int height=10;
        int width=10;
        Pascal triangle=new Pascal(height,width);
        String strTriangle=triangle.toString();
        System.out.println(strTriangle);
    }
}
