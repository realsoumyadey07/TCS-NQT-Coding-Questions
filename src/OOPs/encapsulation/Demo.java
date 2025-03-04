package OOPs.encapsulation;

class Human {
    String name;
    private String email;
    private String password;
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void printInfo(){
        System.out.println("Name: "+ this.name+ " Email: "+ this.email+ " Password: "+ this.password);
    }
}

public class Demo {
    public static void main(String[] args) {
        Human hu1 = new Human();
        hu1.name = "Soumya";
        hu1.setEmail("soumyadipdey802@gmail.com");
        hu1.setPassword("Soumya@2002");
        hu1.printInfo();
    }
}
