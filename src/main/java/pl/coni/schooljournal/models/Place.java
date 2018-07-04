package pl.coni.schooljournal.models;

public enum Place {
    STREET("ul."),
    AVENUE("Al."),
    PLACE("Pl."),
    SETTLEMENT("os.");

    private String place;

    Place(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
