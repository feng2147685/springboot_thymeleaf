package com.yutu.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;


public class HttpClientUtil {
	/**
	 * httpPost请求工具类
	 * @param orderNoUrl
	 * @return
	 */
	public static String clientPost(String orderNoUrl){
        //TODO
		//构造HttpClient的实例,类似于打开浏览器
		HttpClient client = new DefaultHttpClient();
		// 创建post方法的实例.
		HttpPost httpPost = new HttpPost(orderNoUrl.trim());
		//创建GET方法的实例，
//		HttpGet httpGet = new HttpGet(orderNoUrl.trim());
		HttpResponse res = null;
		try {
			res = client.execute(httpPost);
			HttpEntity entity = res.getEntity();
			String string = EntityUtils.toString(entity);
			return string;
		}catch(Exception e){
			  e.printStackTrace();
		}
		return null;
}
	/**
	 * httpclentGet请求数据工具
	 * @param orderNoUrl
	 * @return
	 */
	 public static String clientGet(HttpGet request) throws Exception{
	        String result="";
            // 获取当前客户端对象
            HttpClient httpClient = new DefaultHttpClient();
            // 通过请求对象获取响应对象
            HttpResponse response = httpClient.execute(request);
            // 判断网络连接状态码是否正常(0--200都数正常)
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                result= EntityUtils.toString(response.getEntity(),"utf-8");
            }
	        return result;
	    }
	 
}
