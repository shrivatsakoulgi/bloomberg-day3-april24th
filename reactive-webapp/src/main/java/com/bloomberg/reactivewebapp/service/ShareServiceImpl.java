package com.bloomberg.reactivewebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bloomberg.reactivewebapp.entity.Share;
import com.bloomberg.reactivewebapp.repository.ShareRepository;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.UpperCamelCaseStrategy;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareRepository shareRepository;

	@Override
	public Mono<Share> findByShareName(String shareName) {
		return shareRepository.findByShareName(shareName);
	}

	@Override
	public Flux<Share> findAll() {

		return shareRepository.findAll();
	}

	@Transactional
	@Override
	public Mono<Share> save(Share share) {
		return shareRepository.save(share);
	}

	@Override
	public Mono<Void> deleteByShareName(String shareName) {
		return shareRepository.deleteByShareName(shareName);
	}

	@Override
	public Mono<Share> update(String id, Mono<Share> updatedShare) {
		
		return shareRepository.findById(id)
				.flatMap(p->updatedShare.map(s-> {
					System.out.println("share: "+s);
					p.setSharePrice(s.getSharePrice());
					p.setEquityDebtRatio(s.getEquityDebtRatio());
					p.setTotalInvestmentsInCrores(s.getTotalInvestmentsInCrores());
					p.setShareName(s.getShareName());
					p.setShareId(s.getShareId());
					return p;
				}
				))
				.flatMap(p->shareRepository.save(p));
		
	}

}
