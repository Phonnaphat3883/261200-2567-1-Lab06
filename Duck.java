public class Duck extends Animal implements Flyable {

    public void clean(Animal cleanee){
    System.out.println(this + "Duck can clean" + cleanee);
    }
    @Override
    public void sound(){
        System.out.println("Quak Quak");
    }

    public void fly(){
        System.out.println("I believe I can fly");
    }
    public void glide(){
        System.out.println("I can also gliding");
    }
    public void land(){
        System.out.println("I can land on water");
    }
}
