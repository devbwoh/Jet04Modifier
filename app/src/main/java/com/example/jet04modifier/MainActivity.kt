package com.example.jet04modifier

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jet04modifier.ui.theme.Jet04ModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet04ModifierTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // 전체 화면을 차지하는 경우가 있어서 Box 추가함
                    // 강의자료와 같이 출력되면 주석 처리해도 됨
                    Box {
                        Greeting("Android")
                    }
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//            .fillMaxWidth()
//            .background(Color.Blue)
//            .padding(30.dp),
//        color = Color.Yellow,
//        fontSize = 30.sp,
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//        textAlign = TextAlign.Center,
//    )
//}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    // onCreate()로 옮김
    //Box {
        Image(
            painter = painterResource(id = R.drawable.gundam),
            contentDescription = "건담 이미지",
            modifier = Modifier
                .padding(30.dp)
                .size(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .clickable {
                    Toast.makeText(
                        context,
                        "이미지 클릭됨",
                        Toast.LENGTH_LONG
                    ).show()
                },
            contentScale = ContentScale.FillHeight,
        )
    //}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jet04ModifierTheme {
        Greeting("Android")
    }
}