package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Player;
import com.innogames.christianblos.graphqldemo.domain.repository.PlayerRepository;

import org.springframework.stereotype.Component;

@Component
public class PlayerMutationResolver implements GraphQLMutationResolver {

	private final PlayerRepository playerRepository;

	public PlayerMutationResolver(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public Player switchAlliance(int playerId, Integer allianceId) {
		return playerRepository.switchAlliance(playerId, allianceId);
	}

}
