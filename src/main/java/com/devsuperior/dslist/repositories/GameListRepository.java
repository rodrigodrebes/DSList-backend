package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.GameList;

// Camada de acesso e consulta aos dados
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
