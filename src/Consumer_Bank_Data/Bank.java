package Consumer_Bank_Data;

public class Bank {
    private int Number;
    private int id;
    private String name;
    private String Bankname;
    private String state;

    public Bank(int number, int id, String name, String bankname, String state) {
        Number = number;
        this.id = id;
        this.name = name;
        Bankname = bankname;
        this.state = state;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankname() {
        return Bankname;
    }

    public void setBankname(String bankname) {
        Bankname = bankname;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Number=" + Number +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", Bankname='" + Bankname + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void setState(String state) {
        this.state = state;
    }

}
