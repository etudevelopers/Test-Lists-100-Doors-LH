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

    @Test
    void toggling_an_open_door_closes_it() {
        Door door = new Door();
        door.toggle();

        door.toggle();

        assertThat(door.isOpen()).isFalse();
    }

    @Test
    void all_100_doors_start_closed() {
        Doors doors = new Doors(100);

        assertThat(doors.states()).isEqualTo("c".repeat(100));
    }

    @Test
    void first_pass_opens_every_door() {
        Doors doors = new Doors(4);

        doors.pass(1);

        assertThat(doors.states()).isEqualTo("oooo");
    }

    @Test
    void second_pass_toggles_every_second_door() {
        Doors doors = new Doors(4);
        doors.pass(1);

        doors.pass(2);

        assertThat(doors.states()).isEqualTo("ococ");
    }
}
