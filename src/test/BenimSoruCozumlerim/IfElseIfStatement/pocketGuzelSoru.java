package test.BenimSoruCozumlerim.IfElseIfStatement;

public class pocketGuzelSoru {
    public static void main(String[] args) {


         int pocketNum=34;
         String color="red";



            if (pocketNum > 36 || pocketNum < 0) {
                System.out.println("error");
            } else if (pocketNum == 0) {
                System.out.println(color = "green");
            } else if (pocketNum >= 1 && pocketNum <= 10) {
                if (pocketNum % 2 == 0) {
                    System.out.println(color = "black a");
                } else {
                    System.out.println(color = "red");
                }
            } else if (pocketNum >= 11 && pocketNum <= 18) {
                if (pocketNum % 2 == 0) {
                    System.out.println(color = "red");
                } else {
                    System.out.println(color = "black b");
                }
            } else if (pocketNum >= 19 && pocketNum <= 28) {
                if (pocketNum % 2 == 0) {
                    System.out.println(color = "black c");
                } else {
                    System.out.println(color = "red");
                }
            } else if (pocketNum >= 29 && pocketNum <= 36) {
                if (pocketNum % 2 == 0) {
                    System.out.println(color = "red");
                } else {
                    System.out.println(color = "black d");
                }

            }

        }
    }
