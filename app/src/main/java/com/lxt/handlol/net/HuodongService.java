package com.lxt.handlol.net;

import com.lxt.handlol.module.huodong.MainContent;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by ${reallyCommon} on 2016/10/11 0011.
 * e-mail:871281347@qq.com
 */

public interface HuodongService {
    @GET("static/pages/news/phone/{date}")
    Observable<MainContent> getHuodonginfo(@Path("date") String date);
}
