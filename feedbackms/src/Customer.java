public class Customer {
    int id;
    String name;

    Customer(int id, String name){
        this.id=id;
        this.name=name;
    }
    void changeName(String newName){
        name=newName;
    }
}
