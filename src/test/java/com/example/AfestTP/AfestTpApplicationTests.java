package com.example.AfestTP;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.models.Book;
import com.example.AfestTP.models.BookType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AfestTpApplicationTests {

    private Author author;

    private static Instant starttime;
    private Book book;

    @BeforeAll
    public static void debutTest() {
        starttime = Instant.now();
        System.out.println("début des tests à:" + starttime);
    }

    @AfterAll
    public static void finTest() {
        Instant endtime = Instant.now();
        Duration duration = Duration.between(starttime, endtime);
        System.out.println("le temps écoulé est de : " + duration);
    }

    @BeforeEach
    public void prepareAuthor() {
        this.author = new Author(1L, "jean", "michel");
        this.book = new Book("Pandora", BookType.FANTASIE, author, 125, 23D);
    }

    @Test
    void testAuthorInit() throws Exception {
        assertEquals("jean", author.getAuthorFirstName());
        assertEquals("michel", author.getAuthorLastName());
        //  author.setAuthorId(null);
        assertNotNull(author.getAuthorId(), "id manquant");
    }

    @Test
    void testAuthor() throws Exception {
        this.author.setAuthorFirstName("jack");
        assertEquals("jack", this.author.getAuthorFirstName());
    }

    @Test
    void testBook() throws Exception {
        assertEquals("Pandora", book.getTitle(), "Le titre n'est pas bon");
        assertEquals("FANTASIE", String.valueOf(book.getBookType()));
        assertEquals("michel", book.getAuthor().getAuthorLastName());
        assertEquals(125, book.getNbPages());
        assertEquals(23, book.getPrice());

        book.setBookType(BookType.POESIE);
        assertEquals(
                "POESIE",
                String.valueOf(book.getBookType()),
                "Le type du book n'est pas bon");
    }

  /*  @Test
    void testAuthorService(){
        AuthorService svc=new AuthorService();
        assertNotNull(svc.getAll());
    } */
}
