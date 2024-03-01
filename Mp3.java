import javax.sound.sampled.SourceDataLine;

public class Mp3 {
    private int kbps;
    private int songDura;
    private String artistName;
    private String albumName;
    private String songName;
    private int albumYear;

    public Mp3(int kbps, int songDura, String artistName, String albumName, String songName, int albumYear){
        this.kbps = kbps;
        this.songDura = songDura;
        this.artistName = artistName;
        this.albumName = albumName;
        this.songName = songName;
        this.albumYear = albumYear;
    }
    public int changeFile(int songDura){
        //128 kilobt = 16 kilobayt
        //3 min song = 16*60*3 = 2880 kilobayt = 2.888 MBs
        System.out.println("Please enter song duration (second type)");
        int duration = 16*60*((double)songDura/60);
        return 2;
    }

    public String WhoWhich(String artistName, String albumName, String songName){
        return "Artist name is " + artistName + "//Album Name is " + albumName + "//Song name is " + songName; 
    }

    public int getKbps(){
        return kbps;
    }
    public int getSongDura(){
        return songDura;
    }
    public String artistName(){
        return artistName;
    }
    public String albumName(){
        return albumName;
    }
    public String songName(){
        return songName;
    }
    public int albumYear(){
        return albumYear;
    }
    public void setKbps(int kbps){
        this.kbps = kbps;
    }
    public void setSongDura(int songDura){
        this.songDura = songDura;
    }
    public void setArtistName(String artistName){
        this.artistName = artistName;
    }
    public void setAlbumName(String albumName){
        this.albumName = albumName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }
    public void setAlbumYear(int albumYear){
        this.albumYear = albumYear;
    }
}