package com.example.questnavigasiui_048.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.questnavigasiui_048.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnCLick: () -> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), "Yang Lain"),
        Pair(stringResource(id = R.string.alamat), "Yogyakarta")
    )
    Scaffold (modifier = Modifier,
        {
            TopAppBar(
                title = { Text(text = stringResource(id=R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id=R.color.teal_700))
            )
        }){

    }
}