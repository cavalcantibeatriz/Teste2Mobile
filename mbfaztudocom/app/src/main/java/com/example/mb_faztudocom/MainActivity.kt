package com.example.mb_faztudocom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mb_faztudocom.ui.theme.MbfaztudocomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbfaztudocomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RegisterScreen()
                }
            }
        }
    }
}

@Composable
fun RegisterScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.wave_login),
            contentDescription = "Backgroung registro",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier.padding(25.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.faztudoicon),
                        contentDescription = "icone")
                    Text(
                        text = "Crie sua conta ",
                        modifier = Modifier.padding(13.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center
                        )
                }

                Text(text = "Suas informações")

                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    var nome by remember {
                        mutableStateOf("")
                    }

                    OutlinedTextField(
                        value = nome,
                        onValueChange = {
                            nome = it
                        },
                        label = {
                            Text("Nome")
                        },
                        placeholder = {
                            Text("Digite seu nome")
                        },
                         modifier = Modifier.weight(1f)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    var sobrenome by remember {
                        mutableStateOf("")
                    }

                    OutlinedTextField(
                        value = sobrenome,
                        onValueChange = {
                            sobrenome = it
                        },
                        label = {
                            Text("sobrenome")
                        },
                        placeholder = {
                            Text("Digite seu sobrenome")
                        },
                        modifier = Modifier.weight(1f)
                    )
                }

            Spacer(modifier = Modifier.height(16.dp))

            var email by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = {
                    Text("Email")
                },
                placeholder = {
                    Text("Digite seu email")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            var celular by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = celular,
                onValueChange = {
                    celular = it
                },
                label = {
                    Text("Celular")
                },
                placeholder = {
                    Text("Digite seu celular")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            var cpf by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = cpf,
                onValueChange = {
                    cpf = it
                },
                label = {
                    Text("CPF")
                },
                placeholder = {
                    Text("Digite seu CPF")
                },
                modifier = Modifier.fillMaxWidth()
                )

            Spacer(modifier = Modifier.height(16.dp))

            var dt_nascimento by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = dt_nascimento,
                onValueChange = {
                    dt_nascimento = it
                },
                label = {
                    Text("Data de nascimento")
                },
                placeholder = {
                    Text("Digite sua data de nascimento")
                },
                modifier = Modifier.fillMaxWidth()
                )

            Spacer(modifier = Modifier.height(16.dp))

            var cep by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = cep,
                onValueChange = {
                    cep = it
                },
                label = {
                    Text("CEP")
                },
                placeholder = {
                    Text("Digite seu CEP")
                },
                modifier = Modifier.fillMaxWidth()
                )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .align(alignment = Alignment.End)
                    .background(
                        color = Color.Magenta, shape = RoundedCornerShape(30.dp)
                    ),
                contentPadding = PaddingValues(16.dp)
            ) {
                Text(text = "Continuar")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun registerPreview() {
    MbfaztudocomTheme {
        RegisterScreen()
    }
}