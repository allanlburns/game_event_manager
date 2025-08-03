package com.graycat.game_event_manager.repository;

import com.graycat.game_event_manager.model.GameTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameTableRepository extends JpaRepository<GameTable, Long> {
}
