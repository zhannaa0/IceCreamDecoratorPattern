public class OreoCrunch extends IceCreamDecorator{
    public OreoCrunch(IMachine iMachine) {
        super(iMachine);
    }

    public String make(){
        return super.make() + ", oreo crunch added";
    }
}
