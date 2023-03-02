package com.example.pinterestclone.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pinterestclone.R
import com.example.pinterestclone.adapter.PinterestAdapter
import com.example.pinterestclone.data.remote.ApiClient
import com.example.pinterestclone.databinding.FragmentMainBinding
import com.example.pinterestclone.model.HomeItem
import com.example.pinterestclone.utils.viewBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainFragment : Fragment(R.layout.fragment_main) {
    private val binding by viewBinding { FragmentMainBinding.bind(it) }
    var list = ArrayList<HomeItem>()
    lateinit var adapter: PinterestAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
        initViews(view)
    }
    private fun setupUI() {
        binding.apply {

        }
    }

    private fun initViews(view: View) {
        listPhotos1()
        val rvPhoto = view.findViewById<RecyclerView>(R.id.rv_main)
        adapter = PinterestAdapter(list)
        rvPhoto.adapter = adapter
        rvPhoto.layoutManager=GridLayoutManager(requireContext(),2)
        adapter.detail={
            val bundle=Bundle()
            bundle.putString("id",it)
            findNavController().navigate(R.id.action_mainFragment_to_detaileFragment,bundle)
        }
    }
    private fun listPhotos1() {
        ApiClient.apiService.listPhotos1().enqueue(object :Callback<ArrayList<HomeItem>>{
            override fun onResponse(call: Call<ArrayList<HomeItem>>, response: Response<ArrayList<HomeItem>>) {
                if (response.isSuccessful){
                    adapter.submitList(response.body()!!)
                }
            }

            override fun onFailure(call: Call<ArrayList<HomeItem>>, t: Throwable) {
            }

        })
    }
}