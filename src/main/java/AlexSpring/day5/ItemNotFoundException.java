package AlexSpring.day5;

public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(String name) {
        super("Item con name "+ name+ " non trovato");
    }
}
