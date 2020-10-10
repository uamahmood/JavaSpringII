public class Project{
    // set project's fields or attributes
    private String name;
    private String description;
    
    
    // Overload constructor methods
    public Project(){
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String elevatorPitch(){
       return (name + description); 
    }
    // setting name
    public void setName(String name){
        this.name = name;
    }
    // setting description
    public void setDescription(String description){
        this.description = description;
    }
    // setting initialCost
    
    //getting name
    public String getProjectName(){
        return this.name;
    }
    //getting description
    public String getDescription(){
        return this.description;
    }
}