package com.example.myuipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapkmobile.R


@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(id = R.string.Prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.Univ),
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(25.dp))


        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.Copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 45.dp)
            )
        }
    }
}

@Composable
fun MahasiswaCard(
    backgroundColor: Color,
    nama: String,
    alamat: String,
    kontak: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            val gambar = painterResource(id = R.drawable.umy)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(90.dp)
                    .padding(5.dp)
            )

            Spacer(modifier = Modifier.width(20.dp))
        }
    }
}
