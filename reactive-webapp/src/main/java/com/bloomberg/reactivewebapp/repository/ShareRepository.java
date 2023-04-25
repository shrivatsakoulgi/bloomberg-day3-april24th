package com.bloomberg.reactivewebapp.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.bloomberg.reactivewebapp.entity.Share;

import reactor.core.publisher.Mono;

@Repository
public interface ShareRepository extends R2dbcRepository<Share, String> {

	Mono<Share> findByShareName(String shareName);

	Mono<Void> deleteByShareName(String shareName);

}
