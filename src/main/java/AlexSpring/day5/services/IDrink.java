package AlexSpring.day5.services;

import AlexSpring.day5.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IDrink extends JpaRepository<Drink,Long> {

    Optional<Drink> findByName(String name);

}
