package OOPS;
class Dog{
    public void Speaks(){
        System.out.println(" Bhokta hai madharchod ");
    }
}
class cat{
    public void Speaks(){
        System.out.println(" Mew mew ");
    }
}
class Snake{
    public void Speaks(){
        System.out.println(" frrrr frrrr ");
    }
}
class cow{
    public void Speaks(){
        System.out.println(" Maaaaa ");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        cow c = new cow();
        c.Speaks();
        cat ct = new cat();
        ct.Speaks();
        Dog d = new Dog();
        d.Speaks();
        Snake s = new Snake();
        s.Speaks();
    }
}
