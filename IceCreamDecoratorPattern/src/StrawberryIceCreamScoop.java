public class StrawberryIceCreamScoop extends IceCreamDecorator{
    private IMachine iMachine;

    public StrawberryIceCreamScoop() {
        this.iMachine = null;
    }

    public StrawberryIceCreamScoop(IMachine iMachine) {
        this.iMachine = iMachine;
    }

    @Override
    public String make() {
        if (iMachine != null) {
            return iMachine.make() + ", strawberry ice cream scoop added";
        } else {
            return "Strawberry ice cream ";
        }
    }
}
