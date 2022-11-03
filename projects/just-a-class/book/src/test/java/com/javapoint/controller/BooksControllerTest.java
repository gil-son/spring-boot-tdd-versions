package com.javapoint.controller;

import com.javapoint.entity.Books;
import com.javapoint.repository.BooksRepository;
import com.javapoint.service.BooksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.*;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class BooksControllerTest {

    @Autowired
    private BooksController controller;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BooksService service;

    @MockBean
    private BooksRepository repository;

//    @Mock
//    List<Books> books = new ArrayList<>();

//    @BeforeEach
//    public void setup() {
//
//        // MockMvc standalone approach
//        mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .build();
//    }

//    @Test
//    void shouldReturnAllBooks() throws Exception{
//        //given
//        when(service.getAllBooks())
//                .thenReturn(books);
//
//        //when
////        mockMvc.perform(MockMvcRequestBuilders
////                        .get("/book")
////                        .accept(MediaType.APPLICATION_JSON))
////                .andExpect(MockMvcResultMatchers.status().isOk());
//
//        MockHttpServletResponse response = mockMvc.perform(
//                        get("/superheroes/2")
//                                .accept(MediaType.APPLICATION_JSON))
//                .andReturn().getResponse();
//
//        // then
//        assertThat(response.getStatus()).isEqualTo(HttpStatus.NOT_FOUND.value());
//        assertThat(response.getContentAsString()).isEmpty();
//        //then
//
//
//    }

    @Test
    void shouldReturnListOfBooks() throws Exception {
        List<Books> books = new ArrayList<>(
                Arrays.asList(new Books(1111, "A-book", "A-Author", 100),
                        new Books(2222, "B-book", "B-Author", 200),
                        new Books(3333, "C-book", "C-Author", 300)));

        when(service.getAllBooks()).thenReturn(books);
        mockMvc.perform(get("/book"))
                .andExpect(status().isOk());
    }

}
