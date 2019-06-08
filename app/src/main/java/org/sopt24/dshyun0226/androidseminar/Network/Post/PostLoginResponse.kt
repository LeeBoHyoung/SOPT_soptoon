package org.sopt24.dshyun0226.androidseminar.Network.Post

data class PostLoginResponse(
    val status: Int,
    val success: Boolean,
    val message: String,
    val data: String? //data는 에러일 때 서버 측에서 data를 보내지 않기 때문에 null이 올수도 있음
)