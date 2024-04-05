package AlexSpring.day5.services.dao;

import AlexSpring.day5.ItemNotFoundException;
import AlexSpring.day5.entities.Drink;
import AlexSpring.day5.services.IDrink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DrinkService {
    @Autowired
    private IDrink drinkdao;


    public Drink findByName(String name){
        return drinkdao.findByName(name).orElseThrow(()->new ItemNotFoundException(name));
        
    }
}
