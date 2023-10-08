public  class IceCreamDecorator implements IMachine{
    private IMachine iMachine;
    public IceCreamDecorator(IMachine iMachine){
        this.iMachine = iMachine;
    }

    public IceCreamDecorator() {
        this.iMachine = new IceCreamScoop();
    }

    @Override
    public String make() {
       return iMachine.make();
    }
}
