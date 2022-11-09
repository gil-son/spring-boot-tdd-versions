package com.algaworks.algalog.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;
import com.algaworks.algalog.domain.service.CatalogoClienteService;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class ClienteControllerTest {

    @Autowired
    private ClienteController controller;

    @MockBean
    private ClienteRepository repository;


    @MockBean
    private CatalogoClienteService service;

    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads(){
        Assertions.assertThat(controller).isNotNull();
    }


    @Test
    void testfindAll() throws Exception {
        Cliente cliente = new Cliente(1L, "Aaaa", "aaa@aaa.com", "11 - 33333333");
        List<Cliente> clientes = Arrays.asList(cliente);

        Mockito.when(repository.findAll()).thenReturn(clientes); // remove repository to use service

        mockMvc.perform(get("/clientes"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].nome", Matchers.is("Aaaa")));
    }


}
