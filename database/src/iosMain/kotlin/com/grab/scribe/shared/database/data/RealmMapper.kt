package com.grab.scribe.shared.database.data

import com.grab.scribe.shared_database.data.BatchData
import com.grab.scribe.shared_database.data.EventData

internal class RealmMapper(
    private val encryptMethod: (String) -> String,
    private val decryptMethod: (String) -> String,
    private val stringToMap: (String) -> Map<String, String>,
    private val mapToString: (Map<String, String>) -> String,
    private val isEncrypted: () -> Boolean
) {

    fun mapEventToModelEvent(event: EventData): RealmModelEvent {
        var stringData = mapToString(event.data)
        if (isEncrypted()) {
            stringData = encryptMethod(stringData)
        }
        return RealmModelEvent().apply {
            this._id = event._id
            this.data = stringData
            this.eventName = event.eventName
            this.timeStamp = event.timeStamp
            this.isEncrypted = isEncrypted
            this.batchId = event.batchId
        }
    }

    fun mapModelEventToEvent(event: RealmModelEvent): EventData {
        var stringData = event.data
        if (event.isEncrypted) {
            stringData = decryptMethod(event.data)
        }
        return EventData(
            _id = event._id,
            data = stringToMap(stringData),
            eventName = event.eventName,
            timeStamp = event.timeStamp,
            batchId = event.batchId,
        )
    }

    fun mapBatchToModelBatch(batch: BatchData): RealmModelBatch {
        return RealmModelBatch().apply {
            this._id = batch._id
            this.batchUUID = batch.batchUUID
            this.timeStamp = batch.timeStamp
        }
    }

    fun mapModelBatchToBatch(batch: RealmModelBatch?, eventList: List<EventData>): BatchData? {
        batch?.let {
            return BatchData(
                it._id,
                it.batchUUID,
                it.timeStamp,
                eventList
            )
        }
        return null
    }
}