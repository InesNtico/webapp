package com.openclassrooms.webapp;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test //pour que la méthode soit détectée comme un test à effectuer
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/")) //l'url / donc home permet d'afficher tous les employés
                .andDo(print()) //affiche le retour de l'appel, ici le code html de la page d'accueil
                .andExpect(status().isOk())
                .andExpect(view().name("home")) //dit qu'on est censé recevoir home par le controller
                .andExpect(content().string(containsString("Laurent"))); //vérifie que le corps de a réponse contient le texte Laurent


    }

    @Test
    public void testUpdateEmployee() throws Exception{
        mockMvc.perform(put("/updateEmployee/2"))
                .andExpect(status().isOk())
                .andDo(print());
    } //fonctionne pas
}
