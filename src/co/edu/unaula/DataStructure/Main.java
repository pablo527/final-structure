package co.edu.unaula.DataStructure;

import co.edu.unaula.DataStructure.cases.Cases;
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
    static Cases Ncase = new Cases();
    // buscar metodo de reutilizar variables
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
                       caso1(listMenu);
                       break;

                   case 2:
                       listMenu = menu.listMenu();
                       if (listMenu <1){
                           return;
                       }
                       caso2(listMenu);
                       break;
                   case 3:
                       listMenu = menu.listMenu();
                       if (listMenu <1){
                           return;
                       }
                       caso3(listMenu);
                       break;
                   case 4:
                       opcStack = menu.stackMenu();
                       if (opcStack <1){
                           return;
                       }
                       caso4(opcStack);
                       break;
                   case 5:
                       opcQue = menu.queuesMenu();
                       if (opcQue < 1){
                           return;
                       }
                       caso5(opcQue);
                       break;
                   case 6:
                       opcRec = menu.recurMenu();
                       if (opcRec < 1){
                           return;
                       }
                       caso6(opcRec);
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
    public static void caso1(int listMenu){

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
                int opc = 0;
                simpleList.validateSize();
                opc = menu.deleteMenu();

                if(opc == 1){
                    simpleList.deleteNode();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
                opc = 0;
            }
            case 3 -> simpleList.printList();
            case 4 ->  opcMenu =  menu.mainMenu();
            default -> throw new IllegalStateException("Unexpected value: " + listMenu);
        }
    }

    public static void caso2(int listMenu){
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
                int opc;
                doubleList.validateSize();
                opc = menu.deleteMenu();
                if(opc == 1){
                    // falta eliminar
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
            case 4 -> {
                opcMenu=  menu.mainMenu();
            }
        }

    }
    public static void caso3(int listMenu){
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
                int opc;
                circularList.validateSize();
                opc = menu.deleteMenu();
                if(opc == 1){
                   circularList.deleteNode();
                } else if (opc == 2){
                    System.out.println("The data was not deleted");
                }
            }
            case 3 -> {
                // aqui falta programa imprimir por last o first

               circularList.printNodes();
            }
            case 4 -> opcMenu=  menu.mainMenu();
        }
    }
    public static void caso4(int opcStack){
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
                System.out.println("Are you sure you want to unstack an item?");
                // aqui da un error al elimiar y luego añadir
                opc = scan.nextInt();
                if (opc == 1){
                    stack.pop();
                }
            }
            case 3 -> {
                stack.printStack();
            }
            case 4 -> {
                opcMenu=  menu.mainMenu();
            }
        }
    }
    public static void caso5(int opcQue){
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
                System.out.println("Are you sure you want to dequeue an item?");
                // aqui da un error al elimiar y luego añadir
                opc = scan.nextInt();
                if (opc == 1){
                    queues.dequeue();
                }
            }
            case 3 -> {
                queues.printQueue();
            }
            case 4 -> {
                opcMenu=  menu.mainMenu();
            }
        }
    }
    public static  void caso6(int opcRec){
        switch (opcRec){
            case 1 -> {
                int num;
                double result;
                System.out.println("Ingrese el numero a calcular factorial");
                num = scan.nextInt();
                result =  factorial.calcFactRecur(num);
                System.out.println("El factorial de: " + num +" = " + result +"\n");
            }
            case 2 -> {
                double expo;
                double base;
                double result;
                System.out.println("Ingrese la base");
                base = scan.nextInt();
                System.out.println("Ingrese el exponente");
                expo = scan.nextInt();
                result  = potency.calcRecurExpo(expo,base);
                System.out.println("La base de: " + base + " al exponente: " + expo +
                        " es = " + result + "\n");
            }
            case 3 -> {
                opcMenu=  menu.mainMenu();
            }
        }
    }
}
