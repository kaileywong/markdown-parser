import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void testfileCorrectLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }
}