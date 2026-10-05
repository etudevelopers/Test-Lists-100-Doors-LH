package ie.etu.hundreddoors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Doors {

    private final List<Door> doors;

    Doors(int count) {
        doors = Stream.generate(Door::new).limit(count).toList();
    }

    String states() {
        return doors.stream()
                .map(door -> door.isOpen() ? "o" : "c")
                .collect(Collectors.joining());
    }
}
