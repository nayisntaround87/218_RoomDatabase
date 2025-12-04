package com.example.myroomsatu.mapper

import com.example.myroomsatu.room.Siswa
import com.example.myroomsatu.viewmodel.EntryViewModel

fun EntryViewModel.DetailSiswa.toSiswa(): Siswa =
    Siswa(
        id = id,
        nama = nama,
        alamat = alamat,
        telpon = telpon
    )

fun Siswa.toDetailSiswa(): EntryViewModel.DetailSiswa =
    EntryViewModel.DetailSiswa(
        id = id,
        nama = nama,
        alamat = alamat,
        telpon = telpon
    )

fun Siswa.toUiStateSiswa(isEntryValid: Boolean = false): EntryViewModel.UIStateSiswa =
    EntryViewModel.UIStateSiswa(
        detailSiswa = this.toDetailSiswa(),
        isEntryValid = isEntryValid
    )
