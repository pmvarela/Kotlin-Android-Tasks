package com.devmasterteam.tasklist.repository.cache

import com.devmasterteam.tasklist.entities.PriorityEntity

/**
 * Acesso rápido a prioridades
 * */
class PriorityCacheConstants private constructor() {

    companion object {
        fun setCache(list: List<PriorityEntity>) {
            for (item in list) {
                mPriorityCache.put(item.id, item.description)
            }
        }

        fun getPriorityDescription(id: Int): String {
            return if (mPriorityCache[id] == null) {
                ""
            } else
                mPriorityCache[id].toString()
        }

        private val mPriorityCache = hashMapOf<Int, String>()
    }

}