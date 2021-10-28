import java.io.IOException;

// Interface spécifique (non disponible pour BufferedReader dans l'API Java)
public interface ILineReader {
    public String readLine() throws IOException;
}
