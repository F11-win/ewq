
public class Song {
	String title;
	public Song(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public static void main(String[] args) {
		Song mySong = new Song("Nessum Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle() );
	}

}