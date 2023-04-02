package Model;

/**
 * The type Process l.
 */
public class ProcessL implements Comparable<ProcessL> {

    /**
     * The Name process.
     */
    String nameProcess;
    /**
     * The User name.
     */
    String userName;
    /**
     * The Nice value.
     */
    String niceValue;
    /**
     * The Priority.
     */
    String priority;

    /**
     * Instantiates a new Process l.
     *
     * @param nP the n p
     * @param uN the u n
     * @param nV the n v
     */
    public ProcessL(String nP, String uN, String nV){
        this.nameProcess = nP;
        this.userName = uN;
        this.niceValue = nV;
        this.priority = String.valueOf((Integer.parseInt(niceValue) + 120));

    }

    /**
     * Gets name process.
     *
     * @return the name process
     */
    public String getNameProcess() {
        return nameProcess;
    }

    /**
     * Sets name process.
     *
     * @param nameProcess the name process
     */
    public void setNameProcess(String nameProcess) {
        this.nameProcess = nameProcess;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets nice value.
     *
     * @return the nice value
     */
    public String getNiceValue() {
        return niceValue;
    }

    /**
     * Sets nice value.
     *
     * @param niceValue the nice value
     */
    public void setNiceValue(String niceValue) {
        this.niceValue = niceValue;
    }

    /**
     * Gets priority.
     *
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     *
     * @param prioriy the prioriy
     */
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
