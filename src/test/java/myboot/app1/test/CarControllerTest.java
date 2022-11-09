package myboot.app1.test;

import myboot.app1.web.CarController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CarController.class) // to scan the controller we have defined and the MVC infrastructure.
@ExtendWith(SpringExtension.class) // to register it with JUnit 5 test
class CarControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getAllCarsTest() throws Exception{
        mockMvc.perform(get("/api/cars"))
                .andExpect(status().is2xxSuccessful());
    }



}