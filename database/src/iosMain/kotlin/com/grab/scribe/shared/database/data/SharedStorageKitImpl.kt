package com.grab.scribe.shared.database.data

import com.grab.scribe.shared.database.databridge.SharedStorageKit
import com.grab.scribe.shared_database.data.BatchData
import com.grab.scribe.shared_database.data.EventData

class SharedStorageKitImpl(
//    dbName: String,
//    encryptMethod: (String) -> String,
//    decryptMethod: (String) -> String,
//    stringToMap: (String) -> Map<String, String>,
//    mapToString: (Map<String, String>) -> String,
//    isEncrypted: () -> Boolean
): SharedStorageKit {
    override fun addEvent(event: EventData, getTime: (() -> Long)?) {
        TODO("Not yet implemented")
    }

    override fun addBatch(batch: BatchData) {
        TODO("Not yet implemented")
    }

    override fun getOldestBatch(): BatchData? {
        TODO("Not yet implemented")
    }

    override fun dropBatchAndEvents(batchId: Long, getTime: (() -> Long)?): Int {
        TODO("Not yet implemented")
    }

    override fun getLatestBatchId(): Long? {
        TODO("Not yet implemented")
    }

    override fun getOldestBatchId(): Long? {
        TODO("Not yet implemented")
    }

    override fun clearStorage() {
        TODO("Not yet implemented")
    }

    override fun getDatabasePath(isCompact: Boolean): String {
        TODO("Not yet implemented")
    }

    override fun getBatchCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getEventCount(): Int {
        TODO("Not yet implemented")
    }

    override fun testInsertNoSQL(event: EventData, getTime: (() -> Long)?) {
        TODO("Not yet implemented")
    }
}