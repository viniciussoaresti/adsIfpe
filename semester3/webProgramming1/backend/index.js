import express from 'express'

import filmes from './routes/filmes.js'

import { dbPromise } from './db/db.js'

const app = express()

app.use(express.static('frontend/'))

app.get('/api', funcaoHelloWorld)

app.get('/filmes', funcaoObterFilmes)

app.listen(3000, funcaoIniciar)

async function funcaoObterFilmes(requisicao, resposta) {
    const db = await dbPromise;
    const filmes = await db.all('SELECT * FROM filmes');
    return resposta.json(filmes)
}

function funcaoIniciar() {
    console.log("Aplicação executando na porta 3000...")
}

function funcaoHelloWorld(requisicao, resposta) {
    return resposta.json({ mensagem: "Olá, mundo" })
}