package Model;

public class ProcessL implements Comparable<ProcessL> {

    String nameProcess;
    String userName;
    String niceValue;
    String priority;

    public ProcessL(String nP, String uN, String nV){
        this.nameProcess = nP;
        this.userName = uN;
        this.niceValue = nV;
        this.priority = String.valueOf((Integer.parseInt(niceValue) + 120));

    }

    public String getNameProcess() {
        return nameProcess;
    }

    public void setNameProcess(String nameProcess) {
        this.nameProcess = nameProcess;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNiceValue() {
        return niceValue;
    }

    public void setNiceValue(String niceValue) {
        this.niceValue = niceValue;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String prioriy) {
        this.priority = prioriy;
    }

    @Override
    public int compareTo(ProcessL otherProcess){
        return this.niceValue.compareTo(otherProcess.niceValue);
    }

    public String toString(){
        return (getNameProcess() + ", " + getUserName() + ", " + getNiceValue() + ", PR=" + getPriority());
    }

}
