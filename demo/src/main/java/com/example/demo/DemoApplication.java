package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	@Autowired
	private PlayerRepository playerRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void AddPlayer()
	{
		System.out.println(" ***  ADD NEW PLAYER *** ");
		System.out.println("Namn:");
		String namn = System.console().readLine(); 			
		System.out.println("Age:");
		int age = Integer.parseInt(System.console().readLine()); 			
		System.out.println("Jerseynumber:");
		int jersey = Integer.parseInt(System.console().readLine()); 	
		System.out.println("Stad:");
		String city = System.console().readLine(); 	
		
		Player p = new Player();
		p.SetAge(age);
		p.SetNamn(namn);
		p.SetJersey(jersey);
		p.SetBorn(city);	

		playerRepository.save(p);
	}

	@Override
	public void run(String... args) throws Exception {
		while(true)
		{
			System.out.println(" ***  MENY *** ");
			System.out.println("1. Add new player");
			System.out.println("100. Exit");
			System.out.println("Ange val>");
			int sel = Integer.parseInt(System.console().readLine());
			if(sel == 100) break;
			if(sel == 1)
				AddPlayer();
		}

	}

}
