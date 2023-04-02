package UI;

import Controller.Process_Management;
import Controller.ReadFile;
import Model.ProcessL;
import java.util.Scanner;
import java.util.Vector;

/**
 * The type Driver program.
 */
public class DriverProgram {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReadFile readFile = new ReadFile();
        Process_Management processManagement = new Process_Management();
        userMenu(sc, readFile, processManagement);

    }

    /**
     * User menu.
     *
     * @param sc                the sc
     * @param rf                the rf
     * @param processManagement the process management
     */
    public static void userMenu(Scanner sc, ReadFile rf, Process_Management processManagement) {

        System.out.println("Welcome to Priority Queue Systems\n\nWe're reading your file, wait a minute...\n");
        System.out.println("Please, select the type of VectorHeap to use: \n\t1. VectorHeap\n\t2. VectorHeap from JCF\n\t3.Finish program");

        Vector processList = new Vector<ProcessL>();
        int selection = sc.nextInt();

        switch(selection){
            case 1:

                System.out.println("Processes sorted by Linux priority using VectorHeap:");
                processManagement.pqUsingVH(rf.readUserTxt("src/userProcess.txt"), processList, sc);
                break;

            case 2:
                System.out.println("Processes sorted by Linux priority using VectorHeap from JCF:");
                processManagement.pqUsingVHJCF(rf.readUserTxt("src/userProcess.txt"), processList, sc);
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

