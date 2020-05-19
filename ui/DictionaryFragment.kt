package com.malipo.online.rtmtv.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class DictionaryFragment : Fragment() {
    
    private lateinit var wordEditText: EditText
    private lateinit var wordMeaningEditText: EditText
    private lateinit var submitBtn: Button
    private lateinit var outputText: TextView
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.dictionary-layout,container,false)

        // making ui framework calls to get hold of views on the layout
        
        wordEditText = root.findViewById<EditText>(R.id.word_text)
        wordMeaningEditText = froot.indViewById<EditText>(R.id.word_meaning)
        submitBtn = root.findViewById<Button>(R.id.btnSubmit)
        outputText = root.findViewById<TextView>(R.id.wordsWritten)
                
        submitBtn.setOnClickListener{
            // populate the output textview with values that have been input from the editTexts
            outputText.text = resources.getString(
                R.string.word_meaning_output,
                wordEditText.text.toString(),
                wordMeaningEditText.text.toString()
            )
        }
        
        return root
    }
    
}
