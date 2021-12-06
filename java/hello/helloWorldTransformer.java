package hello;

import java.io.IOException;
import java.util.HashMap;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.yecht.Data.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class helloWorldTransformer extends AbstractMessageTransformer{
    /**
     * @param args
     */

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		String data = (String)message.getPayload();
		
		try {
			new ObjectMapper().readValue(data,HashMap.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new HashMap();
	}
}
