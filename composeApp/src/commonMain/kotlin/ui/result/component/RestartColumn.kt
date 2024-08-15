package ui.result.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose_would_you_rather_game.composeapp.generated.resources.Res
import compose_would_you_rather_game.composeapp.generated.resources.restart
import compose_would_you_rather_game.composeapp.generated.resources.restart_caption
import org.jetbrains.compose.resources.stringResource

@Composable
fun RestartColumn(
    onRestartClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Absolute.spacedBy(8.dp),
        modifier = modifier,
    ) {
        Text(
            text = stringResource(Res.string.restart_caption),
            color = Color(0xFFdbdbdb),
            style = MaterialTheme.typography.h6,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        RestartButton(onRestartClick)
    }
}

@Composable
private fun RestartButton(
    onRestartClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onRestartClick,
        colors = ButtonDefaults
            .buttonColors(backgroundColor = Color(0xFFF72585)),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(Res.string.restart),
            color = Color.White,
            fontSize = 18.sp,
            style = MaterialTheme.typography.button,
        )
    }
}
