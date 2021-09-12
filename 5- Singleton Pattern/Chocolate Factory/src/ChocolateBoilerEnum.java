public enum ChocolateBoilerEnum {
    UNIQUE_INSTANCE;

    private boolean empty = true;
    private boolean boiled = false;

    public void fill() {
        if (!isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
