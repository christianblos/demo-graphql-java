package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Alliance;
import com.innogames.christianblos.graphqldemo.domain.model.Player;
import com.innogames.christianblos.graphqldemo.domain.repository.AllianceRepository;
import com.innogames.christianblos.graphqldemo.domain.repository.PlayerRepository;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

	private final PlayerRepository playerRepository;

	private final AllianceRepository allianceRepository;

	public QueryResolver(PlayerRepository playerRepository, AllianceRepository allianceRepository) {
		this.playerRepository = playerRepository;
		this.allianceRepository = allianceRepository;
	}

	public Player currentPlayer() {
		return playerRepository.findById(1);
	}

	public Player player(int playerId) {
		return playerRepository.findById(playerId);
	}

	public List<Alliance> alliances() {
		return allianceRepository.findAll();
	}

}
