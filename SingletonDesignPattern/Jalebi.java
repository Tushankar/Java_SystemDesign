package SingletonDesignPattern;

public class Jalebi {
    //we have to make one object of jalebi
    //constructor used to create object
    //constructor name is same as class name

    //its public so so many obkjects of jalebi can be made
    //but i dont want many objects to be accessed by others so
    //i cant keep it public i have to restrict it
    // public Jalebi(){
    //      //constructor
    // }

    //If we keep it private
    //baharse no objects can be made outside the class
    //ek object humko banana hai so we will use method 
    //constructor should be private object will be created bt method
    //its return type will be jalebi
    //To access normal methods we need objects how to acess as i dont
    //have any objects so to aceess any methods whithout objects we
    //use static

    //LAZY WAY OF CREATING SINGLETON OBJECT
    private static Jalebi jalebi;//null in the begining jalebi is my object so maki it private
    private Jalebi(){

    }
    public static Jalebi getJalebi(){
        if(jalebi == null){//will execute only first time
             jalebi = new Jalebi();
        }
        return jalebi;
    }


}
