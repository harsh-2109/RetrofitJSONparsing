package com.example.retrofitjsonparsing;

import com.example.retrofitjsonparsing.model.Comment;
import com.example.retrofitjsonparsing.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPost(@Query("userId") int userId);

    @GET("comments?postId=2")
    Call<List<Comment>> getComments();
}
