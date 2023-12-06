import static org.junit.Assert.*;
import org.junit.Test;

public class StringProcessorTest {

    @Test
    public void testIsStrongPassword() {
        StringProcessor stringProcessor = new StringProcessor();

        // Test Case 1: Strong password
        assertTrue(stringProcessor.isStrongPassword("StrongPass@123"));

        // Test Case 2: Missing uppercase letter
        assertFalse(stringProcessor.isStrongPassword("weakpass@123"));

        // Test Case 3: Missing lowercase letter
        assertFalse(stringProcessor.isStrongPassword("WEAKPASS@123"));

        // Test Case 4: Missing digit
        assertFalse(stringProcessor.isStrongPassword("WeakPass@"));

        // Test Case 5: Missing special symbol
        assertFalse(stringProcessor.isStrongPassword("WeakPass123"));
    }

    @Test
    public void testCalculateDigits() {
        StringProcessor stringProcessor = new StringProcessor();

        // Test Case 1: Digits in the middle of the sentence
        assertEquals(3, stringProcessor.calculateDigits("Hello123World"));

        // Test Case 2: No digits
        assertEquals(0, stringProcessor.calculateDigits("NoDigitsHere"));

        // Test Case 3: Digits at the beginning
        assertEquals(2, stringProcessor.calculateDigits("789Start"));

        // Test Case 4: Digits at the end
        assertEquals(4, stringProcessor.calculateDigits("EndWith456"));

        // Test Case 5: Only digits
        assertEquals(6, stringProcessor.calculateDigits("123456"));
    }

    @Test
    public void testCalculateWords() {
        StringProcessor stringProcessor = new StringProcessor();

        // Test Case 1: Normal sentence
        assertEquals(5, stringProcessor.calculateWords("This is a test sentence."));

        // Test Case 2: Empty sentence
        assertEquals(0, stringProcessor.calculateWords(""));

        // Test Case 3: Sentence with extra spaces
        assertEquals(3, stringProcessor.calculateWords("  Extra    Spaces  "));

        // Test Case 4: Sentence with punctuation
        assertEquals(4, stringProcessor.calculateWords("Punctuation, can be tricky!"));

        // Test Case 5: Sentence with numbers
        assertEquals(4, stringProcessor.calculateWords("The answer is 42."));
    }

    // Add similar test methods for calculateExpression if it's not shown in your code
}