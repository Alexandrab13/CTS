package MethodFactory;

public interface AnimalFactory<T extends Animal> {
    T creareAnimal();

}
