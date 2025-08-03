package com.graycat.game_event_manager;

import com.graycat.game_event_manager.model.Game;
import com.graycat.game_event_manager.model.GameTable;
import com.graycat.game_event_manager.repository.GameRepository;
import com.graycat.game_event_manager.repository.GameTableRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GameEventManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameEventManagerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(GameRepository gameRepo, GameTableRepository tableRepo) {
		return args -> {
			Game game = Game.builder()
					.name("Arkham Horror")
					.minPlayers(3)
					.maxPlayers(6)
					.build();
			gameRepo.save(game);

			GameTable table = GameTable.builder()
					.capacity(8)
					.currentPlayerCount(0)
					.game(game)
					.build();
			tableRepo.save(table);

			System.out.println("Game and table saved to the database.");
		};
	}
}
