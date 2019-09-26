package com.example.photosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photosapp.ui.main.PhotoGridFragment

class PhotoGridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PhotoGridFragment.newInstance())
                .commitNow()
        }
    }

}
