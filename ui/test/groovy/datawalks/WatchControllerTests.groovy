package datawalks

import static org.junit.Assert.*
import groovy.json.JsonSlurper

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.boot.test.WebIntegrationTest
import org.springframework.http.ResponseEntity
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
@ActiveProfiles("mock")
class WatchControllerTests {
	RestTemplate restTemplate = new TestRestTemplate()
	JsonSlurper slurper = new JsonSlurper()

	@Test
	public void testRequest() throws Exception {
		ResponseEntity entity = restTemplate.getForEntity("http://localhost:8080/watch/deviceIds", String.class)
		assertTrue(slurper.parseText(entity.getBody()) == [rows: [[device: 1]]])
	}
}
