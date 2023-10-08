public class ChocolateIceCreamScoop extends IceCreamDecorator {
    private IMachine iMachine;

    public ChocolateIceCreamScoop() {
        this.iMachine = null;
    }

    public ChocolateIceCreamScoop(IMachine iMachine) {
        this.iMachine = iMachine;
    }

    @Override
    public String make() {
        if (iMachine != null) {
            return iMachine.make() + ", chocolate ice cream scoop added";
        } else {
            return "Chocolate ice cream ";
        }
    }
}
