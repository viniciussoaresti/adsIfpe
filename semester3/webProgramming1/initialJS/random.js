console.log("\nHello Worlde!");

let object = {
    name: "Vinicius",
    age: prompt("Digite sua idade:"),
    city: "Garanhuns"
}

let say = (message) => { console.log(message) };

object?.age >= 18 ? say("\nPode se acabar no metanol.") : say("\nSe safou.");

list = [1, 2, 3, 4, 5];

localStorage.setItem("list", list);

console.log("\nGot: " + localStorage.getItem("list"));

console.log(parseInt(object.age) + 2);