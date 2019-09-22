
package Model;


public class Students {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public Students(String rollNum, String name, boolean present) {
        this.name = name;
        this.rollNum = rollNum;
        this.present = present;
    }
    String  name;
    String  rollNum;
    boolean present;
    
    
    
}
