package com.example.pinterestclone.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pinterestclone.R
import com.example.pinterestclone.adapter.PinterestAdapter
import com.example.pinterestclone.databinding.FragmentDetaileBinding
import com.example.pinterestclone.model.HomeItem
import com.example.pinterestclone.model.Urls
import com.example.pinterestclone.utils.viewBinding

class DetaileFragment : Fragment() {
    lateinit var list:ArrayList<HomeItem>
    private val binding by viewBinding { FragmentDetaileBinding.bind(it) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detaile, container, false)
    }
}