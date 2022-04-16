package net.iceix.clientAPI.utility;

import lombok.AllArgsConstructor;
import net.iceix.clientAPI.repository.ClientRepository;
import net.iceix.clientAPI.model.Client;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@AllArgsConstructor
public class DataLoader {
    private final ClientRepository repository;

    @PostConstruct
    private void loadData() {
        repository.deleteAll();

        repository.save(new Client( "1234","Tom","Glaser"));
        repository.save(new Client( "1000","Kaitlin","Glaser"));
        repository.save(new Client( "1001","Jim","Jones"));
        repository.save(new Client( "1002","Mary","Smith"));
        repository.save(new Client( "1003","Harry","Hughes"));
        repository.save(new Client( "1004","Amanda","Sinclair"));
        repository.save(new Client( "1005","Gina","Smith"));
    }
}
