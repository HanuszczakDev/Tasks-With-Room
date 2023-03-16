package com.hanuszczak.taskswithroom.viewmodel.util

import androidx.recyclerview.widget.DiffUtil
import com.hanuszczak.taskswithroom.model.Task

class TaskDiffItemCallback : DiffUtil.ItemCallback<Task>() {
    override fun areItemsTheSame(oldItem: Task, newItem: Task): Boolean =
        (oldItem.taskId == newItem.taskId)

    override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean =
        (oldItem == newItem)
}