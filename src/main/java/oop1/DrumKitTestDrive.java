package oop1;

class DrumKitTestDrive{
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
    }
}