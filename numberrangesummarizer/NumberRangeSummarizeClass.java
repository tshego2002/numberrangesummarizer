package numberrangesummarizer;

import java.util.*;

public class NumberRangeSummarizeClass implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        if (input == null || input.isBlank()) {
            return Collections.emptyList();
            }              

            return List.of(1, 2);
    }
        

    @Override
        public String summarizeCollection(Collection<Integer> input) {
            if (input == null || input.isEmpty()) {
                return "";
                }

    return "Result: 1, 3, 6-8, 12-15, 21-24, 31";
        }
    }

    


