package com.devmasterteam.tasklist.business

import android.content.Context
import com.devmasterteam.tasklist.entities.PriorityEntity
import com.devmasterteam.tasklist.repository.PriorityRepository

class PriorityBusiness (context: Context) {

    private val mPriorityRepository: PriorityRepository = PriorityRepository.getInstance(context)

    /**
     * Retorna lista de prioridades
     * */
    fun getList(): MutableList<PriorityEntity> = mPriorityRepository.getList()

}