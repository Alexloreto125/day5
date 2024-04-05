package AlexSpring.day5.services;

import AlexSpring.day5.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPizza extends JpaRepository<Pizza, Long> {
}
