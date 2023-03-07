import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Author author;
    Book testingBook;

    @BeforeEach
    void beforeEach() {
        author = new Author("Test", "Testov");
        testingBook = author.newBook("Olala");
    }

    @Test
    void test_appendToText_noTextInitially() {
        String newText = "Это новая строка";
        testingBook.appendToText(newText);

        Assertions.assertEquals(newText, testingBook.text);
    }

    @Test
    void test_appendToText_textAddition() {
        String firstString = "Это первая строка строка ";
        String secondString = "Это вторая строка";

        testingBook.appendToText(firstString);
        testingBook.appendToText(secondString);

        Assertions.assertEquals(firstString+secondString, testingBook.text);
    }

    @Test
    void test_ratingUp_lessThan5() {
        int expectedRating = 4;
        testingBook.ratingUp();

        Assertions.assertEquals(expectedRating, testingBook.rating);
    }

    @Test
    void test_ratingUp_moreThan5() {
        int expectedRating = 5;
        testingBook.ratingUp();
        testingBook.ratingUp();
        testingBook.ratingUp();

        Assertions.assertEquals(expectedRating, testingBook.rating);
    }

    @Test
    void test_ratingDown_moreThan0() {
        int expectedRating = 2;
        testingBook.ratingDown();

        Assertions.assertEquals(expectedRating, testingBook.rating);
    }

    @Test
    void test_ratingDown_lessThan0() {
        int expectedRating = 0;
        testingBook.ratingDown();
        testingBook.ratingDown();
        testingBook.ratingDown();
        testingBook.ratingDown();

        Assertions.assertEquals(expectedRating, testingBook.rating);
    }
}