package br.com.wfgmovieapp.core.util

import br.com.wfgmovieapp.BuildConfig


fun String?.toPosUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"

fun String?.toToBackDropurl() = "${BuildConfig.BASE_URL_IMAGE}$this"