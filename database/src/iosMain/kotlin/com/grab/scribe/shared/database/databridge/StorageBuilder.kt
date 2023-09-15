package com.grab.scribe.shared.database.databridge

import com.grab.scribe.shared.database.data.SharedStorageKitImpl

class StorageBuilder {

    fun getStorageKit(): SharedStorageKit {
        return SharedStorageKitImpl()
    }
}