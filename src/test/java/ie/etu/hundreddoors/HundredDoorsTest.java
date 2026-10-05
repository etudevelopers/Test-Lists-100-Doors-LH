package ie.etu.hundreddoors;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HundredDoorsTest {

    @Test
    void toggling_a_closed_door_opens_it() {
        Door door = new Door();

        door.toggle();

        assertThat(door.isOpen()).isTrue();
    }
}
