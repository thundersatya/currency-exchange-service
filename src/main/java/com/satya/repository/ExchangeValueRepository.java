package com.satya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satya.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>  {
	ExchangeValue findByFromAndTo(String from, String to);
}
