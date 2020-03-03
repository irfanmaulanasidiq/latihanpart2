package org.d3if4010.latihan


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_menu1.*
import org.d3if4010.latihan.databinding.FragmentMenu1Binding

/**
 * A simple [Fragment] subclass.
 */
class Menu1Fragment : Fragment() {
        lateinit var binding : FragmentMenu1Binding
    var jumlah : Int = 0
    var hasilKue : String=""
    var harga : Int = 0
    var topping : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_menu1,container
        ,false)

        binding.btTambah.setOnClickListener {
            jumlah = binding.tvNilai.text.toString().toInt()+1
            binding.tvNilai.setText(jumlah.toString())
        }
        binding.btKurang.setOnClickListener {
            jumlah = binding.tvNilai.text.toString().toInt()-1
            binding.tvNilai.setText(jumlah.toString())
        }
        //ketika button beli di klik
        harga = 0
        binding.bBeli.setOnClickListener {
            topping = 0
            //mengambil nama topping yang dipilih
            if (binding.cbIceCream.isChecked){
                topping+=2000
            }
            if (binding.cbCeres.isChecked){
                topping+=1000
            }
            //mengambil nilai harga
            harga =binding.tvNilai.text.toString().toInt()*5000+topping
            //menampilkan total harga
            binding.tvTotalHarga.setText(harga.toString())
            //set nama pembeli
            binding.tvNama.setText(tv_nama.toString())
            //set nama kue
            if (binding.rbCoklat.isChecked){
                hasilKue = "Rasa Coklat"
                tv_kue.setText(hasilKue)
            }else if (binding.rbStrawberry.isChecked){
                hasilKue="Rasa Strawberry"
                tv_kue.setText(hasilKue)
            }



        }


        return binding.root
    }


}
