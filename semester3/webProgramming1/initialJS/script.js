/* let money = parseInt(prompt("Mete o salaro:"));

if (isNaN(money)) {
    alert("Palavra não, besta.");
} else if (money < 0) {
    alert("Aí é mole, tá nas dívida.");
} else {
    money >= 2500 ? alert("More e sofra.") : alert("More não pobre.");
} */

/* let dia = +prompt("Dia da semana 1 a 7?");
if (isNaN(dia) || dia < 1 || dia > 7) {
    alert("Dia inválido!");
} else {
    switch (dia) {
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
        default:
            dia = "Dia inválido!";
            break;
    }
    alert("Hoje é " + dia);
} */

//TODO: 3 animais, adiciona em lista, imprime lista
/* let animais = [];
for (let index = 0; index < 3; index++) {
    animais.push(prompt("Animal?"));
}
//alert(animais.toString());
for (const animal of animais) {
    console.log(animal);
} */

//TODO: Pedir nome e profissão, depois adicionar no DOM, em h1 e h2.
const nome = prompt("Nome?"), profissao = prompt("Profissão?");
const body = document.querySelector('body');
const h1 = document.createElement('h1');
h1.innerText = nome;
const h2 = document.createElement('h2');
h2.innerText = profissao;
body.append(h1, h2);