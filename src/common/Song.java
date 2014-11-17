package common;

import java.util.Objects;

public class Song {
    
    private String songTitle;
    private String artist;
    private String album;
    private String trackNumber;

    public Song(String songTitle, String artist, String album, String trackNumber) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.album = album;
        this.trackNumber = trackNumber;
    }
    
    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.trackNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.trackNumber, other.trackNumber)) {
            return false;
        }
        return true;
    }

     
    @Override
    public String toString() {
        return "Song{" + "songTitle=" + songTitle + ", artist=" + artist + ",  album=" + album + ", trackNumber=" + trackNumber + "'}'";
    }
            
}
