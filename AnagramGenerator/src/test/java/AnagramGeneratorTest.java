import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AnagramGeneratorTest {

    @Test
    public void testGenerateAnagrams_ValidInput() {
        List<String> result = AnagramGenerator.generateAnagrams("abc");
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateAnagrams_EmptyInput() {
        AnagramGenerator.generateAnagrams("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateAnagrams_NullInput() {
        AnagramGenerator.generateAnagrams(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateAnagrams_InvalidCharacters() {
        AnagramGenerator.generateAnagrams("a1b!");
    }

    @Test
    public void testGenerateAnagrams_SingleLetter() {
        List<String> result = AnagramGenerator.generateAnagrams("a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }
}
