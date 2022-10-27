package ObjectsAreCopiedByReference;

public class Cat {

    private String colour;

    public Cat(String colour1){
        colour = colour1;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour1){
        colour = colour1;
    }

    public Cat create(){
        Cat c = new Cat("Brown");
        System.out.println("\nInside Cat.create(), address of created cat object c is: ");
        return c;
    }
}
