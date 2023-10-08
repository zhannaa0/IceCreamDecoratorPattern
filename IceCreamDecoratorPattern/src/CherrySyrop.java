public class CherrySyrop extends IceCreamDecorator{
    public CherrySyrop(IMachine iMachine) {
        super(iMachine);
    }

    public String make(){
        return super.make() + ", cherry syrop added";
    }
}
