package hotel.booking.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue
    private Long id;

}
