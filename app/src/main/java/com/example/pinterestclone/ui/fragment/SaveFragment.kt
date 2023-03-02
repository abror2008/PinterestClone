package com.example.pinterestclone.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pinterestclone.R
import com.example.pinterestclone.adapter.PinterestAdapter
import com.example.pinterestclone.databinding.FragmentDetaileBinding
import com.example.pinterestclone.databinding.FragmentSaveBinding
import com.example.pinterestclone.model.HomeItem
import com.example.pinterestclone.utils.viewBinding

class SaveFragment : Fragment() {

    lateinit var list:ArrayList<HomeItem>
    private val binding by viewBinding { FragmentSaveBinding.bind(it) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_save, container, false)
        setUpUi(view)
    }

    private fun setUpUi(view: View?) {
        loadSaves()
        val adapter= PinterestAdapter(list)
        binding.apply {
            rvSave.adapter=adapter
            rvSave.layoutManager=GridLayoutManager(requireContext(),2)
        }
    }
    private fun loadSaves() {
        list=ArrayList()

    }
}