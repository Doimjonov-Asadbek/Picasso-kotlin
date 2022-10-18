package app.test.picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)

        Picasso.get()
            .load("https://i.imgur.com/tGbaZCY.jpg")
            .placeholder(R.drawable.aaa)
            .error(R.drawable.aaa)
            .into(imageView)
    }
}