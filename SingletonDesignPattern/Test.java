package SingletonDesignPattern;


public class Test {
    public static void main(String[] args){
        //its public so so many obkjects of jalebi can be made
        // Jalebi jalebi = new Jalebi();

        //here we gain acesss the method 
        // Jalebi jalebi1 =  Jalebi.getJalebi();
        // Jalebi jalebi2 =  Jalebi.getJalebi();
        //Still we can make so many jalebis 
        //so we have to restrict to make only one object so applu a condition in jalebiclass

        //no when we calll jalebi1 jalebi2 many times it will only return the first
        //one that we created by null we can check by printing the hashcode
        Jalebi jalebi1 =  Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
        Jalebi jalebi2 =  Jalebi.getJalebi();
        System.out.println(jalebi2.hashCode());

        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

    }
}
