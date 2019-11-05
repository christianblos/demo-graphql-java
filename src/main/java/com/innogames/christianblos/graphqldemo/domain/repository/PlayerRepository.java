package com.innogames.christianblos.graphqldemo.domain.repository;

import com.innogames.christianblos.graphqldemo.domain.model.Player;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerRepository {

	private List<Player> players;

	public PlayerRepository() {
		players = List.of(
			new Player(1, "PlayerOne"),
			new Player(2, "PlayerTwo"),
			new Player(3, "PlayerThree")
		);
	}

	public Player findById(int id) {
		return players.stream()
			.filter(player -> player.getId() == id)
			.findFirst()
			.orElse(null);
	}

}