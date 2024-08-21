class Animal{
    void eats(){
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("This animal barks");
    }
}
class Puppy extends Dog{
    void breed(){
        System.out.println("This breed Doberman");
    }
}
public class multiInheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        Puppy p = new Puppy();
        d.eats();
        d.barks();
        p.eats();
        p.barks();
        p.breed();
    }
}