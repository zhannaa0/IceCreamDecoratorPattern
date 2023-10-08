public class BananaIceCreamScoop implements IMachine {
    private IMachine iMachine;

    public BananaIceCreamScoop() {
        this.iMachine = null;
    }

    public BananaIceCreamScoop(IMachine iMachine) {
        this.iMachine = iMachine;
    }

    @Override
    public String make() {
        if (iMachine != null) {
            return iMachine.make() + ", banana ice cream scoop added";
        } else {
            return "Banana ice cream ";
        }
    }
}
