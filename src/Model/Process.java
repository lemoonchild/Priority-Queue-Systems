package Model;

public class Process {

    String nameProcess;
    String userName;
    String niceValue;
    String priority;

    public Process(String nP, String uN, String nV){
        this.nameProcess = nP;
        this.userName = uN;
        this.niceValue = nV;
        this.priority = niceValue + 120;

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

    public String toString(){
        return (getNameProcess() + ", " + getUserName() + ", " + getNiceValue() + ", PR=" + getPriority());
    }

}
