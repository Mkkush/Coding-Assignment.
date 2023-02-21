package com.mediaplayer;

import java.util.HashMap;
import java.util.Map;


/**
 * Creating factory class because songs can be reused.
 * Also we need to keep track of song-usr pair for that we need to create
 * only one object for a song.
 */
public class SongFactory {

    public Map<String, Song> songNameMap = new HashMap<>();

    public Song getSong(String songName){
         if(!songNameMap.containsKey(songName)){
             //If new song, add it to factory.
             songNameMap.put(songName, new Song(songName));
         }

        return songNameMap.get(songName);
    }
}
