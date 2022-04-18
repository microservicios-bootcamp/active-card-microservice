package com.demo.app.actives.repositories;

import com.demo.app.actives.entities.CreditAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CreditAccountRepository extends ReactiveMongoRepository<CreditAccount,String> {
    Mono<CreditAccount> findByDni(String dni);
    Flux<CreditAccount> findAllByDni(String dni);
    Mono<CreditAccount> findByDniAndAccountNumber(String dni, String account);
}
