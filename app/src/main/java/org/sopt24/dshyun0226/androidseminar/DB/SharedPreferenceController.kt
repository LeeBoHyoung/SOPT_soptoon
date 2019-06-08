package org.sopt24.dshyun0226.androidseminar.DB

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController{

    val MY_ACCOUNT = "unique_string"

    fun setUserToken(ctx: Context, time: String){ //refactor를 사용해서 변수이름을 바꿀 수 있음
        val preference: SharedPreferences = ctx.getSharedPreferences(MY_ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.putString("u_token", time)
        editor.commit()
    }

    fun getUserToken(ctx: Context): String{
        val preference: SharedPreferences = ctx.getSharedPreferences(MY_ACCOUNT, Context.MODE_PRIVATE)
        return preference.getString("u_token", "")
    }

    fun clearUserToken(ctx: Context){
        val preference: SharedPreferences = ctx.getSharedPreferences(MY_ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preference.edit()
        editor.clear()
        editor.commit()
    }
}