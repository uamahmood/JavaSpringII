public class StringManipulatorTesting{
    public static void main(String[] args){
        StringManipulator manipulatorObject = new StringManipulator();

        Character letter = 'o';
        Character letter2 = 'q';

        System.out.println(manipulatorObject.trimAndConcatinate("    Sup     ","        Yo      ")); 
        
        System.out.println(manipulatorObject.getIndexOrNull("Coding",letter)); 
        System.out.println(manipulatorObject.getIndexOrNull("Hello World",letter)); 
        System.out.println(manipulatorObject.getIndexOrNull("Coding",letter2)); 

        System.out.println(manipulatorObject.getIndexOrNull("Coding","ing")); 
        System.out.println(manipulatorObject.getIndexOrNull("Coding","fry"));

        System.out.println(manipulatorObject.concatSubstring("Coding Dojo", 2, 5, "Hello")); 
    }
}