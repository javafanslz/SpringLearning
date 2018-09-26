package com.http;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author kangqz
 * 2016-01-25
 */
public class HttpPushDataUtils {
	private static Logger logger = Logger.getLogger(HttpPushDataUtils.class);
	private static PoolingHttpClientConnectionManager cm;
	private static RequestConfig requestConfig;
	private static String EMPTY_STR = "";
	private static String UTF_8 = "UTF-8";
	private static int HTTP_MAX_TIMEOUT = 5000;

	private static void init(){
		if(cm == null){
			cm = new PoolingHttpClientConnectionManager();
			cm.setMaxTotal(50);//整个连接池最大连接数
			cm.setDefaultMaxPerRoute(5);//每路由最大连接数，默认值是2
		}
		RequestConfig.Builder configBuilder = RequestConfig.custom();
		// 设置连接超时
		configBuilder.setConnectTimeout(HTTP_MAX_TIMEOUT);
		// 设置读取超时
		configBuilder.setSocketTimeout(HTTP_MAX_TIMEOUT);
		// 设置从连接池获取连接实例的超时
		configBuilder.setConnectionRequestTimeout(HTTP_MAX_TIMEOUT);

		requestConfig = configBuilder.build();
	}

	/**
	 * 通过连接池获取HttpClient
	 * @return
	 */
	private static CloseableHttpClient getHttpClient(){
		init();
		return HttpClients.custom().setConnectionManager(cm).build();
	}

	/**
	 *
	 * @param url
	 * @return
	 */
	public static String httpGetRequest(String url){
		HttpGet httpGet = new HttpGet(url);
		return getResult(httpGet);
	}

	public static String httpGetRequest(String url, Map<String, Object> params) throws URISyntaxException {
		URIBuilder ub = new URIBuilder();
		ub.setPath(url);

		ArrayList<NameValuePair> pairs = covertParams2NVPS(params);
		ub.setParameters(pairs);

		HttpGet httpGet = new HttpGet(ub.build());
		httpGet.setConfig(requestConfig);
		return getResult(httpGet);
	}

	public static String httpGetRequest(String url, Map<String, Object> headers,
                                        Map<String, Object> params) throws URISyntaxException {
		URIBuilder ub = new URIBuilder();
		ub.setPath(url);

		ArrayList<NameValuePair> pairs = covertParams2NVPS(params);
		ub.setParameters(pairs);

		HttpGet httpGet = new HttpGet(ub.build());
		for (Map.Entry<String, Object> param: headers.entrySet()) {
			httpGet.addHeader(param.getKey(), (String) param.getValue());
		}
		return getResult(httpGet);
	}

	public static String httpPostRequest(String url) throws Exception{
		try{
			HttpPost httpPost = new HttpPost(url);
			return getResult(httpPost);
		}catch (Exception e){
			logger.error("接口请求失败",e);
			throw new Exception("接口请求失败",e);
		}

	}

	public static String httpPostRequest(String url, Map<String, Object> params) throws UnsupportedEncodingException {
		HttpPost httpPost = new HttpPost(url);
		ArrayList<NameValuePair> pairs = covertParams2NVPS(params);
		httpPost.setEntity(new UrlEncodedFormEntity(pairs, UTF_8));
		return getResult(httpPost);
	}

	public static String httpPostRequest(String url, Map<String, Object> headers, JSONObject jsonObject ) throws UnsupportedEncodingException {
		HttpPost httpPost = new HttpPost(url);

		for (Map.Entry<String, Object> param: headers.entrySet()) {
			httpPost.addHeader(param.getKey(), (String) param.getValue());
		}
		StringEntity stringEntity = new StringEntity(jsonObject.toString(),"UTF-8");
		httpPost.setEntity(stringEntity);

		return getResult(httpPost);
	}

	public static String httpPostRequest(String url, Map<String, Object> headers,
                                         Map<String, Object> params) throws UnsupportedEncodingException {
		HttpPost httpPost = new HttpPost(url);

		for (Map.Entry<String, Object> param: headers.entrySet()) {
			httpPost.addHeader(param.getKey(), (String) param.getValue());
		}

		ArrayList<NameValuePair> pairs = covertParams2NVPS(params);
		httpPost.setEntity(new UrlEncodedFormEntity(pairs, UTF_8));

		return getResult(httpPost);
	}

	private static ArrayList<NameValuePair> covertParams2NVPS(Map<String, Object> params){
		ArrayList<NameValuePair> pairs = new ArrayList<NameValuePair>();
		for (Map.Entry<String, Object> param: params.entrySet()) {
			pairs.add(new BasicNameValuePair(param.getKey(), (String) param.getValue()));
		}

		return pairs;
	}


	/**
	 * 处理Http请求
	 * @param request
	 * @return
	 */
	private static String getResult(HttpRequestBase request){
		CloseableHttpClient httpClient = getHttpClient();
		try{
			logger.debug("httpClient execute start!");
			CloseableHttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			if(entity!=null){
				String result = EntityUtils.toString(entity);
				logger.debug("result is: "+result);
				response.close();
				logger.debug("response has closed !");
				return result;
			}
			logger.debug("response's entity is null!");
		}catch(ClientProtocolException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{

		}
		logger.debug("response's entity is null,return empty string!");
		return EMPTY_STR;
	}

}
