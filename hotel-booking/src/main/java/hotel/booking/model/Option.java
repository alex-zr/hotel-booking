package hotel.booking.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Option {
    @Id
    @GeneratedValue
    Long id;
    String name;
    Double price;

}
