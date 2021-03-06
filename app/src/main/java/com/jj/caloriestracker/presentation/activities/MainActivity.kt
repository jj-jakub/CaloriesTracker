package com.jj.caloriestracker.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jj.caloriestracker.data.text.VersionTextProvider
import com.jj.caloriestracker.databinding.ActivityMainBinding
import org.koin.java.KoinJavaComponent

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private val versionTextProvider: VersionTextProvider by KoinJavaComponent.inject(VersionTextProvider::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        setMainLabelText()
    }

    private fun setMainLabelText() {
        activityMainBinding.mainLabel.text = versionTextProvider.getAboutVersionText()
    }
}