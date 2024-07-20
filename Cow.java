public class Cow extends Animal implements Pettable{
    @Override
    public void sound(){
        System.out.println("Moo Moo");
    }

    public void feed(){
        System.out.println("You can feed Milk");
    }

    public void pet(){
        System.out.println("pet pet Milk");
    }

}
