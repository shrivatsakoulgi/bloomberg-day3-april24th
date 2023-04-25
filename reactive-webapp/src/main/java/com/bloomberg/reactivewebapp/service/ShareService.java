package com.bloomberg.reactivewebapp.service;

import com.bloomberg.reactivewebapp.entity.Share;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ShareService {

	Mono<Share> findByShareName(String shareName);
	Flux<Share> findAll();
	Mono<Share> save(Share share);
	Mono<Void> deleteByShareName(String shareName);
	Mono<Share> update(String id,Mono<Share> updatedShare);
}
