import java.util.*;

public class Dictionary implements IDictionary {
    private String name;
    private Map<String, List<String>> dictionnaire;

    public Dictionary(String name){
        this.dictionnaire = new HashMap<String, List<String>>();
        this.name = name;
    }
    public Dictionary(String name, Map<String, List<String>> d){
        this.dictionnaire = d;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return dictionnaire.isEmpty();
    }

    public void addTranslation(String contre, List<String> against) {
        this.dictionnaire.put(contre, against);
    }

    public List<String>  getTranslation(String mot) {
        return this.dictionnaire.get(mot);
    }


    public Map<String,List<String>> getDictionnaire(){
        return this.dictionnaire;
    }

    public void reset () {
        dictionnaire.clear();
    }

    public Set<String> getReverseTranslation(String word) {
        Set<String> cles = new HashSet<>();
        for(String str : dictionnaire.keySet()){
            if (dictionnaire.get(str).contains(word)) {
                cles.add(str);
            }
        }
        return cles;
    }
}
