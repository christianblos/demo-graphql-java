package com.innogames.christianblos.graphqldemo.domain.repository;

import com.innogames.christianblos.graphqldemo.domain.model.Alliance;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AllianceRepository {

	private List<Alliance> alliances;

	public AllianceRepository() {
		alliances = List.of(
			new Alliance(11, "First Alliance"),
			new Alliance(22, "Second Alliance")
		);
	}

	public Alliance findById(int id) {
		return alliances.stream()
			.filter(alliance -> alliance.getId() == id)
			.findFirst()
			.orElse(null);
	}

}
