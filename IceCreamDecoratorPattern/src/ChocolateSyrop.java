public class ChocolateSyrop extends IceCreamDecorator{
   public ChocolateSyrop(IMachine machine){
       super(machine);
   }

    public String make(){
        return super.make() + ", chocolate syrop added";
    }
}
