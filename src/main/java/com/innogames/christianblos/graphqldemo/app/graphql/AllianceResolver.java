package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Alliance;
import com.innogames.christianblos.graphqldemo.domain.model.Player;
import com.innogames.christianblos.graphqldemo.domain.repository.PlayerRepository;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllianceResolver implements GraphQLResolver<Alliance> {

	private final PlayerRepository playerRepository;

	public AllianceResolver(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public List<Player> players(Alliance alliance) {
		return playerRepository.findPlayersByAllianceId(alliance.getId());
	}

}
