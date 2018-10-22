package softserve.academy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceGeneratorTest {
    @Test
    public void testGetSequence() {
        //GIVEN
        int sequenceLength = 10;
        int minSquare = 20;
        String expected = "5, 6, 7, 8, 9, 10, 11, 12, 13, 14";
        //WHEN
        String actual = SequenceGenerator.getSequence(sequenceLength, minSquare);
        //THEN
        assertEquals(expected, actual);
    }
}
