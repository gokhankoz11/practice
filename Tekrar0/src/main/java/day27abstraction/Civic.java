package day27abstraction;

public class Civic implements Ac,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Civiv cools perfejtly");
    }
}
