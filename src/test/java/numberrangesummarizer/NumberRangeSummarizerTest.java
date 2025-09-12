package numberrangesummarizer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


public class NumberRangeSummarizerTest {

    private final NumberRangeSummarizer summarizer = new NumberRangeSummarizerClass();

    @Test
    void testCollectNormalInput() {
        Collection<Integer> result = summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        assertEquals(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31), new ArrayList<>(result));
    }

    @Test
    void testCollectWithSpacesAndDuplicates() {
        Collection<Integer> result = summarizer.collect(" 1 , 3 , 3 , 2 , 1 ");
        assertEquals(Arrays.asList(1,2,3), new ArrayList<>(result));
    }

    @Test
    void testCollectEmptyString() {
        assertTrue(summarizer.collect("").isEmpty());
    }

    @Test
    void testSummarizeCollection() {
        Collection<Integer> input = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        String summary = summarizer.summarizeCollection(input);
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", summary);
    }

    @Test
    void testSummarizeSingleNumber() {
        Collection<Integer> input = Collections.singletonList(5);
        assertEquals("5", summarizer.summarizeCollection(input));
    }

    @Test
    void testSummarizeEmptyCollection() {
        assertEquals("", summarizer.summarizeCollection(Collections.emptyList()));
    }
    
}
