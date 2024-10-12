function computerPlay() {
  let options = ["piedra", "papel", "tijera"];
  return options[Math.floor(Math.random() * options.length)];
}

function playRound(computerPlay) {
  let tie;
  let computerW;
  let playerW;
  let playerSelection;
  for (let i = 0; i < 5; i++) {
    if (playerW == 3 || computerW == 3) {
      break;
    } else {
      playerSelection = +prompt(
        "Elige tu movimiento:\n (1) Piedra\n (2) Papel\n (3) Tijera",
      );
      if (playerSelection == 1) {
        playerSelection = "piedra";
      } else if (playerSelection == 2) {
        playerSelection = "papel";
      } else if (playerSelection == 3) {
        playerSelection = "tijera";
      } else {
        playerSelection = "piedra";
      }
      if (computerPlay === playerSelection) {
        alert("Empataste");
        tie++;
      } else if (
        (playerSelection === "piedra" && computerPlay === "tijera") ||
        (playerSelection === "papel" && computerPlay === "piedra") ||
        (playerSelection === "tijera" && computerPlay === "papel")
      ) {
        alert("Ganaste! " + playerSelection + " vence a " + computerPlay);
        playerW++;
      } else {
        alert("Perdiste, " + computerPlay + " vence a " + playerSelection);
        computerW++;
      }
    }
  }
  if (playerW > computerW) {
    alert(
      "Gano el jugador con " +
        playerW +
        " victorias. " +
        "La computadora gano: " +
        computerW +
        " partidas " +
        "y hubo " +
        tie +
        " empates.",
    );
  } else {
    alert(
      "Gano la computadora con " +
        playerW +
        " victorias. " +
        "La computadora gano: " +
        computerW +
        " partidas " +
        "y hubo " +
        tie +
        " empates.",
    );
  }
}

function game() {
  playRound(computerPlay());
}

do {
  game();
} while (confirm("Quieres seguir jugando?"));
