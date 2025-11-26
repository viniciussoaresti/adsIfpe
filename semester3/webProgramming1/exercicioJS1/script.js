const body = document.querySelector('body');

function menu(option) {

    switch (option) {
        case 1:
            parOuImpar();
            break;
        case 2:
            mediaDeNotas();
            break;
        case 3:
            notasEmLetras();
            break;
        case 4:
            tradutorDeCores();
            break;
        case 5:
            somaDos100Numeros();
            break;
        case 6:
            tabuada();
            break;
        case 7:
            fatorial();
            break;
        case 8:
            verificarFormulario();
            break;
        default:
            erroDeOpcao();
            break;
    }
}

function parOuImpar() {
    const isPar = +prompt("Insira o número:") % 2 == 0
        ? 'Número par.' : 'Número impar.';
    console.log(isPar);
    appendParagraphWithText(isPar);
}

function mediaDeNotas() {
    const notas = [
        +prompt("Nota 1:"), +prompt("Nota 2:"), +prompt("Nota 3:"),
        +prompt("Nota 4:")
    ];
    const media = notas.reduce((total, nota) => total + nota) / 4;
    appendParagraphWithText(media >= 7 ? 'Aprovado!' : 'Reprovado!');
}

function notasEmLetras() {
    const nota = +prompt("Nota de 0 a 100:");

    let notaEmLetra = null;

    switch (true) {
        case nota >= 90:
            notaEmLetra = "A";
            break;
        case nota >= 80:
            notaEmLetra = "B";
            break;
        case nota >= 70:
            notaEmLetra = "C";
            break;
        case nota >= 60:
            notaEmLetra = "D";
            break;
        case nota < 60:
            notaEmLetra = "F";
            break;
        default:
            notaEmLetra = "Valor Inválido";
    }

    appendParagraphWithText(notaEmLetra);
}

function tradutorDeCores() {
    let resultado = null;

    switch (prompt("Cor em inglês:")) {
        case 'red':
            resultado = 'Vermelho';
            break;
        case 'green':
            resultado = 'Verde';
            break;
        case 'blue':
            resultado = 'Azul';
            break;
        case 'yellow':
            resultado = 'Amarelo';
            break;
        case 'orange':
            resultado = 'Laranja';
            break;
        case 'purple':
            resultado = 'Violeta';
            break;
        case 'pink':
            resultado = 'Rosa';
            break;
        case 'brown':
            resultado = 'Cinza';
            break;
        case 'gray':
            resultado = 'Grau';
            break;
        case 'black':
            resultado = 'Preto';
            break;
        case 'white':
            resultado = 'Branco';
            break;
        default:
            resultado = 'Cor desconhecida';
    }

    appendParagraphWithText(resultado);
}

function somaDos100Numeros() {
    let soma = 0;

    for (let index = 1; index <= 100; index++) {
        index % 2 == 0 ? soma += index : undefined;
    }

    console.log(soma);
    appendParagraphWithText(soma);
}

function tabuada() {
    const numero = +prompt("Insira o número:");

    for (let index = 1; index <= 10; index++) {
        appendParagraphWithText(numero * index);
    }
}

function fatorial() {
    const numero = +prompt("Numero para fatorial");

    let resultado = 1;

    if (numero > 10) {
        alert("Número inválido!");
        return;
    }

    for (let index = 2; index <= numero; index++) {
        resultado *= index;
    }

    appendParagraphWithText(`Fatorial de ${numero}: ${resultado}`);
}

function verificarFormulario() {

    const form = document.createElement('form');

    const nameInput = Object.assign(document.createElement("input"),
        { 'type': 'text' },
        { 'name': 'nome' },
        { 'placeholder': 'Nome' });

    const emailInput = Object.assign(document.createElement("input"),
        { 'type': 'input' },
        { 'name': 'email' },
        { 'placeholder': 'email@email.com' });

    nameInput.addEventListener('focusout', checkField);
    emailInput.addEventListener('focusout', checkField);

    form.append(
        nameInput,
        emailInput,
        Object.assign(document.createElement("button"),
            { 'type': 'submit' },
            { 'innerText': 'Enviar' })
    );

    body.append(form);

    function checkField(event) {
        if (event.target.value == "") {
            event.target.style.border = '2px solid red';
        } else {
            event.target.style.border = '2px solid black';
        }
    }
}

function erroDeOpcao() {
    alert('Opção inválida!');
}

function appendParagraphWithText(text) {
    const paragraph = document.createElement('p');
    paragraph.innerText = text;
    body.append(paragraph);
}

async function mainLoop() {
    let option = +prompt("Qual exercício você quer acessar? (0 para sair, 1-8 para os exercícios)");

    while (option != 0) {
        body.replaceChildren();
        menu(option);
        let secondsToWait = option == 8 ? 30 : 5;
        await new Promise((resolve) => setTimeout(resolve, secondsToWait * 1000));
        option = +prompt("Qual exercício você quer acessar? (0 para sair, 1-8 para os exercícios)");
    }

    body.replaceChildren();

    body.append(
        Object.assign(
            document.createElement('p'),
            { 'innerText': 'Obrigado por acessar!' }
        ),
        Object.assign(
            document.createElement('button'),
            { 'innerText': 'Voltar ao menu' },
            { 'onclick': restart }
        )
    );
};

mainLoop();

function restart() {
    mainLoop();
}