package com.mediaplayer;

public class MediaPlayerMain {

    public static void main(String[] args) {

        MediaPlayer player = new MediaPlayer(3);

        player.playSong("song1","munna");

        System.out.println(player.recentlyPlayedSong("munna"));
        System.out.println( player.allSong("munna"));


        player.playSong("song2","munna");
        System.out.println(player.recentlyPlayedSong("munna"));
        System.out.println( player.allSong("munna"));


        player.playSong("song3","munna");
        System.out.println(player.recentlyPlayedSong("munna"));
        System.out.println( player.allSong("munna"));


        player.playSong("song4","munna");
        System.out.println(player.recentlyPlayedSong("munna"));
        System.out.println( player.allSong("munna"));


        player.playSong("song3","munna");
        player.playSong("song2","chandan");
        player.playSong("song3","chandan");

        System.out.println(player.recentlyPlayedSong("munna"));
        System.out.println( player.allSong("munna"));

        System.out.println(player.usrPlayingSong("song1"));

        System.out.println(player.usrPlayingSong("song3"));

    }
}
