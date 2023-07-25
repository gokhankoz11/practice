package day27abstraction;

public class Accor implements Ac,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }
}
