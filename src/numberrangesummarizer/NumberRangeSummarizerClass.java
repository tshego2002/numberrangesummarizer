package numberrangesummarizer;

import java.util.*;

public class NumberRangeSummarizerClass implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        if (input == null || input.isBlank()) {
            return Collections.emptyList();
            }              

            String[] inputArray = input.split(",");

            Set<Integer> numbers = new HashSet<>(); //to remove duplicates from the list

            for (String num : inputArray) {
                if (num != null) {
                    String trimmed = num.trim(); // remove spaces
                    if (!trimmed.isEmpty()) {
                        int finalNum = Integer.parseInt(trimmed); // convert to integer
                        numbers.add(finalNum); // add to set (removes duplicates)
                    }
                }
            }
        
            // Step 3: Sort the numbers
            List<Integer> sortedList = new ArrayList<>(numbers);
            Collections.sort(sortedList);
        
            return sortedList;
            
    }
        

    @Override
        public String summarizeCollection(Collection<Integer> input) {
            if (input == null || input.isEmpty()) {
                return "";
                }

                List<Integer> numbers = new ArrayList<>(input);
                Collections.sort(numbers);

                StringBuilder result = new StringBuilder();

                int start = numbers.get(0);
                int prev = start;
            
                for (int i = 1; i < numbers.size(); i++) {
                    int current = numbers.get(i);
            
                    if (current != prev + 1) {
                        appendString(result, start, prev);
                        result.append(", ");
                        start = current;
                    }
                    prev = current;
                }
            
                // Append the last range
                appendString(result, start, prev);
            
                return result.toString();
            }
            
            //this method creates the final string
            private void appendString(StringBuilder sb, int start, int end) {
                if (start == end) {
                    sb.append(start);
                } else {
                    sb.append(start).append("-").append(end);
                }
            }



        }
    

    


