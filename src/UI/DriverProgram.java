package UI;

import Controller.ReadFile;

import java.util.Scanner;

public class DriverProgram {

    static Scanner sc = new Scanner(System.in);
    static ReadFile readFile = new ReadFile();

    public static void main(String[] args) {
        userMenu();
    }
    public static void userMenu() {

        System.out.println("Welcome to Priority Queue Systems");
        System.out.println("We're reading your file, wait a minute...");

        String filePath = "userprocess.txt";
        readFile.readUserTxt(filePath);

        System.out.println("Please, select the type of VectorHeap to use: ");
        System.out.println("1. VectorHeap");
        System.out.println("2. VectorHeap from JCF");

        int selection = sc.nextInt();

        switch(selection){
            case 1:
                System.out.println("Processes sorted by Linux priority using VectorHeap:");
                break;

            case 2:
                System.out.println("Processes sorted by Linux priority using VectorHeap from JCF:");
                break;

            default:
                System.out.println("Select a valid option.");
                break;
        }
    }
}

