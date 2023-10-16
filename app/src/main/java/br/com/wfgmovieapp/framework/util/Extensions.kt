package br.com.wfgmovieapp.framework.util

import br.com.movieapp.BuildConfig

fun String?.toPosUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"

fun String?.toToBackDropurl() = "${BuildConfig.BASE_URL_IMAGE}$this"