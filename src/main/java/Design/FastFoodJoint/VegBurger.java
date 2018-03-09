package Design.FastFoodJoint;

public class VegBurger extends AbstractBurger {
  private static final int SURCHARGE = -10;

  public VegBurger(String name, String price, Type type) {
    super(name, String.valueOf(SURCHARGE + Integer.parseInt(price)), type);
  }
}
