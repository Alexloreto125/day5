package AlexSpring.day5.services;

import AlexSpring.day5.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopping extends JpaRepository<Topping,Long> {
}
