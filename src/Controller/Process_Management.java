package Controller;

import Model.ProcessL;
import Model.VectorHeap;
import Model.VectorHeapJCF;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 * The type Process management.
 */
public class Process_Management {

    /**
     * Pq using vh.
     *
     * @param line        the line
     * @param processList the process list
     * @param sc          the sc
     */
    public void pqUsingVH(ArrayList<String> line, Vector<ProcessL> processList, Scanner sc){

        processList = new Vector<>();
        boolean printQueue = true;

        for (String processInfo: line){
            String[] processes = processInfo.trim().split(",");

            processList.add(new ProcessL(processes[0], processes[1], processes[2]));
        }

        VectorHeap processQueue = new VectorHeap(processList);

        while(printQueue){
            System.out.println("\n" + processQueue.remove());
            System.out.println("Show next process? (Y/N)");
            String continueText = sc.next();
            printQueue = continueText.equalsIgnoreCase("y") && !processQueue.isEmpty();
        }

    }

    /**
     * Pq using vhjcf.
     *
     * @param line        the line
     * @param processList the process list
     * @param sc          the sc
     */
    public void pqUsingVHJCF(ArrayList<String> line, Vector<ProcessL> processList, Scanner sc){

        processList = new Vector<>();
        boolean printQueue = true;

        for (String processInfo: line){
            String[] processes = processInfo.trim().split(",");
            processList.add(new ProcessL(processes[0], processes[1], processes[2]));
        }

        VectorHeapJCF processQueue = new VectorHeapJCF(processList);

        while(printQueue){
            System.out.println(processQueue.remove());
            System.out.println("\n" + "Show next process? (Y/N)");
            String continueText = sc.next();
            printQueue = continueText.equalsIgnoreCase("y") && !processQueue.isEmpty();
        }

    }

}
