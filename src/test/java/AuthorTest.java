import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    Author author;

    @BeforeEach
    void beforeEach() {
        author = new Author("Test", "Testov");
    }

    @Test
    void test_newBook_toString_correct() {
        String title = "NumberOne";
        Book expectedBook = new Book(title, author, 2023);
        Book actualBook = author.newBook(title);

        Assertions.assertEquals(expectedBook.toString(), actualBook.toString());
    }

    @Test
    void test_newBook_increase_numberOfBooksTo1() {
        String title = "NumberOne";
        Book firstBook = author.newBook(title);
        int expectedNumber = 1;

        Assertions.assertEquals(expectedNumber, author.numberOfBooks);
    }

    @Test
    void test_newBook_increase_numberOfBooksTo2() {
        Book firstBook = author.newBook("First");
        Book secondtBook = author.newBook("Second");
        int expectedNumber = 2;

        Assertions.assertEquals(expectedNumber, author.numberOfBooks);
    }

    @Test
    void test_abbreviatedAuthor_correct() {
        String expectedAbbreviatedAuthor = "T.Testov";

        Assertions.assertEquals(expectedAbbreviatedAuthor, author.abbreviatedAuthor);
    }
}