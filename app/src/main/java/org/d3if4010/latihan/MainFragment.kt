package org.d3if4010.latihan


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3if4010.latihan.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentMainBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_main,container,false)

        binding.tvSatu.setOnClickListener{
            view : View -> view.findNavController().navigate(
            R.id.action_mainFragment_to_menu1Fragment
        )
        }

        binding.btMenuDua.setOnClickListener {
            view : View -> view.findNavController().navigate(
            R.id.action_mainFragment_to_menu2Fragment
        )
        }

        return binding.root

    }


}
