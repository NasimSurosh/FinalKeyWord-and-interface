package assignment;

public class Main {

	public static void main(String[] args) {

		MusicPlayer player = new MediaPlayer();

		player.play("Bila chau");
		player.pause();
		player.play(null);
		player.stop();
		System.out.println();

		MusicPlayer streams = new StreamingService();
		streams.play("Creazy frog");
		streams.pause();
		streams.play(null);
		streams.stop();
	}

}
