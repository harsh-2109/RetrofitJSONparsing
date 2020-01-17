package com.example.retrofitjsonparsing;

import com.example.retrofitjsonparsing.model.Comment;
import com.example.retrofitjsonparsing.model.Post;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPost(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
    Call<List<Post>> getPost(
            @QueryMap Map<String, String> parameters
    );

    @GET("comments?postId=2")
    Call<List<Comment>> getComments();

    @GET
    Call<List<Comment>> getComments(@Url String url);
}
