package weather.linksu.com.nethttplibrary.httpclient;

import okhttp3.Call;
import okhttp3.Request;
import weather.linksu.com.nethttplibrary.request.GetRequest;

/**
 * ================================================
 * 作    者：linksus
 * 版    本：1.0
 * 创建日期：9/11 0011
 * 描    述：网络请求客户端,可自己定制（需要继承此类）
 * 修订历史：
 * ================================================
 */
public interface HttpClient {

    /** get请求 */
     <T> GetRequest<T> get(String url);

    /** post 请求 */
    void post(String url);

    Object getClient();


    Call startRequest(Request request);

    /** 根据tag 取消请求 */
    void cancelTag(Object tag);

    /** 取消所有请求 */
    void cancelAll();
}