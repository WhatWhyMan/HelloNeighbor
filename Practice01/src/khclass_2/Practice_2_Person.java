package khclass_2;

import java.io.Serializable;

public class Practice_2_Person implements Serializable{

	private static final long serialVersionUID = -4189644750037595855L;

	protected String contents;
	
	public Practice_2_Person() {
	}

	public Practice_2_Person(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Practice_Person [contents=" + contents + "]";
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
