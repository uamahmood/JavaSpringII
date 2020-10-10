public class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project("First Project");
        Project project2 = new Project("Second Project");
        Project project3 = new Project("Third Project", " Third time is a charm");
        Project project4 = new Project("Fourth Project", " This is the fourth part");
        
        //display all projects
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        System.out.println(project4.elevatorPitch());

        //set project name, description
        project1.setName("Uno");
        project1.setDescription("This is the lucky one");
        System.out.println("Project I : "+ project1.elevatorPitch());
        project2.setDescription("This is the best one");

        //get project name, description
        System.out.println(project1.getProjectName());
        System.out.println(project1.getDescription());
    }
}