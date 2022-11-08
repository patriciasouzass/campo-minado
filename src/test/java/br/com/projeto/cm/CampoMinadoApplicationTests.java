package br.com.projeto.cm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CampoMinadoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testarSeIgualADois() {
        int a = 1 + 1;
        assertEquals(2, a);
    }

}
