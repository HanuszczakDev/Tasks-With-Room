package com.hanuszczak.taskswithroom.viewmodel.editTask

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hanuszczak.taskswithroom.model.TaskDao

class EditTaskViewModelFactory(
    private val taskId: Long,
    private val dao: TaskDao
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EditTaskViewModel::class.java)) {
            return EditTaskViewModel(taskId, dao) as T
        }
        throw java.lang.IllegalArgumentException("Unknown ViewModel")
    }
}