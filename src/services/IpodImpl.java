package services;

public class IpodImpl implements Ipod {
    private int songID;


    public IpodImpl(int songID) {
        this.songID = songID;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    @Override
    public void play() {
        System.out.println("Tocando música com ID: " + songID);
    }

    @Override
    public void stop() {
        System.out.println("Parando a reprodução.");
    }

    @Override
    public void search() {
        System.out.println("Buscando música...");
    }

    @Override
    public void selectSong() {
        System.out.println("Selecionando música.");
    }
}