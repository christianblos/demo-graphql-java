package com.innogames.christianblos.graphqldemo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Player {

	private final int id;

	private String nickname;

}
