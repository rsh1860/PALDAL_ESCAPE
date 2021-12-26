package Team5;
import java.io.Serializable;

public class User implements Serializable,Person
{
	private String UserID;
	private String UserPW;
	
	private int stage = 0;
	
	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}
	

	public User(String UserID_input, String UserPW_input)
	{
		this.UserID = UserID_input;
		this.UserPW = UserPW_input;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getUserPW() {
		return UserPW;
	}

	public void setUserPW(String userPW) {
		UserPW = userPW;
	}

@Override
	public String give (String fileName) {
		return null;
	}

}
