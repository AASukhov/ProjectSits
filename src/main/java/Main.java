public class Main {
    public static void main(String[] args) {
        try {
            Room room = new Room(10, 8);
            room.setSitsLocation(room.initializingRoom(room.getRoomLength(), room.getRoomWidth()));

        } catch (NullPointerException e) {
            System.out.println("Fuck u");
        }
    }

}
