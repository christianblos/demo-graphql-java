package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.innogames.christianblos.graphqldemo.domain.model.Alliance;
import com.innogames.christianblos.graphqldemo.domain.repository.AllianceRepository;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllianceQueryResolver implements GraphQLQueryResolver {

	private final AllianceRepository allianceRepository;

	public AllianceQueryResolver(AllianceRepository allianceRepository) {
		this.allianceRepository = allianceRepository;
	}

	public List<Alliance> alliances() {
		return allianceRepository.findAll();
	}

}
