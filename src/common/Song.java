package common;

import java.util.Objects;

public class Song {
    
    private String songTitle;
    private String artist;
    private String album;
    private int trackNumber;

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

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.trackNumber;
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
        if (this.trackNumber != other.trackNumber) {
            return false;
        }
        return true;
    }
  
    @Override
    public String toString() {
        return "Song{" + "songTitle=" + songTitle + ", artist=" + artist + ",  album=" + album + ", trackNumber=" + trackNumber + "'}'";
    }
            
}
