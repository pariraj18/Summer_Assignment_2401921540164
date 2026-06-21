
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
        @Override

    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
        @Override

    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
        @Override

    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
        @Override

    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] arr = new Compartment[10];

        for (int i = 0; i < arr.length; i++) {
            int random = (int)(Math.random() * 4) + 1;

            switch (random) {

                case 1:
                    arr[i] = new FirstClass();
                    break;
                case 2:
                    arr[i] = new Ladies();
                    break;
                case 3:
                    arr[i] = new General();
                    break;
                case 4:
                    arr[i] = new Luggage();
                    break;
            }
        }

        for (Compartment c : arr) {
            System.out.println(c.notice());
        }
    }
}
