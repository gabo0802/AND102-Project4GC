package com.codepath.articlesearch

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("response")
    val response: BaseResponse?
)
@Keep
@Serializable
data class BaseResponse(
    @SerialName("docs")
    val docs: List<Movie>?
)

@Keep
@Serializable
data class Movie (

    @SerializedName("title")
    var title: String?,
    @SerializedName("overview")
    var description: String?,
    @SerializedName("poster_path")
    var imageURL: String?,
    @SerializedName("original_language")
    var originalLanguage: String?,
    @SerializedName("popularity")
    var popularity: Float?,
    @SerializedName("release_date")
    var releaseDate: String?,

)

    : java.io.Serializable {
    val mediaImageUrl = "https://image.tmdb.org/t/p/w500${imageURL}"
}







