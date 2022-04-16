package net.iceix.clientAPI.repository;

import org.springframework.data.repository.CrudRepository;
import net.iceix.clientAPI.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findByLeid(String leid);
}
