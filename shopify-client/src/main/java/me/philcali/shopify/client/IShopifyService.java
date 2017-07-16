package me.philcali.shopify.client;

import java.util.Map;

import me.philcali.shopify.data.AuthToken;
import me.philcali.shopify.data.comment.CommentContainer;
import me.philcali.shopify.data.comment.Comments;
import me.philcali.shopify.data.shop.Shop;
import me.philcali.shopify.data.webhook.WebhookContainer;
import me.philcali.shopify.data.webhook.Webhooks;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface IShopifyService {
    @POST("admin/comments/{id}/approve.json")
    Call<CommentContainer> approveComment(@Path("id") long id);

    @FormUrlEncoded
    @POST("admin/oauth/access_token")
    Call<AuthToken> authenticate(@Field("client_id") String clientId, @Field("client_secret") String clientSecret,
            @Field("code") String code);

    @POST("admin/comments.json")
    Call<CommentContainer> createComment(@Body CommentContainer commnet);

    @POST("admin/webhooks.json")
    Call<WebhookContainer> createWebhook(@Body WebhookContainer webhook);

    @DELETE("admin/webhooks/{id}.json")
    Call<WebhookContainer> deleteWebhook(@Path("id") long id);

    @GET("admin/comments.json")
    Call<Comments> getComments(@QueryMap Map<String, String> options);

    @GET("admin/shop.json")
    Call<Shop> getShop();

    @GET("admin/webhooks.json")
    Call<Webhooks> getWebhooks();

    @POST("admin/comments/{id}/not_spam.json")
    Call<CommentContainer> markCommentAsNotSpam(@Path("id") long id);

    @POST("admin/comments/{id}/spam.json")
    Call<CommentContainer> markCommentAsSpam(@Path("id") long id);

    @POST("admin/comment/{id}/reject.json")
    Call<CommentContainer> rejectComment(@Path("id") long id);

    @POST("admin/comment/{id}/remove.json")
    Call<CommentContainer> removeComment(@Path("id") long id);

    @PUT("admin/comments/{id}.json")
    Call<CommentContainer> updateComment(@Path("id") long id, @Body CommentContainer comment);

    @PUT("admin/webhooks/{id}.json")
    Call<WebhookContainer> updateWebhook(@Path("id") long id, @Body WebhookContainer webhook);
}
