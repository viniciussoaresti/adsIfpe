import { dbPromise } from "./db.js";

async function alimentarTabelaFilmes() {
    const db = await dbPromise;

    const filmes = [
        {
            id: "filme-0",
            img: "https://4.bp.blogspot.com/-GW1Ex5rl1o8/VMG9B8zuM2I/AAAAAAAAQ-A/PdXFAKUlN2c/s1600/somaoredor1.jpeg",
            titulo: "O Som ao redor",
            descricao:
                "O Som ao Redor começa com a chegada de uma milícia...",
            ano: 2013,
            direcao: "Kleber Mendonça",
            genero: "Suspense, Drama",
            valor: 3.0
        },
        {
            id: "filme-1",
            img: "https://upload.wikimedia.org/wikipedia/pt/2/29/Central_do_Brasil_poster.jpg",
            titulo: "Central do Brasil",
            descricao:
                "Dora, uma ex-professora que escreve cartas...",
            ano: 1998,
            direcao: "Walter Salles",
            genero: "Drama",
            valor: 4.5
        },
        {
            id: "filme-2",
            img: "https://upload.wikimedia.org/wikipedia/pt/thumb/1/10/CidadedeDeus.jpg/220px-CidadedeDeus.jpg",
            titulo: "Cidade de Deus",
            descricao:
                "Nos anos 1960, a favela é um complexo habitacional...",
            ano: 2002,
            direcao: "Fernando Meirelles",
            genero: "Drama, Ação",
            valor: 3.5
        },
        {
            id: "filme-3",
            img: "https://upload.wikimedia.org/wikipedia/pt/thumb/2/2a/TropaDeElitePoster.jpg/250px-TropaDeElitePoster.jpg",
            titulo: "Tropa de Elite",
            descricao:
                "Os acontecimentos do filme são narrados em primeira pessoa...",
            ano: 2007,
            direcao: "José Padilha",
            genero: "Drama, Policial",
            valor: 4.99
        }
    ];

    for (const filme of filmes) {
        await db.run(
            `INSERT INTO filmes (id, img, titulo, descricao, ano, direcao, genero, valor)
             VALUES (?, ?, ?, ?, ?, ?, ?, ?)`,
            [
                filme.id,
                filme.img,
                filme.titulo,
                filme.descricao,
                filme.ano,
                filme.direcao,
                filme.genero,
                filme.valor
            ]
        );
    }
}

function inseridoComSucesso() {
    console.log("Filmes inseridos com sucesso");
}

alimentarTabelaFilmes().then(inseridoComSucesso);