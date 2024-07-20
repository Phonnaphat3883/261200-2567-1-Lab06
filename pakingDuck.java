public class pakingDuck extends Duck{
    void beCrispy(){
        System.out.println("Grab");
    }
    @Override
    public void clean(Animal cleanee){
        System.out.println("I died already, sorry.");
    }
}
