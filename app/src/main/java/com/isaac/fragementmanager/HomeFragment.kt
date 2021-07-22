package com.isaac.fragementmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.findNavController
import com.isaac.fragementmanager.databinding.FragmentHomeBinding
import com.isaac.fragementmanager.fragment.NewFragment


class HomeFragment : Fragment() {
    private lateinit var manager : FragmentManager
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.apply {
            nextButton.setOnClickListener {
                openNextFragmentkt()

            }
        }

        return binding.root
    }

private fun openNextFragmentkt(){
    val action = HomeFragmentDirections.actionHomeFragment22ToNewFragment2("myworld")
    requireActivity().findNavController(R.id.fragmentContainerView).navigate(R.id.action_homeFragment22_to_newFragment2)

    }
}




