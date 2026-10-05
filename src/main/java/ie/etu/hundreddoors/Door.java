package ie.etu.hundreddoors;

class Door {

    private boolean open;

    void toggle() {
        open = !open;
    }

    boolean isOpen() {
        return open;
    }
}
