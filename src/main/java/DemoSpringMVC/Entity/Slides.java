package DemoSpringMVC.Entity;

public class Slides {
	private int Id;
	private String img;
	private String caption;
	private String content;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Slides() {
		super();
	}
}
