public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehaviour = new Quacks();
        flyBehaviour = new FlyWithWings();
        swimBehaviour = new CanSwim();

    }

    @Override 
    void display(){
        System.out.println("I'm a real Red Head duck");
    }
   
}
