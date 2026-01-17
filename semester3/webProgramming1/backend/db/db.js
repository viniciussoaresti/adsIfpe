import { open } from 'sqlite'
import sqlite3 from 'sqlite3'

const dbPromise = open({
    filename: './filmes.db',
    driver: sqlite3.Database
})

async function criarTabela() {
    const db = await dbPromise;
    db.run(`
        CREATE TABLE IF NOT EXISTS filmes (
            id TEXT, 
            img TEXT,
            titulo TEXT,
            descricao TEXT,
            ano INTEGER,
            direcao TEXT,
            genero TEXT,
            valor REAL)
         `)
}

function executadoComSucesso() {
    console.log("BD criado com sucesso")
}

criarTabela().then(executadoComSucesso)

export { dbPromise };