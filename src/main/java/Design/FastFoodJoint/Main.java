package Design.FastFoodJoint;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    AbstractBurger burger = new BurgerBuilder().name("veggie").type(Type.NONVEG).price("45").createVegBurger();
    System.out.println(burger);
    burger = new BurgerBuilder().name("chicken").type(Type.VEG).price("45").createVegBurger();
    System.out.println(burger);

    ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.add(1);
    l1.add(2);
    ArrayList<Integer> l2 = (ArrayList<Integer>) l1.clone();
    l2.add(3);
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l1);
  }
}
