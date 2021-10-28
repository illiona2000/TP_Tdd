import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

// Utilisation d'un adaptateur pour pallier le problème ci-dessus
public class LineReader implements ILineReader {
    private BufferedReader reader;
    public LineReader(Reader in) {
        reader = new BufferedReader(in);
    }
    @Override
    public String readLine() throws IOException {
        return reader.readLine();
    }
}