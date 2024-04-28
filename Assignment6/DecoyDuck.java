public class DecoyDuck extends Duck {
    
    public DecoyDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
        swimBehaviour = new CannotSwim();
    }

    @Override
    void display() {
        System.out.println("I am a Decoy Duck");
    }



}
