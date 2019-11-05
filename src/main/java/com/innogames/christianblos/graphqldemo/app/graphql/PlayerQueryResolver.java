package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Player;
import com.innogames.christianblos.graphqldemo.domain.repository.PlayerRepository;

import org.springframework.stereotype.Component;

@Component
public class PlayerQueryResolver implements GraphQLQueryResolver {

	private final PlayerRepository playerRepository;

	public PlayerQueryResolver(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public Player currentPlayer() {
		return playerRepository.findById(1);
	}

	public Player player(int playerId) {
		return playerRepository.findById(playerId);
	}

}
