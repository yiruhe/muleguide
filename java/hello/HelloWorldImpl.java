package hello;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.mortbay.util.ajax.JSON;
import org.mule.RequestContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.processor.MessageProcessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebService(
	endpointInterface = "org.example.HelloWorld",
serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	

	
    public String sayHi(@WebParam(name="cityName") String cityName) {
    	
    	
    
    	Map<String,Object> data = new HashMap<>();
    	
    	
    	data.put("name",cityName);
    	
    	
    	
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    
    		String writeValueAsString;
			try {
				CustomResult customResult = new CustomResult();
				customResult.setData(data);
				customResult.setRedirectUrl("/hello");
				writeValueAsString = objectMapper.writeValueAsString(customResult);
				
				return writeValueAsString;
			} catch (JsonProcessingException e) {
				
				e.printStackTrace();
			}
    		
    		return "";
    }

	

	

	
}
