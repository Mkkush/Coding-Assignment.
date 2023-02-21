package com.mediaplayer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Song class to store song details.
 * Songs name and a set of String  which stores user name who currently have
 * this song in their playlist.
 */
public class Song {

    private String songName;

    private Set<String> userNames;

    public Song(String songName){
        this.songName = songName;
        userNames = new HashSet<>();
    }


    public Set<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(final Set<String> userNames) {
        this.userNames = userNames;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(final String songName) {
        this.songName = songName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Song song = (Song) o;
        return Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName);
    }

    @Override
    public String toString() {
        return songName;
    }
}
