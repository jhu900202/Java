package study_190308_mk3;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class ExampleSend {
	public static void main(String[] args) {
		String api_key = "<REDACTED_API_KEY>";
		String api_secret = "<REDACTED_API_SECRET>";
		Message coolsms = new Message(api_key, api_secret);

		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "<REDACTED_PHONE>");
		params.put("from", "<REDACTED_PHONE>");
		params.put("type", "SMS");
		params.put("text", "Coolsms Testing Message!");
		params.put("app_version", "test app 1.2");
				
		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		}catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}
}