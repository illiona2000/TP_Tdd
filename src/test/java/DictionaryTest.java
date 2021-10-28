import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {
    Map<String, String> maptest = new HashMap<String, String>();
    Dictionary dico = new Dictionary("Example", maptest);

    @Test
    public void testDictionaryName() {
        assertThat(dico.getName(), equalTo("Example"));
    }

    @Test
    public void testIsEmpty() {
        assertThat(dico.isEmpty(), equalTo(true));
    }

}
