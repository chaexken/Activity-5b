package com.example.activity5a.Retrofit;

import org.json.JSONObject;

public interface RetrofitInterface {
    @GET("v6/86f98363b00284f9ed46d43b/latest/{currency}")
    Call<JSONObject> getExchangeCurrency(@Path("currency") String currency);
}
