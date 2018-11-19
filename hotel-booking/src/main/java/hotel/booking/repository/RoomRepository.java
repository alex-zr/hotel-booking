package hotel.booking.repository;


import hotel.booking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
