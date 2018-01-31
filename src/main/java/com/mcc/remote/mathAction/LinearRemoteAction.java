package com.mcc.remote.mathAction;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.mcc.interfaces.math.Linear;
import com.mcc.vo.DataFrame;


@Service
public class LinearRemoteAction implements Linear {

	@Override
	public DataFrame matrixMultiply(double[][] x, double[] y) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8080/linear/multiply";
        //入参
        DataFrame df = new DataFrame();
		df.setData(y);
        df.setDatas(x);
        RestTemplate restTemplate = new RestTemplate();
        DataFrame responseBean = restTemplate.postForObject(url, df, DataFrame.class);
		return responseBean;
	}

}
