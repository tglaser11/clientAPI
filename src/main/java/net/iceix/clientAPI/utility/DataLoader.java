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

        repository.save(new Client( "1234","Aldous","Huxley"));
        repository.save(new Client( "1000","Virginia","Woolf"));
        repository.save(new Client( "1001","Charles","Dickens"));
        repository.save(new Client( "1002","Harper","Lee"));
        repository.save(new Client( "1003","Leo","Tolstoy"));
        repository.save(new Client( "1004","Jane","Austien"));
        repository.save(new Client( "1005","JK","Rowling"));
        repository.save(new Client( "1006","Kurt","Vonnegut"));
    }
}
