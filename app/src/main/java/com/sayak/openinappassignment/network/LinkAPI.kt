package com.sayak.openinappassignment.network

import com.sayak.openinappassignment.models.LinkInfoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface LinkAPI {
    @GET("api/v1/dashboardNew")
    suspend fun getLinkInfo(@Header("Authorization") token: String): Response<LinkInfoModel>
}