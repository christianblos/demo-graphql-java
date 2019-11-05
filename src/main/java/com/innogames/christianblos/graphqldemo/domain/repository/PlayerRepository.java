package com.innogames.christianblos.graphqldemo.domain.repository;

import com.innogames.christianblos.graphqldemo.domain.model.Player;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PlayerRepository {

	private List<Player> players;

	public PlayerRepository() {
		players = List.of(
			new Player(1, "PlayerOne", 11),
			new Player(2, "PlayerTwo", 22),
			new Player(3, "PlayerThree", null)
		);
	}

	public Player findById(int id) {
		return players.stream()
			.filter(player -> player.getId() == id)
			.findFirst()
			.orElse(null);
	}

	public List<Player> findPlayersByAllianceId(int allianceId) {
		return players.stream()
			.filter(player -> player.isInAlliance(allianceId))
			.collect(Collectors.toList());
	}

}
