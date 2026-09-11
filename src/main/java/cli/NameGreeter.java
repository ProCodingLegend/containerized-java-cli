package cli;

/**
 * Builds a greeting that displays the student's name.
 */
public class NameGreeter {

    private final String name;

    public NameGreeter(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public String greeting() {
        return "Hello, my name is " + name + ".";
    }
}
