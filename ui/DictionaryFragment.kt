package com.malipo.online.rtmtv.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil

class DictionaryFragment : Fragment() {
    
    private lateinit var defaultWord: DomainWord
 
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DatabindingUtil.inflate<DictionaryLayoutBinding>(
            inflater,
            R.layout.dictionary-layout,
            container,
            false
        )

        defaultWord = DomainWord("","")
        
        binding.let{
            lifecycleOwner = viewLifecycleOwner
            word = defaultWord
        }
        
        return binding.root
    }
    
}
