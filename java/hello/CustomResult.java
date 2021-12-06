package hello;

public class CustomResult {

	public static final String urlName = "redirectUrl";
	private Object data;
	private String redirectUrl;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public CustomResult(Object data, String redirectUrl) {
		
		this.data = data;
		this.redirectUrl = redirectUrl;
	}
	
	public CustomResult() {}
	
	
	
}
