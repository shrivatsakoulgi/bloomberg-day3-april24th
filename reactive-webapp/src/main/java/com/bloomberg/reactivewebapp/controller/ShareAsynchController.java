package com.bloomberg.reactivewebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloomberg.reactivewebapp.entity.Share;
import com.bloomberg.reactivewebapp.service.ShareService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/asynch/share")
public class ShareAsynchController {
	
	@Autowired
	private ShareService shareService;
	
	@GetMapping("")
	public Flux<Share> getAllShares(){
		return shareService.findAll();
	}
	
	@GetMapping("/{shareName}")
	public Mono<Share> findShareByName(@PathVariable String shareName){
		return shareService.findByShareName(shareName);
	}
	
	@PostMapping("")
	public Mono<Share> addShare(@RequestBody Share share){
		return shareService.save(share);
	}
	
	@DeleteMapping("/{shareName}")
	public Mono<Void> deleteShareByName(@PathVariable String shareName){
		return shareService.deleteByShareName(shareName);
	}

	@PutMapping("/{id}")
	public Mono<Share> updateShare(@PathVariable String id, @RequestBody Mono<Share> updatedShare){
		return shareService.update(id, updatedShare);
		
	}
	
}
