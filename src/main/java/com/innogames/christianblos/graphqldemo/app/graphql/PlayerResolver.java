package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Alliance;
import com.innogames.christianblos.graphqldemo.domain.model.Player;
import com.innogames.christianblos.graphqldemo.domain.repository.AllianceRepository;

import org.springframework.stereotype.Component;

@Component
public class PlayerResolver implements GraphQLResolver<Player> {

	private final AllianceRepository allianceRepository;

	public PlayerResolver(AllianceRepository allianceRepository) {
		this.allianceRepository = allianceRepository;
	}

	public Alliance alliance(Player player) {
		if (player.getAllianceId() == null) {
			return null;
		}
		return allianceRepository.findById(player.getAllianceId());
	}

}
