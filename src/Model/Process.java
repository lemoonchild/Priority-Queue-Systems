package Model;

public class Process {

    private String nameProcess;
    private String userName;
    private String niceValue;
    private String priority;

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

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String toString(){
        return (getNameProcess() + ", " + getUserName() + ", " + getNiceValue() + ", PR=" + getPriority());
    }



}
