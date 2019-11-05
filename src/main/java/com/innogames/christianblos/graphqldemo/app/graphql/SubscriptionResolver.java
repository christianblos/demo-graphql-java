package com.innogames.christianblos.graphqldemo.app.graphql;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import reactor.core.publisher.Flux;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class SubscriptionResolver implements GraphQLSubscriptionResolver {

	public Publisher<PingResponse> ping() {
		return Flux.interval(Duration.ofSeconds(1)).map(PingResponse::new);
	}

	@AllArgsConstructor
	@Getter
	public static class PingResponse {

		private long number;

	}

}
