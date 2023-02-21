package com.mediaplayer;

import java.util.HashMap;
import java.util.Map;

public class MediaPlayer {

    private Map<String, Playlist> userPlayList;
    private int initialCapacity;
    private SongFactory songFactory;

    public MediaPlayer(final int initialCapacity) {
        this.userPlayList = new HashMap<>();
        this.initialCapacity = initialCapacity;
        this.songFactory = new SongFactory();
    }


    private Playlist getPlaylist( String userName){
        if(!userPlayList.containsKey(userName)){
            userPlayList.put(userName, new Playlist(initialCapacity));
        }
        return userPlayList.get(userName);
    }


    /**
     * Add song to playlist of a usr.
     * @param songName
     * @param usrName
     * @return
     */
    public Song playSong(String songName, String usrName){
        Playlist playlist = getPlaylist(usrName);

        Song songToPlay = songFactory.getSong(songName);


        playlist.addSong(songToPlay,usrName);
        return songToPlay;
    }

    /**
     * Returns recent song played by a user.
     * @param usrName
     * @return
     */
    public String recentlyPlayedSong(String usrName){
        Playlist playlist = getPlaylist(usrName);
        return playlist.recentlyPlayedSong()==null ? "No song Played" : playlist.recentlyPlayedSong().getSongName();
    }

    /**
     * Get playlist of a usr
     * @param userName
     * @return
     */
    public String allSong(String userName){
        Playlist playlist = getPlaylist(userName);
        return playlist.getSongList().toString();
    }

    /**
     * Get all user who have this song in their playlist
     * @param songName
     * @return
     */
    public String usrPlayingSong(String songName){
        return songFactory.getSong(songName).getUserNames().toString();
    }


}
