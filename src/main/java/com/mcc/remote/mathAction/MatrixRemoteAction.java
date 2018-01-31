package com.mcc.remote.mathAction;

import org.springframework.web.client.RestTemplate;

import com.mcc.interfaces.math.Matrix;
import com.mcc.vo.DataFrame;

public class MatrixRemoteAction implements Matrix {

	@Override
	public DataFrame inverse(double[][] datas) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8080/matrix/inverse";
        //入参
	        DataFrame df = new DataFrame();

	        df.setDatas(datas);
	        RestTemplate restTemplate = new RestTemplate();
	        DataFrame responseBean = restTemplate.postForObject(url, df, DataFrame.class);
			return responseBean;
	}

	@Override
	public DataFrame transpose(double[][] datas) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8080/matrix/transpose";
        //入参
	        DataFrame df = new DataFrame();

	        df.setDatas(datas);
	        RestTemplate restTemplate = new RestTemplate();
	        DataFrame responseBean = restTemplate.postForObject(url, df, DataFrame.class);
		return responseBean;
	}

	@Override
	public DataFrame multiply(double[][] data1, double[][] data2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
