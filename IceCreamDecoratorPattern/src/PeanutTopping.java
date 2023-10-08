public class PeanutTopping extends IceCreamDecorator{
    public PeanutTopping(IMachine iMachine) {
        super(iMachine);
    }

    public String make(){
        return super.make() + ", peanuts added";
    }
}
