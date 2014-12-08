package Wallet

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.{RestController, RequestBody, ResponseBody, RequestMethod, PathVariable, ModelAttribute, RequestMapping, ResponseStatus}
import com.justinsb.etcd.EtcdClient
import com.justinsb.etcd.EtcdClientException
import com.justinsb.etcd.EtcdResult
import java.net.URI



@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
class WalletConfig {

	var counter_url:String = "http://localhost:4001/";
	var counter_key:String = "/009874904";
	var counter_value = 0;

	//Default URL Handler
	@RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
	@ResponseBody
    def getHello(): String = {
		return "CMPE 273 - Assignment 3"
    }

	
	@RequestMapping(value=Array("/api/v1/counter"), method=Array(RequestMethod.GET))
	@ResponseBody
    def getCounterValue(): String = {
    	
    	var client:EtcdClient = new EtcdClient(URI.create(counter_url));
		var result:EtcdResult = null;
		try {
				result = client.get(counter_key);
			}catch {
				case e: EtcdClientException => println("EtcdClientException occured:"+e);	
				case e: Exception => println("Error occured:"+e);	
			}
		
		if(result==null) {
			counter_value = 1;
			result = client.set(counter_key, counter_value.toString);			
		} else {
			counter_value = (1 + result.value.toInt);
			result = client.set(counter_key, counter_value.toString);			
		}

		result = client.get(counter_key);
		return result.value;
    }

} 
