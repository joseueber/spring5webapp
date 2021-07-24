package guru.springframework.spring5webapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String adressline1;
    String city;
    String state;
    String zip;

    public Publisher(String adressline1, String city, String state, String zip) {
        this.adressline1 = adressline1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
