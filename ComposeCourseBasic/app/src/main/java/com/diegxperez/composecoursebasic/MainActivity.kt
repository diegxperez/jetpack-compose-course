package com.diegxperez.composecoursebasic

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diegxperez.composecoursebasic.ui.theme.ComposeCourseBasicTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposable()
        }
    }
}

@Composable
fun MyFirstComposable() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Text(text = "Hello Diegx Perez")
        Text(text = "Hello Diegx Perez")

    }
}

@Composable
fun MyRows() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Button(onClick = { /*TODO*/ }) {

        }
        Button(onClick = { /*TODO*/ }) {

        }
        Button(onClick = { /*TODO*/ }) {

        }
    }
}

@Preview(name = "MyPreview", showSystemUi = true)
@Composable
fun MyFirstComposablePreview() {
    MyFirstComposable()
}

@Preview(name = "MyPreview", showSystemUi = true)
@Composable
fun MyRowPreview() {
    MyRows()
}

@Preview(name = "MyPreview", showSystemUi = true)
@Composable
fun MyBoxPreview() {
    MyBox()
}

@Composable
fun MyBox() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
            //verticalAlignment = Alignment.CenterVertically,
            //horizontalArrangement = Arrangement.Center,
        ) {
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { /*TODO*/ }) {

            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { /*TODO*/ }) {

            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { /*TODO*/ }) {

            }
        }
    }


}