package com.soa.canete.teen_soa_canete.repository;

import com.soa.canete.teen_soa_canete.domain.model.Teen;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TeenRepository extends ReactiveCrudRepository<Teen, Integer> {

    @Query("SELECT * FROM teen WHERE idtutor = :id")
    Flux<Teen> findByidtutor(Integer id);
}
