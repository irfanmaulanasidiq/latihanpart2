package org.d3if4010.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4010.latihan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(
            this,R.layout.activity_main
        )

        val navControl = this.findNavController(
            R.id.fragmentKita
        )

        NavigationUI.setupActionBarWithNavController(this,navControl)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=this.findNavController(R.id.fragmentKita)
        return navController.navigateUp()
    }


}
