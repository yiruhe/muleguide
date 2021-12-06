package hello;

import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;


import com.fasterxml.jackson.databind.ObjectMapper;

public class helloWorldComponent implements Callable{
@Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
	
	MuleMessage message = eventContext.getMessage();
	
	 String data = String.valueOf(message.getPayload());
	 
	 ObjectMapper objectMapper = new ObjectMapper();
	 Map<String,Object> readValue = objectMapper.readValue(data,Map.class);
	 
	 Object res = readValue.get("data");
	 String url = String.valueOf( readValue.get(CustomResult.urlName));
	
     eventContext.getMessage().setInvocationProperty(CustomResult.urlName, url);
    
     
        return res;
    }
}