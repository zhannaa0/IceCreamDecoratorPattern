public class Sprinkles extends IceCreamDecorator{
    public Sprinkles(IMachine iMachine) {
        super(iMachine);
    }

    public String make(){
        return super.make() + ", sprinkles added";
    }
}
