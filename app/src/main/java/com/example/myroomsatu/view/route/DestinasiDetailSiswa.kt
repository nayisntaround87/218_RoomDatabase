package com.example.myroomsatu.view.route

import com.example.myroomsatu.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val ItemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$ItemIdArg}"
}