package com.javapoint.service;

import com.javapoint.entity.Books;
import com.javapoint.repository.BooksRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;


@SpringBootTest
public class BookServiceTest {

    @Mock
    private BooksRepository booksRepository;

    @InjectMocks
    private BooksService booksService;

    Books books = Mockito.mock(Books.class); // @Mock Books books;


//    @Test
//    public void whenSaveReturnBook(){
//
//
//    }

    @Test
    void shouldFindAllBooks() {

        List<Books> booksList = new ArrayList<>();
        booksList.add(books);
        when(booksRepository.findAll()).thenReturn(booksList);

        Assertions.assertNotNull(booksService.getAllBooks());
    }
}
