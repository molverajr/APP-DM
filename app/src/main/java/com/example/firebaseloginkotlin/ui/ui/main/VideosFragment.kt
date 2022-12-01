package com.example.firebaseloginkotlin.ui.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firebaseloginkotlin.R
import com.example.firebaseloginkotlin.adapter.VideoAdapter
import com.example.firebaseloginkotlin.databinding.FragmentVideosBinding
import com.example.firebaseloginkotlin.model.VideoYtModel

class VideosFragment : Fragment() {

    companion object {
        fun newInstance() : VideosFragment{
            return VideosFragment()
        }
    }

    private var _binding: FragmentVideosBinding? = null
    private val binding get() = _binding!!
    private var videoViewModel: VideosViewModel? = null
    private val adapter = VideoAdapter()

    //private lateinit var viewModel: VideosViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvVideo.adapter = adapter
        binding.rvVideo.layoutManager = LinearLayoutManager(requireContext())

        videoViewModel?.video?.observe(viewLifecycleOwner, {
            if (it != null && it.items.isNotEmpty()){
                adapter.setData(it.items)
            }
        })
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View ?{

        videoViewModel =
            ViewModelProvider(this).get(VideosViewModel::class.java)
        _binding = FragmentVideosBinding.inflate(inflater, container, false)
        return binding.root
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        videoViewModel = ViewModelProvider(this).get(VideosViewModel::class.java)
    }*/

}