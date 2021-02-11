package xyz.deltacare.painel.repository;

import xyz.deltacare.painel.domain.Painel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PainelRepository extends MongoRepository<Painel,String> {
    //public Optional<Painel> findByCodigo(String codigo);
}
