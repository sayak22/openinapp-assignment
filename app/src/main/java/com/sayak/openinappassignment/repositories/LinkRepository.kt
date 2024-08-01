package com.sayak.openinappassignment.repositories

import com.sayak.openinappassignment.network.LinkAPI
import javax.inject.Inject

class LinkRepository @Inject constructor(private val api: LinkAPI) {

    suspend fun getLinkInfo(token: String) = api.getLinkInfo(token)

}