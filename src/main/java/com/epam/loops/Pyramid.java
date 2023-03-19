package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }


    }
//        for (int i = 1; i <= cathetusLength; i++){
//            int numberOfWhiteSpaces = (cathetusLength - i) * 2;
//            for (int a = 0; a <= numberOfWhiteSpaces; a++){
//                System.out.println(" ");
//            }
//            for (int x = i; x >= 0; x--){
//                System.out.println(x + " ");
//            }
//        }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
