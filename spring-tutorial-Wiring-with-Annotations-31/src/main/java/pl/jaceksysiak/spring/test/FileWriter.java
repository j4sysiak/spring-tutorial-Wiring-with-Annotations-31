package pl.jaceksysiak.spring.test;

import org.springframework.stereotype.Component;

@Component("flag1")
public class FileWriter implements LogWriter{

	public void write(String text) {
		 
		System.out.println("Write to file: " + text);
	}

}
