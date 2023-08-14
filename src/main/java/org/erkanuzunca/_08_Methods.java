package org.erkanuzunca;

public class _08_Methods {

    public static void voidliParametresiz(){
        System.out.println("Voidli parametresiz");
    }

    public static void voidliParametreli(String name){
        System.out.println("Voidli parametresiz"+name);
    }

  public static Integer voidsizParametresiz(){
        return Math.abs(-15);
  }
    public static Integer voidsizParametreli(int number){
        return Math.abs(number);
    }


    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("java");
        int data=voidsizParametresiz();
        int data2=voidsizParametreli(-25);
    }


}
