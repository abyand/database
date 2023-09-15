package com.grab.scribe.shared_database.data

import io.realm.kotlin.types.annotations.PrimaryKey

data class BatchData(
    @PrimaryKey
    var _id: Long = 0,
    var batchUUID: String = "",
    var timeStamp: Long = 0,
    var eventList: List<EventData> = emptyList()
)