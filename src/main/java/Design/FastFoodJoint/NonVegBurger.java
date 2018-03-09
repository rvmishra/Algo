package Design.FastFoodJoint;

public class NonVegBurger extends AbstractBurger {

  private static final int SURCHARGE = 10;

  public NonVegBurger(String name, String price, Type type) {
    super(name, String.valueOf(SURCHARGE + Integer.parseInt(price)), type);
  }
}
