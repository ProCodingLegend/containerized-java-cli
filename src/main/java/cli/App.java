package cli;

/**
 * Entry point for the name CLI.
 */
public final class App {

    private App() {
    }

    public static void main(String[] args) {
        NameGreeter greeter = new NameGreeter("ProCodingLegend");
        System.out.println(greeter.greeting());
    }
}
