package UI;

import Controller.Process_Management;
import Controller.ReadFile;
import Model.ProcessL;
import Model.VectorHeap;

import java.util.Scanner;
import java.util.Vector;

public class DriverProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReadFile readFile = new ReadFile();
        Process_Management processManagement = new Process_Management();
        userMenu(sc, readFile, processManagement);

    }

    public static void userMenu(Scanner sc, ReadFile rf, Process_Management processManagement) {

        Vector processList = new Vector<ProcessL>();
        int selection = sc.nextInt();

        System.out.println("Welcome to Priority Queue Systems\nWe're reading your file, wait a minute...");
        String filePath = "src/userProcess.txt";
        System.out.println(rf.readUserTxt(filePath).size());
        System.out.println("Please, select the type of VectorHeap to use: \n\t1. VectorHeap\n2. VectorHeap from JCF\n3.Finish program");

        switch(selection){
            case 1:

                System.out.println("Processes sorted by Linux priority using VectorHeap:");
                processManagement.pqUsingVH(rf.readUserTxt("src/userProcess.txt"), processList, sc);
                break;

            case 2:
                System.out.println("Processes sorted by Linux priority using VectorHeap from JCF:");
                break;

            case 3:
                System.out.println("Finishing program...");
                break;

            default:
                System.out.println("Select a valid option.");
                break;
        }
    }
}

