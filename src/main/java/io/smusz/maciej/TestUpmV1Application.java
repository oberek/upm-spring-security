package io.smusz.maciej;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.smusz.maciej.gui.MainWindow;

@SpringBootApplication
public class TestUpmV1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestUpmV1Application.class, args);
		MainWindow.run();
	}
}
