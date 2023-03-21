package com.codepath.articlesearch

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var bylineTextView: TextView
    private lateinit var abstractTextView: TextView
    private lateinit var popularityTextView: TextView
    private lateinit var releaseDateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.mediaImage)
        titleTextView = findViewById(R.id.mediaTitle)
        bylineTextView = findViewById(R.id.mediaByline)
        abstractTextView = findViewById(R.id.mediaAbstract)
        popularityTextView = findViewById(R.id.mediaPopularity)
        releaseDateTextView = findViewById(R.id.mediaDate)

        // TODO: Get the extra from the Intent
        val article = intent.getSerializableExtra(MOVIE_EXTRA) as Movie

        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = article.title
        bylineTextView.text = "Original Language: " +  article.originalLanguage
        abstractTextView.text = article.description
        popularityTextView.text = "Popularity: " + article.popularity.toString()
        releaseDateTextView.text = "Release Date: " + article.releaseDate

        // TODO: Load the media image

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/${article.imageURL}")
            .into(mediaImageView)
    }
}