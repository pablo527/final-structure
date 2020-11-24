package co.edu.unaula.DataStructure.cases;

import co.edu.unaula.DataStructure.lists.CircularList;
import co.edu.unaula.DataStructure.lists.DoubleList;
import co.edu.unaula.DataStructure.lists.SimpleList;
import co.edu.unaula.DataStructure.menu.Menu;

import java.util.Scanner;

public class Cases {
    static Scanner scan = new Scanner(System.in);
    static int  opcMenu;
    static int listMenu;
    static String data;
    static int newElement = 1;
    static int opc;
    static SimpleList simpleList = new SimpleList();
    static DoubleList doubleList = new DoubleList();
    static CircularList circularList = new CircularList();
    static Menu menu= new Menu();
    public  void caso1(int listMenu){

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
            case 2 ->  {
                System.out.println("sure you want to delete a data? 1 -> yes");
                // aqui da un error al elimiar y luego añadir
                opc = scan.nextInt();
                if (opc == 1){
                    simpleList.deleteNode();
                }
            }
            case 3 -> simpleList.printList();
            case 4 ->  opcMenu =  menu.mainMenu();
        }

    }
    public  void caso2(int listMenu){
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
                System.out.println("sure you want to delete a data? 1 -> yes");
                // aqui da un error al elimiar y luego añadir
                opc = scan.nextInt();
                if (opc == 1){
                    //falta programar el metodo eleiminar;
                    doubleList.deleteNode();
                }
            }
            case 3 -> {
                // falta programar imprimir por head
                doubleList.printTail();
            }
            case 4 -> {

                opcMenu=  menu.mainMenu();
            }
            default -> {
            }
        }

    }
    public void caso3(){
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
                System.out.println("sure you want to delete a data? 1 -> yes");
                // aqui da un error al elimiar y luego añadir
                opc = scan.nextInt();
                if (opc == 1){
                    circularList.deleteNode();
                }
            }
            case 3 -> {
                // aqui falta programa imprimir por last o first

                circularList.printNodesFirst();
            }
            case 4 -> opcMenu=  menu.mainMenu();
        }
    }
}
