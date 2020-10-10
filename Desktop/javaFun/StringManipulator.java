public class StringManipulator{
    
    public String trimAndConcatinate(String A, String B){
        return A.trim() + B.trim();
    }

    public Integer getIndexOrNull(String phrase, Character letter){
        if (phrase.indexOf(letter)==-1){
            return null;
        }

        return phrase.indexOf(letter);
    }

    public Integer getIndexOrNull(String phrase, String substring){
        if (phrase.indexOf(substring) == -1){
            return null;
        }
        return phrase.indexOf(substring);
    }

    public String concatSubstring(String pharseA, Integer start, Integer stop, String phraseB ){
        return pharseA.substring(start, stop) + phraseB;
    }

}