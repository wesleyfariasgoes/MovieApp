package br.com.wfgmovieapp.core.domain.model

data class MovieSearch(
    val id: Int,
    val voteAverange: Double = 0.0,
    val imageUrl: String = ""
)
