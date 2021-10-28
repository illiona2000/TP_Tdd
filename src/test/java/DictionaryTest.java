import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Array;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DictionaryTest {
    Dictionary dict;
    Map<String, List<String>> maptest = new HashMap<String, List<String>>();


    @BeforeAll
    public void initialize () {
        dict = new Dictionary("Example", maptest);
    }
    @AfterAll
    public void reset () {
        dict.reset();
        maptest.clear();
    }

    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void testIsEmpty() {
        assertThat(dict.isEmpty(), equalTo(dict.getDictionnaire().isEmpty()));
    }

    @Test
    public void testOneTranslation() {
        dict.addTranslation("contre", List.of("against","versus"));
        assertThat(dict.getTranslation("contre"), equalTo(dict.getDictionnaire().get("contre")));
    }

    @Test
    public void testReverseTranslation(){
        List<String> list = new ArrayList<String>();
        list.add("bird");
        list.add("bird");
        dict.addTranslation("oiseau", list);
        assertThat(dict.getReverseTranslation("bird"), equalTo(Set.of("oiseau")));

    }

}
