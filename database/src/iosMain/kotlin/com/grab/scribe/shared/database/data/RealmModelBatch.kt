package com.grab.scribe.shared.database.data

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

internal class RealmModelBatch() : RealmObject {
    @PrimaryKey
    var _id: Long = 0
    var batchUUID: String = ""
    var timeStamp: Long = 0
}