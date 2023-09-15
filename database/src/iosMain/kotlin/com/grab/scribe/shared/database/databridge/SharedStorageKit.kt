package com.grab.scribe.shared.database.databridge

import com.grab.scribe.shared_database.data.BatchData
import com.grab.scribe.shared_database.data.EventData


interface SharedStorageKit {

    // necessary for Scribe
    fun addEvent(event: EventData, getTime: (() -> Long)? = null)
    fun addBatch(batch: BatchData)
    fun getOldestBatch(): BatchData?
    fun dropBatchAndEvents(batchId: Long, getTime: (() -> Long)? = null): Int
    fun getLatestBatchId(): Long?
    fun getOldestBatchId(): Long?

    fun clearStorage()

    // logging purpose only
    fun getDatabasePath(isCompact: Boolean = false): String
    fun getBatchCount(): Int
    fun getEventCount(): Int

    fun testInsertNoSQL(event: EventData, getTime: (() -> Long)? = null)
}