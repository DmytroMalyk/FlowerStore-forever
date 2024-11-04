package ua.edu.ucu.apps.demo.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    Red("Red"), Blue("Blue"),
    Yellow("Yellow"), White("White"),
    Pink("Pink"), Purple("Purple");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
