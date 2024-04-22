package datastructures.streams;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExamplesTest extends TestCase {
    private List<StreamExamples.Person> females;
    private List<StreamExamples.Person> males;
    private List<StreamExamples.Person> mergedAndSorted;


    //TODO: needs work
/*
    @Before
    public void setup() {
        females = new ArrayList<>();
        females.add(new StreamExamples.Person("Gina", "Waters", "F"));
        females.add(new StreamExamples.Person("Shawna", "Swift", "F"));
        females.add(new StreamExamples.Person("Helen", "Swan", "F"));

        males = new ArrayList<>();
        males.add(new StreamExamples.Person("Martin", "Lawrence", "M"));
        males.add(new StreamExamples.Person("Will", "Jackson", "M"));
        males.add(new StreamExamples.Person("Dave", "Chico", "M"));
    }
*/

    @Test
    public void testStringStartsWith() {
        List<String> strings = Arrays.asList(new String[]{"gram", "gronk", "erase"});
        StreamExamples se = new StreamExamples();
        List<String> res = se.startsWithGivenString(strings, "gr");
        Assert.assertEquals(res.stream().count(), 2);
        res.forEach(r -> System.out.println(r));
    }

    @Test
    public void testPersonNameContainsChar() {
        males = new ArrayList<>();
        males.add(new StreamExamples.Person("Martin", "Lawrence", "M"));
        males.add(new StreamExamples.Person("Will", "Jackson", "M"));
        males.add(new StreamExamples.Person("Dave", "Chico", "M"));
        StreamExamples se = new StreamExamples();
        List<StreamExamples.Person> res = se.containsChar(males, "l");
        res.forEach(r -> System.out.println( r.firstName));
    }

    @Test
    public void testMergedAndSorted(){
        males = new ArrayList<>();
        males.add(new StreamExamples.Person("Martin", "Lawrence", "M"));
        males.add(new StreamExamples.Person("Will", "Jackson", "M"));
        males.add(new StreamExamples.Person("Dave", "Chico", "M"));
        females = new ArrayList<>();
        females.add(new StreamExamples.Person("Gina", "Waters", "F"));
        females.add(new StreamExamples.Person("Shawna", "Swift", "F"));
        females.add(new StreamExamples.Person("Helen", "Swan", "F"));

        StreamExamples se = new StreamExamples();
        mergedAndSorted = se.mergedAndSorted(males, females);
        mergedAndSorted.forEach(s -> System.out.println(s.toString()));
    }
}