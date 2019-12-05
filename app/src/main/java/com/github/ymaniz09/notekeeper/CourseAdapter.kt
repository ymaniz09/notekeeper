package com.github.ymaniz09.notekeeper

import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.ymaniz09.notekeeper.model.NoteInfo
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class CourseAdapter(private val noteInfo: ArrayList<NoteInfo>) :
    RecyclerView.Adapter<CourseAdapter.CourseHolder>() {

    class CourseHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var note: NoteInfo? = null

        init {
            v.setOnClickListener(this)
        }

        fun bind(noteInfo: NoteInfo) {
            note = noteInfo
            itemView.courseTitle.text = noteInfo.title
        }

        override fun onClick(p0: View?) {
            val context = itemView.context
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra(NOTE_INFO_KEY, note)
            context.startActivity(intent)
        }

        companion object {
            const val NOTE_INFO_KEY = "NOTE_INFO"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return CourseHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return noteInfo.size
    }

    override fun onBindViewHolder(holder: CourseHolder, position: Int) {
        holder.bind(noteInfo[position])
    }
}