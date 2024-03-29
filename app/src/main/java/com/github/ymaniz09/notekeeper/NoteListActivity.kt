package com.github.ymaniz09.notekeeper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.ymaniz09.notekeeper.model.DataManager
import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
        }

        val adapter = CourseAdapter(DataManager.notes)
        noteListRecyclerView.adapter = adapter
    }

}