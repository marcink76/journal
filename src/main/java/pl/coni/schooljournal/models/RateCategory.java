package pl.coni.schooljournal.models;

public enum RateCategory {
    QUIZ("Kartkówka"),
    TEST("Sprawdzian"),
    ANSWER("Odpowiedź"),
    HOME_WORK("Zadanie domowe");

    private String rateCategory;

    RateCategory(String rateCategory) {
        this.rateCategory = rateCategory;
    }

    public String getRateCategory() {
        return rateCategory;
    }
}
