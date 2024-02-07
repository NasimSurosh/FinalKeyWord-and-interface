package assignment;

public class MediaPlayer implements MusicPlayer {

	private String currentSong;
	private String playbackStatus;

	public MediaPlayer() {
		currentSong = " ";
		playbackStatus = "stopped";
	}

	@Override
	public void play(String song) {
		currentSong = song;
		playbackStatus = "played";
		System.out.println("playing......" + currentSong);

	}

	@Override
	public void pause() {
		if (playbackStatus.equals("playing")) {
			playbackStatus = "paused";
			System.out.println("MediaPlayer is paused.");
		} else {
			System.out.println("MediaPlayer is not playing.");
		}

	}

	@Override
	public void stop() {
	    if (!playbackStatus.equals("stopped")) {
            playbackStatus = "stopped";
            System.out.println("MediaPlayer has stopped.");
            currentSong = "";
        } else {
            System.out.println("MediaPlayer is already stopped.");
        }

	}

}
