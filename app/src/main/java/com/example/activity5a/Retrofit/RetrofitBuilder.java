package com.example.activity5a.Retrofit;

public class RetrofitBuilder {
    private static Retrofit retrofit;
    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://v6.exchangerate-api.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
            return retrofit;
    }
}
