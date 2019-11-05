package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Alliance;
import com.innogames.christianblos.graphqldemo.domain.model.Player;
import com.innogames.christianblos.graphqldemo.domain.repository.AllianceRepository;
import com.innogames.christianblos.graphqldemo.domain.repository.PlayerRepository;

import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

	private final AllianceRepository allianceRepository;

	private final PlayerRepository playerRepository;

	public MutationResolver(AllianceRepository allianceRepository, PlayerRepository playerRepository) {
		this.allianceRepository = allianceRepository;
		this.playerRepository = playerRepository;
	}

	public Alliance renameAlliance(int allianceId, String newName) {
		return allianceRepository.renameAlliance(allianceId, newName);
	}

	public Player switchAlliance(int playerId, Integer allianceId) {
		return playerRepository.switchAlliance(playerId, allianceId);
	}

}
