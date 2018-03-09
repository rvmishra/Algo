package Design.FastFoodJoint;

import static com.google.common.base.Preconditions.checkNotNull;

public class BurgerBuilder {
  private String name;
  private String price;
  private Type type;

  public BurgerBuilder name(String name) {
    this.name = name;
    return this;
  }

  public BurgerBuilder price(String price) {
    this.price = price;
    return this;
  }

  public BurgerBuilder type(Type type) {
    this.type = type;
    return this;
  }

  public AbstractBurger createVegBurger() {
    checkNotNull(name);
    checkNotNull(price);
    return BurgerFactory.create(name, price, type);
  }
}
