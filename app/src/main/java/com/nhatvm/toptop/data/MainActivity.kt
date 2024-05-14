package com.nhatvm.toptop.data

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.media3.common.util.UnstableApi
import com.nhatvm.toptop.data.Screens.FunFactsNavigationGraph
import com.nhatvm.toptop.data.Screens.HomeScreen
import com.nhatvm.toptop.data.foryou.ForYouScreen
import com.nhatvm.toptop.data.video.VideoDetailScreen
import com.nhatvm.toptop.data.theme.TopTopTheme
import com.nhatvm.toptop.data.ui.MainScreen
import dagger.hilt.android.AndroidEntryPoint


@UnstableApi
@AndroidEntryPoint
class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopTopTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    VideoDetailScreen(videoId = 1, onShowComment = {})
//                    FunFactsNavigationGraph()
//                    ForYouScreen(onShowComment = {})
                    MainScreen()
                }
            }
        }
    }
}