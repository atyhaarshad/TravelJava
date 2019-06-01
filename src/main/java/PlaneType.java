public enum PlaneType {

    HELICOPTER(5, 5000), // in kg //
    PRIVATEJET(15, 20000),
    BOEING787(50, 40000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }


}

