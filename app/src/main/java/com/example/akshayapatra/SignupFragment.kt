package com.example.akshayapatra

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.akshayapatra.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSignupBinding>(inflater,R.layout.fragment_signup,container,false)
        binding.signupbtn.setOnClickListener{ view:View->
            view.findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToHomeFragment())
        }
        binding.signinbtn.setOnClickListener { view:View->
            view.findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToHomeFragment())
        }
        return binding.root
    }

}