package com.parcial.Examen.Final;

import com.sun.deploy.net.HttpResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import sun.net.www.http.HttpClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExamenFinalApplicationTests {
    @LocalServerPort
    private int port;

	@Test
	public void primeraPrueba() {

    }




}
