package com.example.bankproject.controller;

import com.example.bankproject.dto.ClientDto;
import com.example.bankproject.mapper.AccountMapper;
import com.example.bankproject.mapper.ClientMapper;
import com.example.bankproject.mapper.entity.Client;
import com.example.bankproject.repository.AgreementRepository;
import com.example.bankproject.repository.ManagerRepository;
import com.example.bankproject.service.ClientService;
import com.example.bankproject.service.impl.AccountServiceImpl;
import com.example.bankproject.util.DtoCreator;
import com.example.bankproject.util.EntityCreator;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static com.example.bankproject.controller.ClientController.reformationasJsonString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ClientController.class)
public class ClientControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    ClientMapper clientMapper;
    @MockBean
    private ClientService clientService;
    @MockBean
    private AccountServiceImpl accountService;
    @MockBean
    private AgreementRepository agreementRepository;
    @MockBean
    private ManagerRepository managerRepository;
    @Test
    void testGetClientById() throws Exception{
        BigInteger clientId = BigInteger.valueOf(1);
        Client client = EntityCreator.creatorClient();

        Mockito.when(clientService.getClientById(clientId)).thenReturn(client);

        mockMvc.perform(MockMvcRequestBuilders.get("/auth/clients/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(clientId.intValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value(client.getLastName()));
    }

    @Test
    void TestFindAllClient() throws Exception{
        List<Client> clients = Arrays.asList(
            new Client(1L,"Ivan"),
            new Client(2L, "Smith")
        );

        Mockito.when(clientService.findAllClient()).thenReturn(clients);

        mockMvc.perform(MockMvcRequestBuilders.get("/auth/clients/find"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(clients.get(0).getId().intValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].lastName").value(clients.get(0).getLastName()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(clients.get(1).getId().intValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].lastName").value(clients.get(1).getLastName()));

    }

    @Test
    public void testAddClient() throws Exception {
        // given
        ClientDto clientDto = DtoCreator.getClientDto();
        ClientDto clientDtoResponse = DtoCreator.getClientDto();
        //when
        Mockito.when(clientService.createClient(clientDto)).thenReturn(clientDtoResponse);
        //then
        mockMvc.perform(MockMvcRequestBuilders.post("/auth/clients/add")
                        .contentType("application/json;charset=UTF-8")
                        .content("{\"status\":\"ACTIVE\"," +
                                "\"taxCode\":\"1212121212121\"," +
                                "\"firstName\":\"Sergey\"," +
                                "\"lastName\":\"Serov\"," +
                                "\"email\":\"ssss@ss.com\"," +
                                "\"address\":\"Sholochova\"," +
                                "\"phone\":\"12121212121\"," +
                                "\"createdAt\":\"2023-02-02\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.header().string(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE));
    }
    @Test
    void addClientTest() throws Exception {
        // given
        ClientDto clientDto = DtoCreator.getClientDto();
        //when
        when(clientService.createClient(clientDto)).thenReturn(clientDto);
        //then
        mockMvc.perform(post("/auth/clients/add")
                        .content(reformationasJsonString(clientDto))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON));
    }

}
