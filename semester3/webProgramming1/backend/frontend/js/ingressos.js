
window.addEventListener("load", main)

let carrinho
const dadosSalvoNoLocalStorage = localStorage.getItem('session-carrinho')
if (dadosSalvoNoLocalStorage == null) {
    carrinho = []
} else {
    carrinho = JSON.parse(dadosSalvoNoLocalStorage)
}

//Modelo dos nossos filmes
// Obter os filmes através do Back-end
let filmes = []

async function main() {
    // Chamar a função obterFilmesDoBackend()
    // Obter o elemento do DOM
    const requisicao = await fetch("http://localhost:3000/filmes")
    const dadosJson = await requisicao.json()
    filmes = dadosJson
    const ingressos = document.querySelector(".ingressos")
    for (let x = 0; x < filmes.length; x++) {
        // Criar os elementos
        const divFilme = document.createElement("div")
        const img = document.createElement("img")
        const p = document.createElement("p")
        const ul = document.createElement("ul")
        const ano = document.createElement("li")
        const direcao = document.createElement("li")
        const genero = document.createElement("li")
        const valor = document.createElement("li")
    
        const botaoCarrinho = document.createElement("button")
    
        // Preencher os valores
        divFilme.classList.add("ingresso")
        divFilme.id = filmes[x].id
        img.src = filmes[x].img
        p.textContent = filmes[x].descricao
        ano.textContent = filmes[x].ano
        direcao.textContent = filmes[x].direcao
        genero.textContent = filmes[x].genero
        valor.textContent = filmes[x].valor
        botaoCarrinho.textContent = "Adicionar ao carrinho"
        
        botaoCarrinho.addEventListener("click", adicionarProdutoAoCarrinho)

        // Estruturar
        divFilme.appendChild(img);
        divFilme.appendChild(p);
        ul.appendChild(ano)
        ul.appendChild(direcao)
        ul.appendChild(genero)
        ul.appendChild(valor)
        divFilme.appendChild(ul)
        divFilme.appendChild(botaoCarrinho)

        //Adicionar ao DOM
        ingressos.appendChild(divFilme)
    }
}

function adicionarProdutoAoCarrinho(evento) {
    console.log("Adicionar ao carrinho...")
    // Parte 1 - Descobrir o ID da caixa onde o botão está.
    const idFilme = evento.target.parentElement.id
    // Parte 2 - Procurar na lista filmes o filme de ID da parte 1
    let filme;
    for (let x =0; x < filmes.length; x++) {
        if (filmes[x].id === idFilme) {
            filme = filmes[x]
            x = filmes.length // break
        }
    }
    // Parte 3 - Adicionar esse filme a lista carrinho
    carrinho.push(filme)

    localStorage.setItem('session-carrinho', JSON.stringify(carrinho))
    console.log("Numero de itens no carrinho:" + carrinho.length)
    console.log(carrinho)
}