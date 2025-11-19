/* TODO: Criar lista ordenada e adicionar ao DOM, e cada elemento da
lista animais como item de lista */
const body = document.querySelector('body');
const animais = ["Abelha", "Besouro", "Cachorro", "Dromedário"];
const ol = document.createElement('ol');
for (let i = 0; i < animais.length; i++) {
    const li = document.createElement('li');
    li.textContent = animais[i];
    ol.appendChild(li);
}
body.appendChild(ol);