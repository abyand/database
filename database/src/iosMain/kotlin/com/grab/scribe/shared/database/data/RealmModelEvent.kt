package com.grab.scribe.shared.database.data

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

internal class RealmModelEvent() : RealmObject {
    @PrimaryKey
    var _id: Long = 0
    var data: String = ""
    var eventName: String = ""
    var timeStamp: Long = 0
    var isEncrypted: Boolean = true
    var batchId: Long = 0
}