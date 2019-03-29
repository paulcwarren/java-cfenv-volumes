package com.example.javacfenvvolumes;

import java.nio.file.Path;

import io.pivotal.cfenv.core.CfEnv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class JavaCfenvVolumesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCfenvVolumesApplication.class, args);
	}

	@Configuration
	public static class VolumesConfig {

		@Value("#{ cfEnv.findVolumesByName('nfs1').get(0).getPath() }")
		private Path path;

		@Bean
		public CfEnv cfEnv() {
			return new CfEnv();
		}

		@Bean
		public Path mount() {
			return path;
		}
	}
}
