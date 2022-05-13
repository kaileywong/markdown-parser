import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class MarkdownParseTest {

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

    @Test
    public void testfileCorrectLinks() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile2CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile3CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile4CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile5CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile6CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("page.com"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile7CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile8CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void newTest() {
        assertEquals(1, 1);
    }

    @Test
    public void testfile9CorrectLinks() throws IOException {
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

}