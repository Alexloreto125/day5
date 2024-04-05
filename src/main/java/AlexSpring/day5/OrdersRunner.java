package AlexSpring.day5;

import AlexSpring.day5.entities.*;
import AlexSpring.day5.services.IDrink;
import AlexSpring.day5.services.IPizza;
import AlexSpring.day5.services.ITopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class OrdersRunner implements CommandLineRunner {
	@Autowired
	private IPizza pizzaRepository;

	@Autowired
	private IDrink drinkRepository;

	@Autowired
	private ITopping toppingRepository;

	@Autowired
	private AnnotationConfigApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {

		try {
			Menu m = (Menu) ctx.getBean("menu");
			m.printMenu();

			Table t1 = (Table) ctx.getBean("Tavolo1");

			Order o1 = new Order(4, t1);

			o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
			o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
			o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
			o1.addItem(ctx.getBean("lemonade", Drink.class));
			o1.addItem(ctx.getBean("lemonade", Drink.class));
			o1.addItem(ctx.getBean("wine", Drink.class));

			System.out.println("DETTAGLI TAVOLO 1:");
			o1.print();

			System.out.println("CONTO TAVOLO 1");
			System.out.println(o1.getTotal());
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			ctx.close();
		}
	}
}
