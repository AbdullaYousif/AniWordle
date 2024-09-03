package com.example.demo;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.Character;
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Welcome to AniWordle!, Ahmed Johnson will be your host today, say Hi Ahmed!");
		Scanner scan = new Scanner(System.in);
		int misses = 0;
		int guesses = 6;
		boolean isCorrect;
		Character Naruto = new Character("Naruto","Naruto Uzumaki",true,"Blonde","Ninjutsu","Hidden Leaf Village");

		while(misses<guesses){
		System.out.println("Enter your guess (Character Name)");
		String guessedName = scan.nextLine();
		if (guessedName.equals(Naruto.getName())) {
			System.out.println("You Guessed Correctly! You Win!");
			break;
		}
		else{
			System.out.println("Guess Again");
			guesses--;
		}
		if(guesses == 0){
			System.out.println("You've run out of guesses. You lost :(");
		}
	}

}
}

