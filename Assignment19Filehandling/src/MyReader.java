import java.io.IOException;
import java.io.Reader;

public class MyReader extends Reader {
    private Reader reader;

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
