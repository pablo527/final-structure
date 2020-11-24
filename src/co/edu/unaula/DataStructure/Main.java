package co.edu.unaula.DataStructure;

import co.edu.unaula.DataStructure.lists.CircularList;
import co.edu.unaula.DataStructure.lists.DoubleList;
import co.edu.unaula.DataStructure.lists.SimpleList;
import co.edu.unaula.DataStructure.menu.Menu;
import co.edu.unaula.DataStructure.queues.Queues;
import co.edu.unaula.DataStructure.recursive.RecPot;
import co.edu.unaula.DataStructure.recursive.RecursiveFact;
import co.edu.unaula.DataStructure.stack.StackSimpleList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int  opcMenu;
    static int listMenu;
    static int opcStack;
    static int opcQue;
    static int opcRec;
    static String data = "";
    static int newElement = 1;
    static int opc;
    static SimpleList simpleList = new SimpleList();
    static DoubleList doubleList = new DoubleList();
    static CircularList circularList = new CircularList();
    static StackSimpleList stack = new StackSimpleList();
    static Queues queues = new Queues();
    static RecursiveFact factorial = new RecursiveFact();
    static RecPot  potency = new RecPot();
    static Menu menu= new Menu();
    // hacer que funcione esto mismo los casos desde una clase externa pdt(ya esta creada la clase)

    public static void main(String[] args) {

       opcMenu = menu.mainMenu();
       try {
           while (opcMenu != 9){
               switch (opcMenu){
                   case 1:
                       listMenu = menu.listMenu();

                       if (listMenu <1){
                           return;
                       }
                       listSimple(listMenu);
                       break;

                   case 2:
                       listMenu = menu.listMenu();
                       if (listMenu <1){
                           return;
                       }
                       doubleList(listMenu);
                       break;
                   case 3:
                       listMenu = menu.listMenu();
                       if (listMenu <1){
                           return;
                       }
                       circularList(listMenu);
                       break;
                   case 4:
                       opcStack = menu.stackMenu();
                       if (opcStack <1){
                           return;
                       }
                       stack(opcStack);
                       break;
                   case 5:
                       opcQue = menu.queuesMenu();
                       if (opcQue < 1){
                           return;
                       }
                       queue(opcQue);
                       break;
                   case 6:
                       opcRec = menu.recurMenu();
                       if (opcRec < 1){
                           return;
                       }
                       recurFact(opcRec);
                       break;
                   case 7:
                       System.out.println("binary");
                       break;
                   case 8:
                       System.out.println("graphs");
                       break;
                   default:
                       return;
               }
           }
       } catch (Exception ex){
           System.out.println("Incorrect input");
           System.out.println(ex.getMessage());
       }
    }
    public static void listSimple (int listMenu){

        switch (listMenu) {
            case 1 -> {
                while (newElement == 1) {
                    System.out.println("Add data to Simple list");
                    data = scan.nextLine();
                    simpleList.addNode(data);
                    System.out.println("Great data add to simple list");
                    newElement = menu.anotherNode();
                }
                newElement = 1;
            }
            case 2 -> {
                simpleList.validateSize();
                opc = menu.deleteMenu();

                if(opc == 1){
                    simpleList.deleteNode();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
            }
            case 3 -> simpleList.printList();
            case 4 ->  opcMenu =  menu.mainMenu();
            default -> throw new IllegalStateException("Unexpected value: " + listMenu);
        }
    }

    public static void doubleList (int listMenu){
        switch (listMenu) {
            case 1 -> {
                while (newElement == 1) {
                    System.out.println("Add data to Double list");
                    data = scan.nextLine();
                    doubleList.addFirst(data);
                    System.out.println("Great data add to Double list");
                    newElement = menu.anotherNode();
                }
                newElement = 1;
            }
            case 2 ->  {

                doubleList.validateSize();
                opc = menu.deleteMenu();
                if(opc == 1){
                    doubleList.deleteNode();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
            }
            case 3 -> {
                int opcPrint;
                opcPrint = menu.printMenu();
                if (opcPrint == 1){
                    doubleList.printHead();
                } else if (opcPrint ==2){
                    doubleList.printTail();
                }
            }
            case 4 -> opcMenu=  menu.mainMenu();
        }

    }
    public static void circularList (int listMenu){
        switch (listMenu) {
            case 1 -> {
                while (newElement == 1) {
                    System.out.println("Add data to circular list");
                    data = scan.nextLine();
                    circularList.addNode(data);
                    System.out.println("Great data add to circular list");
                    newElement = menu.anotherNode();
                }
                newElement = 1;
            }
            case 2 ->  {
                circularList.validateSize();
                opc = menu.deleteMenu();
                if(opc == 1){
                   circularList.deleteNode();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
            }
            case 3 -> {

                int opcPrint;
                opcPrint = menu.printMenu();
                if (opcPrint == 1){
                    circularList.printNodesFirst();
                } else if (opcPrint ==2){
                    circularList.printNodesLast();
                }


            }
            case 4 -> opcMenu=  menu.mainMenu();
        }
    }
    public static void stack(int opcStack){
        switch (opcStack){
            case 1 -> {
                while (newElement == 1) {
                    System.out.println("Add data to stack");
                    data = scan.nextLine();
                    stack.push(data);
                    System.out.println("Great data add to Stack");
                    newElement = menu.anotherNode();
                }
                newElement = 1;
            }
            case 2 ->  {
                stack.validateSize();
                opc = menu.deleteMenu();
                if(opc == 1){
                    stack.pop();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
            }
            case 3 -> stack.printStack();
            case 4 -> opcMenu=  menu.mainMenu();
        }
    }
    public static void queue (int opcQue){
        switch (opcQue){
            case 1 -> {
                while (newElement == 1) {
                    System.out.println("Add data to queues");
                    data = scan.nextLine();
                    queues.addToQueues(data);
                    System.out.println("Great data add to queues");
                    newElement = menu.anotherNode();
                }
                newElement = 1;
            }
            case 2 ->  {
                queues.validateSize();
                opc = menu.deleteMenu();
                if(opc == 1){
                    queues.dequeue();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
            }
            case 3 -> queues.printQueue();
            case 4 -> opcMenu=  menu.mainMenu();
        }
    }
    public static  void recurFact (int opcRec){
        switch (opcRec){
            case 1 -> {
                int num;
                double result;
                System.out.println("\n" + "Enter the number to calculate factorial");
                num = scan.nextInt();
                result =  factorial.calcFactRecur(num);
                if (result <0){
                    System.out.println("it is not possible to calculate");
                } else {
                    System.out.println("the factorial of : " + num +" = " + result +"\n");
                }
            }
            case 2 -> {
                double expo;
                double base;
                double result;
                System.out.println("Enter base");
                base = scan.nextInt();
                System.out.println("Enter  the exponent");
                expo = scan.nextInt();
                result  = potency.calcRecurExpo(expo,base);
                if (result <0){
                    System.out.println("it is not possible to calculate");
                } else {
                    System.out.println("the base of: " + base + " to the exponent: " + expo +
                            " is = " + result + "\n");
                }
            }
            case 3 -> opcMenu=  menu.mainMenu();
        }
    }
}
