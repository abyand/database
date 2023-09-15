package com.grab.scribe.shared_database.data

data class EventData(
    var _id: Long = 0,
    var data: Map<String, String>,
    var eventName: String = "",
    var timeStamp: Long = 0,
    var batchId: Long = 0,
)