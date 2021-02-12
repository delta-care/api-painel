package xyz.deltacare.painel.repository;

import org.springframework.stereotype.Repository;
import xyz.deltacare.painel.domain.Painel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

@Repository
public interface PainelRepository extends MongoRepository<Painel,String> {
    //public Optional<Painel> findByCodigo(String codigo);
}
