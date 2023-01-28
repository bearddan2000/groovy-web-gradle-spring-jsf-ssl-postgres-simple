package example.view;

import java.io.Serializable;
import java.util.*;

import example.model.Dog;
import example.repository.DogRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="DogsView")
@SessionScoped
public class DogsView implements Serializable {

  private static final long serialVersionUID = 1L;

  public static List<Dog> getDogs() {
    List<Dog> list = new ArrayList<Dog>()

    list << new Dog(1, "Am Bulldog", "White");
    list << new Dog(2, "Blue Tick", "Grey");
    list << new Dog(3, "Labrador", "Black");
    list << new Dog(4, "Gr Shepard", "Brown");

    return list;
  }
}
