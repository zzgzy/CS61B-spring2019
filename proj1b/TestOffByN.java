import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByN {
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator OffByN = new OffByN(5);

    // Your tests go here.
    @Test
    public void testIsPalindrome() {
        assertTrue(OffByN.equalChars('a', 'f'));
        assertFalse(OffByN.equalChars('a', 'k'));
    }
}