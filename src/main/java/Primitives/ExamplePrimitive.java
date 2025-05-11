package Primitives;
import bank.BankAccount;

public class ExamplePrimitive {
//    public static void main(String[] args) {
//        byte b = 127;
//        short s = 23849;
//        int i = 45000;
//        String hi = "Hi";
//        String hello = "Hello";
////        boolean isSame = hi.equals(hello);
//        String frac = hello.substring(1);
////        boolean startChecker = hello.startsWith("H");
//
//        long len = 1237;
//        byte xy = (byte) len;
//
//        int[] squares = new int[5];
//        squares[2] = 4;
//
//        int[] circles = new int[8];
//        circles[3] = 56;
//
//        int [] nrs = {1, 2, 3, 4, 5};
//
//        float x = 1.5f;
//        float y = 2.5f;
//        float sum = x + y;
////        System.out.println("Sum: " + sum);
//
//        String str1 = "Hello";
//        String str2 = " World";
//
//        int [] plus = {1, 2, 3, 4, 5};
//        String [] stuffs = {"459", "354", "212", "OP0", "456"};
////        System.out.println("Fruit 1 " + stuffs[0]);
////        System.out.println("Fruit 2 " + stuffs[1]);
////        System.out.println("Fruit 3 " + stuffs[2]);
////        System.out.println("Fruit 4 " + stuffs[3]);
////        System.out.println("Fruit 5 " + stuffs[4]);
//
//        String resultStr = str1 + str2;
//
////        System.out.println("Concated string " + resultStr);
////        System.out.println("Array of digits " + plus[0]);
////        System.out.println("Array of digits " + plus[1]);
////        System.out.println("Array of digits " + plus[2]);
//
//        System.out.println("Length of TXT! " + str1.length());
//
////        System.out.println(squares[2] + "val in array at index 2");
////        double d = 3.2;
////        float f = d;
//        double storage = 4.5;
//        int casted = (int) storage;
//
//        System.out.println("casted value "+ casted);
//
//        System.out.println("check out long to byte " + xy + " Byte to Len " + len);
//
////        System.out.println(hi.equals(hello) + " check equality " + isSame);
////        System.out.println("checker " + frac + " see what fractured out");
////        System.out.println("see what started " + startChecker + " the hello word");
//    }

    public static void main(String[] args) {
        int i = 3;
        BankAccount bnkAcc = new BankAccount();
        bnkAcc.setAccountNumber(4903930);
        changeStuff(i, bnkAcc);
        System.out.println(i + " " + bnkAcc.getAccountNumber());
    }

    public static void changeStuff(int x, BankAccount bnkAcc){
        x = 5;
        bnkAcc.setAccountNumber(29292290);
    }
}
