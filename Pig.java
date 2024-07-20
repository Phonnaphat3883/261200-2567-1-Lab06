public class Pig extends Animal implements Pettable{
    @Override
    void sound(){
        System.out.println("Oai Oai");
    }

    public void feed(){
        System.out.println("You can feed MoopPing");
    }

    public void pet(){
        System.out.println("pet pet MooPing");
    }
}
