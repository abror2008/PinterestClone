package com.example.pinterestclone.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.pinterestclone.R
import com.example.pinterestclone.databinding.FragmentDetaileBinding
import com.example.pinterestclone.model.search.OnePeople
import com.example.pinterestclone.repository.ImageRepository
import com.example.pinterestclone.utils.viewBinding

class DetaileFragment : Fragment() {
    lateinit var list:ArrayList<OnePeople>
    lateinit var repository: ImageRepository
    private val binding by viewBinding { FragmentDetaileBinding.bind(it) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detaile, container, false)
        setuoUI(view)
    }
    private fun setuoUI(view: View?) {
        val back = view?.findViewById<ImageView>(R.id.iv_Detailback)
        back?.setOnClickListener {
            val intent = Intent()
        }
        binding.apply {
            ivDetailsave.setOnClickListener {
                val name = ivDetailname.text.toString()
                val urls = ivDetailImg
            }
        }
    }
}