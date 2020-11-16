package co.edu.unaula.DataStructure.menu;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private static boolean ban = true;
    private static int opcMenu;
    public int mainMenu(){
        try {
            int opcMenu;
            do {
                System.out.println("Principal menu");
                System.out.println(
                        "Please enter: \n" +
                                "1. Simple List \n" +
                                "2. Double List \n" +
                                "3. Circular List \n" +
                                "4. Stacks \n"+
                                "5. Queues \n" +
                                "6. Recursion \n" +
                                "7. Binary Trees \n" +
                                "8. Graphs \n" +
                                "9. Exit"
                );
                opcMenu = scan.nextInt();
                if (opcMenu <1 || opcMenu > 9){
                    System.out.println("invalid option");
                    ban = true;
                } else {
                    ban = false;
                }
            } while (ban);
            return  opcMenu;
        } catch (Exception ex){
            System.out.println("Incorrect Input");
            return -1;
        }
    }
    public int listMenu(){


        try {

            do {
                System.out.println("List menu");
                System.out.println(
                        "Please enter: \n" +
                                "1. Create/Add\n" +
                                "2. Delete nodo \n" +
                                "3. Print List \n" +
                                "4. Return main menu \n"
                );
                opcMenu = scan.nextInt();
                if (opcMenu <1 || opcMenu > 4){
                    System.out.println("solo numeroes entre 1 y 4");
                    ban= true;
                } else {
                    ban = false;
                }
            } while (ban);
            return opcMenu;
        } catch (Exception ex){
            System.out.println("Inalid Option");
            return -1;
        }
    }
    public int anotherNode(){
        int newData;
        try {
            do {
                System.out.println("you want to add a new data? \n"+
                        "1.) yes \n" +
                        "2.) No"
                );
                newData = scan.nextInt();
                if (newData <1 || newData > 2){
                    System.out.println("solo numeroes entre 1 y 2");
                    ban= true;
                } else {
                    ban = false;
                }
            } while (ban);
            return newData;
        } catch (Exception ex){
            System.out.println("Inalid Option");
            return -1;
        }


    }
    public int stackMenu(){
        int opcStack;
        try {
            do {
                System.out.println("Stack menu");
                System.out.println(
                        "Please enter: \n" +
                                "1. Stack \n" +
                                "2. Unstak \n" +
                                "3. Print \n" +
                                "4.Return to main menu"
                );
                opcStack = scan.nextInt();
                if (opcStack <1 || opcStack > 4){
                    System.out.println("invalid option");
                    ban = true;
                } else {
                    ban = false;
                }
            } while (ban);
            return opcStack;
        } catch (Exception ex){
            System.out.println("Incorrect Input");
            return -1;
        }
    }
    public int queuesMenu(){
        try {
            int opcQue;
            do {
                System.out.println("Queue menu");
                System.out.println(
                        "Please enter: \n" +
                                "1.queue \n" +
                                "2.dequeue \n" +
                                "3.Print queue\n" +
                                "4.Return to main menu"
                );
                opcQue = scan.nextInt();
                if (opcQue <1 || opcQue > 4){
                    System.out.println("invalid option");
                    ban = true;
                } else {
                    ban = false;
                }
            } while (ban);
            return opcQue;

        } catch (Exception ex){
            System.out.println("Incorrect Input");
            return -1;
        }
    }
    public int recurMenu(){
        try {

            do {
                System.out.println("Recursive menu");
                System.out.println(
                        "Please enter: \n" +
                                "1.Calculate Factorial \n" +
                                "2.Calculate Potency \n" +
                                "3.Return main menu "
                );
                opcMenu = scan.nextInt();
                if (opcMenu <1 || opcMenu > 3){
                    System.out.println("invalid option");
                    ban = true;
                } else {
                    ban = false;
                }
            } while (ban);
            return opcMenu;

        } catch (Exception ex){
            System.out.println("Incorrect Input");
            return -1;
        }
    }
    public int printMenu(){
        try {

            do {
                System.out.println("Print menu");
                System.out.println(
                        "Please enter: \n" +
                                "1.Head \n" +
                                "2.Tail "
                );
                opcMenu = scan.nextInt();
                if (opcMenu <1 || opcMenu > 2){
                    System.out.println("invalid option");
                    ban = true;
                } else {
                    ban = false;
                }
            } while (ban);
            return opcMenu;

        } catch (Exception ex){
            System.out.println("Incorrect Input");
            return -1;
        }
    }
    public int deleteMenu(){
        try {
            int opcDel;
            do {
                System.out.println("Do you want to delete");
                System.out.println(
                        "Please enter: \n" +
                                "1.yes \n" +
                                "2.Decline "
                );
                opcDel = scan.nextInt();
                if (opcDel <1 || opcDel > 2){
                    System.out.println("invalid option");
                    ban = true;
                } else {
                    ban = false;
                }
            } while (ban);
            return opcDel;

        } catch (Exception ex){
            System.out.println("Incorrect Input");
            return -1;
        }
    }


}
