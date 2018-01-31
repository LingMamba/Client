package com.mcc.remote.mathAction;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.mcc.interfaces.RemoteData.TemperatureData;
import com.mcc.vo.BaseVo;
import com.mcc.vo.Nyh;
import com.mcc.vo.ZzY2;

public class TemperatureDataImpl implements  TemperatureData {

	@Override
	public List<ZzY2> getByCityAndPeriod(String cityn, String period) {
		String url = "http://localhost:8082/ZzY2";
	    //入参
	    RestTemplate restTemplate = new RestTemplate();
	    BaseVo vo = new BaseVo();
	    vo.setCityn(cityn);
	    vo.setPeriod(period);
	    ZzY2[] haha =  restTemplate.postForObject(url, vo, ZzY2[].class);
	    
	    List<ZzY2> result = Arrays.asList(haha);
		return result;
	}

}
