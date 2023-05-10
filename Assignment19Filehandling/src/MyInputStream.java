import java.io.IOException;
import java.io.InputStream;

public class MyInputStream extends InputStream {
    public MyInputStream(InputStream is) {
        this.is = is;
    }

    private InputStream is;

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {
        super.close();
    }
}
