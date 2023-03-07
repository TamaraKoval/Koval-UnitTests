public class Main {
    public static void main(String[] args) {
        Author author = new Author("Тамара", "Коваль");
        System.out.println(author.showNumber()); // проверяем количество книг автора

        Book book = new Book("50 оттенков синего", author, 2022);
        System.out.println(book); // переопределенный toString выдаст отформатированную информацию о книге
        System.out.println(book.showText()); // метод выводит информацию о тексте книги
        System.out.println(author.showNumber()); // проверили, количество книг у автора увеличилось

        book.ratingUp(); // повышаем рейтинг до 4
        System.out.println(book); // проверили, рейтинг равен 4
        book.ratingUp(); // повышаем рейтинг до 5
        System.out.println(book); // проверили, рейтинг равен 5
        book.ratingUp(); // пытаемся повысить рейтинг выше 5
        System.out.println(book); // повысить рейтинг выше 5 не удалось, оценка 5 - максимальная

        book.ratingDown(); // понижаем рейтинг до 4
        book.ratingDown(); // понижаем рейтинг до 3
        book.ratingDown(); // понижаем рейтинг до 2
        book.ratingDown(); // понижаем рейтинг до 1
        book.ratingDown(); // понижаем рейтинг до 0
        System.out.println(book); // проверили, рейтинг равен 0
        book.ratingDown(); // пытаемся понизить рейтинг ниже 0
        System.out.println(book); // понизить рейтинг ниже 0 не удалось, оценка 0 - минимальная

        book.appendToText("Следующую книгу я посвящу Белому. Саше Белому (с) Гендальф");
        System.out.println(book.text); // выведет текст книги через пряме обращение к полю
        System.out.println(book.showText()); // выведет текст книги в отформатированном виде

        Book book2 = author.newBook("50 оттенков белого");
        System.out.println(book2); // выведем информацию о созданной книге (по шаблону из Book)
        System.out.println(author.showNumber()); // количество книг тоже увеличилось, теперь их 2
    }
}