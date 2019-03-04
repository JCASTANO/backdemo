package com.demo.cinema.controlador;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.cinema.command.CreatePeliculaCommandHandler;
import com.demo.cinema.command.PeliculaCommand;
import com.demo.cinema.controller.PeliculaController;
import com.demo.cinema.port.PeliculaRepository;
import com.demo.cinema.query.SelectAllPeliculaQueryHandle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

@RunWith(SpringRunner.class)
@WebMvcTest(PeliculaController.class)
public class PeliculaControllerUnitTest {
	

	 @Autowired
	 private MockMvc mockMvc;
	 @MockBean
	 private PeliculaRepository peliculaRepository;
	 @MockBean
	 private SelectAllPeliculaQueryHandle queryHandler;
	 @MockBean
	 private CreatePeliculaCommandHandler CreatePeliculaCommandHandler;
	 
	 @Test
	 public void selectTest() throws Exception {
		 this.mockMvc.perform(get("/peliculas")).andDo(print()).andExpect(status().isAccepted())
         .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
	    }
	 
	 @Test
	 public void saveTest() throws Exception{
		 
		 PeliculaCommand pelicula= new PeliculaCommand();
		 pelicula.setTitulo("Venecas");
		 pelicula.setGenero("Romance");
		 
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		 ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
		 String peliculaJson=ow.writeValueAsString(pelicula);
		 
		 this.mockMvc.perform(post("/peliculas")
		 .contentType(MediaType.APPLICATION_JSON_UTF8)
         .content(peliculaJson))
         .andDo(print())
         .andExpect(status().isOk());
	 }


}

