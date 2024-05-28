package genericpkg;

public class Blog {
	// getter,setter함수생성
	 private String title;
	    private String location;
	    private int likes;
	    private int comments;
	    // 배열에 넣을 변수 생성
	    public Blog(String title, String location, int likes, int comments) {
	        this.title = title;
	        this.location = location;
	        this.likes = likes;
	        this.comments = comments;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public int getLikes() {
	        return likes;
	    }

	    public int getComments() {
	        return comments;
	    }
}