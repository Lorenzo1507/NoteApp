package br.senac.noteapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.Note
import br.senac.noteapp.NoteSingleton
import br.senac.noteapp.databinding.ActivityNewNoteBinding

class NewNoteActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            val note = Note(binding.etTitle.text.toString(), binding.etDesc.text.toString())

            NoteSingleton.noteList.add(note)

            finish()
        }

    }

}