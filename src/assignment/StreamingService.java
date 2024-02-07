package assignment;

public class StreamingService implements MusicPlayer {

	private String currentSong;
	private String playbackStatus;

	public StreamingService() {
		currentSong = "";
		playbackStatus = "stopped";
	}

	@Override
	public void play(String song) {
		currentSong = song;
		playbackStatus = "streaming";
		System.out.println("streaming....." + currentSong);

	}

	@Override
	public void pause() {
		if (playbackStatus.equals("streaming")) {
			playbackStatus = "paused";
			System.out.println("StreamingService is paused.");
		} else {
			System.out.println("StreamingService is not streaming.");
		}

	}

	@Override
	public void stop() {
		if (!playbackStatus.equals("stopped")) {
			playbackStatus = "stopped";
			System.out.println("StreamingService has stopped.");
			currentSong = "";
		} else {
			System.out.println("StreamingService is already stopped.");
		}

	}

}
