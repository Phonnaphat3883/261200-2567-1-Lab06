public class Fly extends Animal implements Flyable{
    @Override
    public void sound(){
        System.out.println("fuzzzzzz");
    }
    public void fly(){
        System.out.println("I believe I can fly");
    }
    public void glide(){
        System.out.println("I can also gliding");
    }
    public void land(){
        System.out.println("I can land on food");
    }
}
