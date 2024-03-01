public class FirstLab {
    public static void main(String[] args){
        Mp3 song1 = new Mp3(0, 0, "Uriah Heep", "Demons and Wizards", "The Wizard", 0);
        Mp3 song2 = new Mp3(0, 0, "Uriah Heep", "Demons and Wizards", "Traveller in Time", 0);
        Mp3 song3 = new Mp3(0, 0, "Jethro Tull", "Heavy Horses", "Heavy Horses", 0);
        Mp3 song4 = new Mp3(0, 0, "Rainbow", "Ritchie Blackmore's Rainbow", "The Temple of the King", 0);
        System.out.println(song1.WhoWhich(song1.artistName(), song1.albumName(), song1.songName()));
        System.out.println(song2.WhoWhich(song2.artistName(), song2.albumName(), song2.songName()));
        System.out.println(song3.WhoWhich(song3.artistName(), song3.albumName(), song3.songName()));
        System.out.println(song4.WhoWhich(song4.artistName(), song4.albumName(), song4.songName()));
        
        

    }
}