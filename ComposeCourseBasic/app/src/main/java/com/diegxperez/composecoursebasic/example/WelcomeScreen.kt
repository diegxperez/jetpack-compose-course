package com.diegxperez.composecoursebasic.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diegxperez.composecoursebasic.R

@Composable
fun WelcomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {

            Image(
                painter = painterResource(id = R.drawable.compose),
                contentDescription = "composeHeader",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )


            Row {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "avatar",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Bienvenidos al curso de Jetpack Compose",
                    textAlign =
                    TextAlign.Center, style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                )
            }

            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "aQUI ENCONTRARAS TODA LA INFORMACION NECESARIA",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontStyle = FontStyle.Italic
                )
            )

            Box(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = "Favorito"
                    )

                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = "Empezar")
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Divider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )

                Text(
                    text = "Encuentranos en nuestras Redes Sociales",
                    color = Color.Black,
                    modifier = Modifier.padding(4.dp)
                )

                Divider(
                    modifier = Modifier.width(24.dp),
                    thickness = 10.dp,
                    color = Color.Gray
                )
            }
        }
    }
}

@Preview(name = "Welcome", showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}