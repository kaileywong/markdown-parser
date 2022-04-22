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

     @Test
    public void newtestCorrectLinks() throws IOException {
        Path fileName = Path.of("new-test.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

     @Test
    public void test2CorrectLinks() throws IOException {
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }
     @Test
    public void test3CorrectLinks() throws IOException {
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }
}