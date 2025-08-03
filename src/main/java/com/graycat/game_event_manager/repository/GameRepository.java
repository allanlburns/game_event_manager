package com.graycat.game_event_manager.repository;

import com.graycat.game_event_manager.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
