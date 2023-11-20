import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCases {

    @Test
    public void counts_special_characters() {
        Counter counter = new Counter();

        counter.addRow("/*, .*");

        int actual = counter.countCharacters();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void should_Stop_When_Stop_Returns_True() {
        Counter counter = new Counter();

        boolean actual = counter.addRow("StOp");
        boolean expected = true;

        assertEquals(expected, actual);
    }


    @Test
    public void should_not_stop_when_stop_middle_of_word() {
        Counter counter = new Counter();

        boolean actual = counter.addRow("adastopad");
        boolean expected = false;

        assertEquals(expected, actual);


    }

    @Test
    public void counts_words() {
        Counter counter = new Counter();

        counter.addRow("hej på dig");
        counter.addRow("kanske det kanske");
        counter.addRow("hoppas vi att det kör");
        counter.addRow("som smör");

        int actual = counter.countWords();
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    public void is_longestWord() {
        Counter counter = new Counter();

        counter.addRow("mjölk");
        counter.addRow("senap");
        counter.addRow("smör och bröd");
        counter.addRow("mer ketchup");
        counter.addRow("salt");


        String actual = counter.longestWord();
        String expected = "ketchup";
        assertEquals(expected, actual);
    }
}


