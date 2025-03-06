package OOPs.packedges;

public class Account {
    public String name;
    public void setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("The name is: "+ this.name);
    }
    public Account(){
        System.out.println("Account is being created...");
    }
    public Account(String name){
        this.name = name;
    }
}
