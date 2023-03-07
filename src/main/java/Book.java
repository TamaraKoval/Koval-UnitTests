public class Book {
    public String title;
    public Author author;
    public int year;
    public int rating;
    public String text;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 3;
        this.text = "";
        author.numberOfBooks++;
    }

    public String toString() {
        return "\"" + title + "\"" + ", автор " + author + " (" + year + "), рейтинг - " + rating;
    }

    public String showText() {
        return "\"" + title + "\"" + " (" + author + "): " + text;
    }

    public void ratingUp() {
        if (rating < 5) {
            rating++;
        }
    }

    public void ratingDown() {
        if (rating > 0) {
            rating--;
        }
    }

    public void appendToText(String moreText) {
        text += moreText;
    }
}

