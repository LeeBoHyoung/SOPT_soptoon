package org.sopt24.dshyun0226.androidseminar.Network


import com.google.gson.JsonObject
import org.sopt24.dshyun0226.androidseminar.Get.GetMainProductListResponse
import org.sopt24.dshyun0226.androidseminar.Network.Post.PostLoginResponse
import org.sopt24.dshyun0226.androidseminar.Network.Post.PostSignupResponse
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {
    @POST("/api/auth/signin") //전송 메소드 정의
    fun postLoginResponse(
        @Header("Content-Type") content_type:String,
        @Body() body:JsonObject //body는 json 형식으로
    ): Call<PostLoginResponse>

    @POST("/api/auth/signup")
    fun postSignupResponse(
        @Header("Content-Type") content_type: String,
        @Body() body:JsonObject
    ): Call<PostSignupResponse>

    @GET("api/webtoons/main/{flag}")
    fun getMainProductListResponse(
        @Header("Content-Type") content_type: String,
        @Path("flag") flag: Int
    ): Call<GetMainProductListResponse>
}