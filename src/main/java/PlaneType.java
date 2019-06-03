public enum PlaneType {

    HELICOPTER(5, 5000), // in kg //
    PRIVATEJET(15, 20000),
    BOEING787(415, 40000);

    public final int capacity;
    public final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

}

