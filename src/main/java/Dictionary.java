import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String, String> dictionnaire;

    public Dictionary(String name, Map<String, String> d){
        this.dictionnaire = d;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return dictionnaire.isEmpty();
    }
}
