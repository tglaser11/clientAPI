package net.iceix.clientAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    
    private String leid;
    private String firstName;
    private String lastName;

    public Client(String leid, String firstName, String lastName) {
        this.leid = leid;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
