package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Alliance;
import com.innogames.christianblos.graphqldemo.domain.repository.AllianceRepository;

import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

	private final AllianceRepository allianceRepository;

	public MutationResolver(AllianceRepository allianceRepository) {
		this.allianceRepository = allianceRepository;
	}

	public Alliance renameAlliance(int allianceId, String newName) {
		return allianceRepository.renameAlliance(allianceId, newName);
	}

}
