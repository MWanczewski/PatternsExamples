package creational.singleton;

public enum EnumSingleton {
    INSTANCE("jakas warotsc");
    private final String value;
    EnumSingleton(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
