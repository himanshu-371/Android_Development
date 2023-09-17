package com.example.androidwallpaper.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidwallpaper.Adapter.BomAdapter
import com.example.androidwallpaper.Adapter.catAdapter
import com.example.androidwallpaper.Adapter.tctAdapter
import com.example.androidwallpaper.Model.bomModel
import com.example.androidwallpaper.Model.catModel
import com.example.androidwallpaper.Model.tctModel
import com.example.androidwallpaper.databinding.FragmentHomeBinding
import com.google.firebase.firestore.FirebaseFirestore


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var db: FirebaseFirestore


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)

        db = FirebaseFirestore.getInstance()

        db.collection("bestofmonth").addSnapshotListener { value, error ->
            val listBestOfTheMonth = arrayListOf<bomModel>()
            val data=value?.toObjects(bomModel::class.java)

            listBestOfTheMonth.addAll(data!!)

            binding.rcvBom.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            binding.rcvBom.adapter=BomAdapter(requireContext(),listBestOfTheMonth)

        }

        db.collection("colortones").addSnapshotListener { value, error ->

            val listTheColorTone = arrayListOf<tctModel>()
            val data = value?.toObjects(tctModel::class.java)

            listTheColorTone.addAll(data!!)

            binding.rcvTct.layoutManager  = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            binding.rcvTct.adapter= tctAdapter(requireContext(),listTheColorTone)
        }

        db.collection("categories").addSnapshotListener { value, error ->

            val listOfCategories = arrayListOf<catModel>()
            val data = value?.toObjects(catModel::class.java)

            listOfCategories.addAll(data!!)

            binding.rcvCat.layoutManager = GridLayoutManager(requireContext(),2)
            binding.rcvCat.adapter = catAdapter(requireContext(),listOfCategories)

        }


        return binding.root
    }


}