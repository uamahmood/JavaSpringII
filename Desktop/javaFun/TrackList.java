import java.util.HashMap;
public class TrackList{
    public void trackList(){

        HashMap<String, String> newTrack = new HashMap<String, String>();
        newTrack.put("World's Greatest","I am a mountain/I am a tall tree, oh/I am a swift wind/Sweepin' the country" );
        newTrack.put("Gloria","Running after somebody, you gotta get him somehow");
        newTrack.put("Dear Mama","Ain't a woman alive that could take my mama's place/Suspended from school, and scared to go home, I was a fool");
        newTrack.put("Kiss from a Rose","You became the light on the dark side of me");

        System.out.println("get song by title : "+newTrack.get("World's Greatest"));

        newTrack.forEach((title,lyrics)->System.out.println(title+" : "+lyrics));
    }
}