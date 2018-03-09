package Design.FastFoodJoint;

public class BurgerFactory {

  public static AbstractBurger create(String name, String price, Type type) {
    if (type.equals(Type.VEG))
      return new VegBurger(name, price, type);
    else if (type.equals(Type.NONVEG))
      return new NonVegBurger(name, price, type);
    return null;
  }
}
