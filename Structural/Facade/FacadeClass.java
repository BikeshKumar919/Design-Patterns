public class FacadeClass {
    private PlayList playList;
    private SupportedFile supportedFile;
    private MediaPlayer mediaPlayer;

    public FacadeClass(){
        playList = new PlayList();
        supportedFile = new SupportedFile();
        mediaPlayer = new MediaPlayer();
    }

    public void playSongAndToPlayList(String songName, String playListName){
        playList.addToPlayList(songName, playListName);
        supportedFile.ConvertToMp3(songName);
        mediaPlayer.play(songName);
    }
}
