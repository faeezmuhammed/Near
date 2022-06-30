package com.adroitandroid.near.connect.client

interface TcpClientListener {
    fun onSendSuccess(jobId: Long, data: ByteArray)
    fun onSendFailure(jobId: Long,data: ByteArray, e: Throwable?)
}