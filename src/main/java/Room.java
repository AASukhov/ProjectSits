public class Room{
    public int roomLength;
    public int roomWidth;
    public int sits;
    public byte [][] sitsLocation;

    public Room (int roomLength, int roomWigth){
        this.roomLength = roomLength;
        this.roomWidth = roomWigth;
    }

    public int getRoomLength(){
        return roomLength;
    }

    public void setRoomLength(int roomLength){
        this.roomLength = roomLength;
    }

    public int getRoomWidth(){
        return roomWidth;
    }

    public void setRoomWidth(int roomWidth){
        this.roomWidth = roomWidth;
    }

    public void setSitsLocation (byte [][] location) {
        sitsLocation = location;
    }

//    public int getSits (){
//        return sits;
//    }
//
//    public void setSits(int sits){
//        this.sits = sits;
//    }

    public byte[][] initializingRoom (int roomLength, int roomWidth) {
        byte[][] sitsLocation = new byte[roomLength][roomWidth];
        for (int i = 0; i < roomLength; i++) {
            for (int j = 0; j < roomWidth; j++) {
                sitsLocation[i][j] = 0;
//                System.out.print(sitsLocation[i][j]+" ");
            }
//             System.out.println();
        }
        sits = roomLength * roomWidth;
//        System.out.println("Sits = " + sits);
        return sitsLocation;
    }

}
