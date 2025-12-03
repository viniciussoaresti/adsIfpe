window.addEventListener("load", main)

//Modelo dos nossos filmes

let carrinho = [];

const filmes = [
    {
        id: "filme-0",
        img: "https://4.bp.blogspot.com/-GW1Ex5rl1o8/VMG9B8zuM2I/AAAAAAAAQ-A/PdXFAKUlN2c/s1600/somaoredor1.jpeg",
        titulo: "O Som ao redor",
        descricao:
            "O Som ao Redor começa com a chegada de uma milícia a uma rua de classe média da cidade do Recife, onde diferentes narrativas acabam se cruzando. Segundo a Associação Brasileira de Críticos de Cinema (Abraccine), é o 15º melhor filme da história do cinema nacional.",
        ano: 2013,
        direcao: "Kleber Mendonça",
        genero: "Suspense, Drama",
        valor: 3.0,
    },
    {
        id: "filme-1",
        img: "https://upload.wikimedia.org/wikipedia/pt/2/29/Central_do_Brasil_poster.jpg",
        titulo: "Central do Brasil",
        descricao:
            "Dora, uma ex-professora que escreve cartas na Central do Brasil, e o menino Josué, que fica órfão da noite para o dia. O filme, que emocionou o mundo, recebeu duas indicações ao Oscar: nas categorias melhor filme estrangeiro e melhor atriz.",
        ano: 1998,
        direcao: "Walter Salles",
        genero: "Drama",
        valor: 4.5,
    },
    {
        id: "filme-2",
        img: "https://upload.wikimedia.org/wikipedia/pt/thumb/1/10/CidadedeDeus.jpg/220px-CidadedeDeus.jpg",
        titulo: "Cidade de Deus",
        descricao:
            'Nos anos 1960, a favela é um complexo habitacional recém-construído longe do centro do Rio de Janeiro, com pouco acesso à eletricidade e água. Três ladrões amadores conhecido como "Trio Ternura" — Cabeleira, Alicate e Marreco — aterrorizam os negócios locais. Marreco é o irmão de Buscapé. Como Robin Hood, eles dividem parte do dinheiro roubado com os habitantes da favela chamada de Cidade de Deus e, em troca, são protegidos por eles.',
        ano: 2002,
        direcao: "Fernando Meirelles",
        genero: "Drama, Ação",
        valor: 3.5,
    },
    {
        id: "filme-3",
        img: "https://upload.wikimedia.org/wikipedia/pt/thumb/2/2a/TropaDeElitePoster.jpg/250px-TropaDeElitePoster.jpg",
        titulo: "Tropa de Elite",
        descricao:
            "Os acontecimentos do filme são narrados em primeira pessoa pelo Capitão Roberto Nascimento, dando uma perspectiva ao espectador de todos os fatos interligados. O filme começa in medias res, no ano de 1997, em um baile funk no Morro da Babilônia, uma das principais bases do narcotráfico da cidade Rio de Janeiro.",
        ano: 2007,
        direcao: "José Padilha",
        genero: "Drama, Policial",
        valor: 4.99,
    },
];

function main() {
    // Obter o elemento do DOM
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
        botaoCarrinho.addEventListener('click', adicionarProdutoAoCarrinho);

        function adicionarProdutoAoCarrinho(event) {
            let id = filmes.findIndex(
                filme => filme.id === event.target.parentNode.id
            );
            id > -1 ? carrinho.push(filmes[id]) : undefined;
            console.log(carrinho);
        }

        // Preencher os valores
        divFilme.classList.add("ingresso")
        divFilme.id = filmes[x].id;
        img.src = filmes[x].img
        p.textContent = filmes[x].descricao
        ano.textContent = filmes[x].ano
        direcao.textContent = filmes[x].direcao
        genero.textContent = filmes[x].genero
        valor.textContent = filmes[x].valor
        botaoCarrinho.textContent = "Adicionar ao carrinho"

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