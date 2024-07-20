public class Main {
    public static void main(String[] args) {
//        Animal thinng = new Animal();
        Duck pretty = new Duck();
        pretty.sound();
        pretty.fly();
        pretty.glide();
        pretty.land();

        Owl harrypoter = new Owl();
        harrypoter.sound();
        harrypoter.fly();
        harrypoter.glide();
        harrypoter.land();

        Cow milk = new Cow();
        milk.sound();

        Pig mooping = new Pig();
        mooping.sound();

        Fly daybug = new Fly();
        daybug.sound();
        daybug.fly();
        daybug.glide();
        daybug.land();

        pretty.clean( harrypoter );

        milk.pet();
        milk.feed();

        mooping.pet();
        mooping.feed();
    }
}