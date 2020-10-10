import java.util.ArrayList;

public class ListOfExceptions{
    public void testing(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(1);
        myList.add("good morning");
        myList.add(51);
        myList.add("Goodnight moon");

        for(int i=0;i<myList.size();i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }catch(ClassCastException e){
                System.out.println("Error on index "+i);
            }
        }
    }
}