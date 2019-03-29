package com.example.javacfenvvolumes;

import java.nio.file.Path;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaCfenvVolumesApplicationTests {

	@Autowired
	private Path path;

	@Test
	public void contextLoads() {
		assertThat(path).isNotNull();
		assertThat(path.toString()).isEqualTo("/var/vcap/data/78525ee7-196c-4ed4-8ac6-857d15334631");
	}

}
