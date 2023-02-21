package com.mediaplayer;

import java.util.LinkedList;

/**
 * Playlist class for each user, we need to create a playlist.
 * It stores all the songs user has played in order.
 */
public class Playlist {


        private int initialCapacity ;

        private LinkedList<Song>  songList;

        public Playlist(int initialCapacity){
            this.initialCapacity= initialCapacity;
            songList = new LinkedList<>();
        }



        public Song addSong(Song newSong, final String usrName){
            if(songList.contains(newSong)){
                //If song already in playlist remove from it.
                songList.remove(newSong);

            }else if(size()==initialCapacity){
                // if size is full, remove one song from.
                Song songRemoved = songList.removeFirst();
                songRemoved.getUserNames().remove(usrName);
            }

            newSong.getUserNames().add(usrName);

            songList.addLast(newSong);

            return newSong;
        }

        public Song recentlyPlayedSong(){

            if(size()!=0){
                return songList.getLast();
            }
            return null;
        }

        private int size(){
            return songList.size();
        }

    public LinkedList<Song> getSongList() {
        return songList;
    }
}
