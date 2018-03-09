package Design.FastFoodJoint;

import com.google.gson.Gson;

public abstract class AbstractBurger implements Item {
  private String name;
  private String price;
  private Type type;

  public AbstractBurger(String name, String price, Type type) {
    this.name = name;
    this.price = price;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}

