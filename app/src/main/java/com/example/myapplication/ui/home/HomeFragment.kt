package com.example.myapplication.ui.home

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.CarrotActivity
import com.example.myapplication.TomatoActivity
import com.example.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Set text and other properties
        val header1: TextView = binding.header2
        header1.setText("Морковь")

        val textHeader1: TextView = binding.contentText1
        textHeader1.setText("Морковь по лучшей цене с доставкой на дом или самовывозом. Большой выбор, выгодные цены")

        val header2: TextView = binding.header1
        header2.setText("Помидоры")

        val textHeader2: TextView = binding.contentText2
        textHeader2.setText("Томаты по лучшей цене с доставкой на дом или самовывозом. Большой выбор, выгодные цены")

        val imageCarrot: ImageView = binding.imageViewFirst
        imageCarrot.setOnClickListener {
            onImageCarrotViewClick(it)
        }

        val imageTomato: ImageView = binding.imageViewFirst1
        imageTomato.setOnClickListener {
            onImageTomatoViewClick(it)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun onImageCarrotViewClick(view: View) {
        val intent = Intent(requireContext(), CarrotActivity::class.java)
        startActivity(intent)
    }

    private fun onImageTomatoViewClick(view: View) {
        val intent = Intent(requireContext(), TomatoActivity::class.java)
        startActivity(intent)
    }
}
