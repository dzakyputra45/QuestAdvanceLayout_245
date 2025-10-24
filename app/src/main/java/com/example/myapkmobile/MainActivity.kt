package com.example.myapkmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapkmobile.MainActivity
import com.example.myapkmobile.TataLetakBoxColumnRow
import androidx.compose.material3.Text
import com.example.myapkmobile.ui.theme.MyApkMobileTheme
import com.example.myapkmobile.ui.theme.MyApkMobileTheme
import com.example.myuipertama.ActivitasPertama

annotation class TataLetakBoxColumnRow


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApkMobileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // 🔹 Panggil layout utama
                    ActivitasPertama(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}
