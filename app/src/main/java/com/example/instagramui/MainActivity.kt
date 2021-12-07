package com.example.instagramui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.ui.theme.InstagramUITheme
import com.example.instagramui.ui.theme.MyFont

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramUITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    InstagramUI()
                }
            }
        }
    }
}

//@Preview
@Composable
fun InstagramUI() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        // item 1
        item {
            MaterialTheme() {
                Column() {
                    TopAppBar(
                        title = {
                            Text(
                                text = "Instagram",
                                fontFamily = MyFont,
                                fontSize = 32.sp,
                            )
                        }, actions = {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically

                            ) {
                                Icon(Icons.Filled.Add, contentDescription = null)
                                Spacer(modifier = Modifier.width(10.dp))
                                Icon(
                                    painterResource(
                                        id = R.drawable.send
                                    ),
                                    contentDescription = null,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }, backgroundColor = Color.Black
                    )
                }
            }
        } // end of item 1

        // item 2 for story UI
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                //Column 1
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.spiderman
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "peter", fontSize = 12.sp, modifier = Modifier.padding(top = 6.dp))
                }

                Spacer(modifier = Modifier.width(10.dp))

                //Column 2
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.groot
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "groot", fontSize = 12.sp, modifier = Modifier.padding(top = 6.dp))
                }

                Spacer(modifier = Modifier.width(10.dp))

                //Column 3
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.captain_america
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "captain",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 6.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))

                // Column 4
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.falcon
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "sam", fontSize = 12.sp, modifier = Modifier.padding(top = 6.dp))
                }
                Spacer(modifier = Modifier.width(10.dp))

                //Column 5
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.ironman
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "tony", fontSize = 12.sp, modifier = Modifier.padding(top = 6.dp))
                }
                Spacer(modifier = Modifier.width(10.dp))

                //Column 6
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.thor
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "thor", fontSize = 12.sp, modifier = Modifier.padding(top = 6.dp))
                }
                Spacer(modifier = Modifier.width(10.dp))

                //Column 7
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.black_panther
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "t'challa",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 6.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))

                //Column 8
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.hawkeye
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "clint", fontSize = 12.sp, modifier = Modifier.padding(top = 6.dp))
                }

                Spacer(modifier = Modifier.width(10.dp))

                //Column 9
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(
                            id = R.drawable.black_widow
                        ),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .border(width = 2.5.dp, Color.Red, shape = CircleShape)
                            .clip(shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "natasha",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 6.dp)
                    )
                }
            } // end of story row
        } // end of item 2

        // item 3 for profile
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Image(
                    painterResource(
                        id = R.drawable.ironman
                    ),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "tony", fontSize = 16.sp, modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "",
                        Modifier.padding(top = 10.dp)
                    )
                }
            }
        } // end of item 3

        // item 4 for photo
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painterResource(id = R.drawable.iron_man),
                    contentDescription = "ironman_image",
                    Modifier.size(400.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.ic_baseline_favorite_border),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        painterResource(
                            id = R.drawable.chat_bubble
                        ),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        painterResource(
                            id = R.drawable.send
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(26.dp)
                            .padding(top = 2.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painterResource(
                                id = R.drawable.ic_baseline_bookmark_border
                            ),
                            contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            }
        } // end of item 4

        // item 3 for profile
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Image(
                    painterResource(
                        id = R.drawable.spiderman
                    ),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "peter", fontSize = 16.sp, modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "",
                        Modifier.padding(top = 10.dp)
                    )
                }
            }
        } // end of item 3

        // item 4 for photo
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painterResource(id = R.drawable._spiderman_),
                    contentDescription = "",
                    Modifier.size(400.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.ic_baseline_favorite_border),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        painterResource(
                            id = R.drawable.chat_bubble
                        ),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        painterResource(
                            id = R.drawable.send
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(26.dp)
                            .padding(top = 2.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painterResource(
                                id = R.drawable.ic_baseline_bookmark_border
                            ),
                            contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            }
        } // end of item 4

        // item 3 for profile
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {
                Image(
                    painterResource(
                        id = R.drawable.captain_america
                    ),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = CircleShape)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "captain", fontSize = 16.sp, modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Icon(
                        Icons.Filled.MoreVert,
                        contentDescription = "",
                        Modifier.padding(top = 10.dp)
                    )
                }
            }
        } // end of item 3

        // item 4 for photo
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painterResource(id = R.drawable.captain_),
                    contentDescription = "ironman_image",
                    Modifier.size(400.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.ic_baseline_favorite_border),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        painterResource(
                            id = R.drawable.chat_bubble
                        ),
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        painterResource(
                            id = R.drawable.send
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(26.dp)
                            .padding(top = 2.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            painterResource(
                                id = R.drawable.ic_baseline_bookmark_border
                            ),
                            contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            }
        } // end of item 4
    } // end of lazy column
} // end of composable function







