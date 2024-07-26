package SingletonDesignPattern;

public class Samosa {
    //object is ready 
    private static Samosa  samosa = new Samosa();
    //EAGER/EARLY WAY OF CREATING SINGLETON OBJECT
    public static Samosa getSamosa(){
        return samosa;
    }
}
