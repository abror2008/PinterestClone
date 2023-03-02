package com.example.pinterestclone.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pinterestclone.R
import com.example.pinterestclone.adapter.LishniyAdapter
import com.example.pinterestclone.adapter.PinterestAdapter
import com.example.pinterestclone.databinding.FragmentDetaileBinding
import com.example.pinterestclone.databinding.FragmentSearchBinding
import com.example.pinterestclone.model.OzimniModelim
import com.example.pinterestclone.utils.viewBinding

class SearchFragment : Fragment() {
    private val binding by viewBinding { FragmentSearchBinding.bind(it) }
    lateinit var list:ArrayList<OzimniModelim>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
        initViews(view)
    }

    private fun initViews(view: View?) {
        list=loadList()
        var rvSearch= view!!.findViewById<RecyclerView>(R.id.rv_search2)
        val adapter = LishniyAdapter(list)
        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rvSearch.adapter = adapter
        rvSearch.layoutManager = layoutManager
    }
    private fun loadList():ArrayList<OzimniModelim> {
        var mylist=ArrayList<OzimniModelim>()
        mylist.add(OzimniModelim("https://img.zr.ru/_ah/img/QedJl4rdDu4-tpnnArrRvw","supra"))
        mylist.add(OzimniModelim("https://sportishka.com/uploads/posts/2022-11/thumbs/1667495921_16-sportishka-com-p-samaya-dorogaya-bmv-v-mire-krasivo-16.jpg","BMW"))
        mylist.add(OzimniModelim("https://a.d-cd.net/da6154as-960.jpg","mercedes benz"))
        mylist.add(OzimniModelim("https://a.d-cd.net/19028eas-960.jpg","Audi"))
        mylist.add(OzimniModelim("https://pbs.twimg.com/media/FiaRg6qWAAIQ2dv?format=jpg&name=large","Rolls Royys"))
        mylist.add(OzimniModelim("https://mobimg.b-cdn.net/v3/fetch/d5/d5aa01be8f084e08e15ee881fef05dc6.jpeg","Lambargii"))
        return mylist
    }
}
