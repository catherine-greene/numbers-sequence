package softserve.academy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {
    @Test
    public void testIsValidForNotNumber() {
        //GIVEN
        String arg = "a";
        //WHEN
        boolean actual = Validator.isValid(arg);
        //THEN
        assertFalse(actual);
    }

    @Test
    public void testIsValidForNegativeNumber() {
        //GIVEN
        String arg = "-1";
        //WHEN
        boolean actual = Validator.isValid(arg);
        //THEN
        assertFalse(actual);
    }

    @Test
    public void testIsValidForValidNumber() {
        //GIVEN
        String arg = "5";
        //WHEN
        boolean actual = Validator.isValid(arg);
        //THEN
        assertTrue(actual);
    }
}
