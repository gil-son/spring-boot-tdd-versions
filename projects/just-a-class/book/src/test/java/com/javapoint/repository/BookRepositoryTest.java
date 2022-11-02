package com.javapoint.repository;

import com.javapoint.entity.Books;
import com.javapoint.repository.BooksRepository;
import com.javapoint.service.BooksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
public class BookRepositoryTest {


    @MockBean // instance the class and all dependencies that class
    private BooksRepository booksRepository;

    @Mock // created a mock and equals Mockito.mock()
    Books books; // Books books = Mockito.mock(Books.class);

    // @InjectMocks creates an instance of the class and injects the mocks that are created with @Mock annotations into that instance.

    @Test
    public void shouldCreateABook(){

        Mockito.when(booksRepository.save(books)).thenReturn(books);
        Assertions.assertEquals(booksRepository.save(books), books);
    }

}
