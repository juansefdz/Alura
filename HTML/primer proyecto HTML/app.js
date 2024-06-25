let numeroSecreto = Math.floor(Math.random()*rangoMayor)+1;
let numeroUsuario;
let contador=1;
let maximoIntentos=4;

let rangoMayor= prompt("ingrese el rango mayor");


while (numeroUsuario != numeroSecreto) {
  numeroUsuario = parseInt(prompt(`dime un numero entre 1 y ${rangoMayor}: `));

  console.log(numeroUsuario);

  if (numeroUsuario == numeroSecreto) {
    alert(`Acertaste el numero era ${numeroUsuario}. en ${intentos} ${intentos==1?"vez":"veces"}`);
    
  } else {
    if (numeroUsuario > numeroSecreto) {
      alert("el numero secreto es menor");
    }
    alert("el numero es mayor");
    contador++;
  }
  
}
