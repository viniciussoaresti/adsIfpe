const mainDiv = document.querySelector('div');

const students = [
    { name: "João", grade: 8.5 },
    { name: "Maria", grade: 7.5 },
    { name: "Alice", grade: 4 },
    { name: "Bob", grade: 1.5 },
    { name: "Eduardo", grade: 10 }
];

const generateStudentElement = function (student) {
    //Manual
    /* const studentDiv = document.createElement("div");
    const name = document.createElement("p");
    name.innerText = `Aluno: ${student.name}`;
    const grade = document.createElement("p");
    grade.innerText = `Nota: ${student.grade}`;
    const status = document.createElement("p");
    status.innerText = `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}`;
    studentDiv.append(name, grade, status);
    return studentDiv; */
    //Teste
    /* const studentElement = document.createElement("div");
    const childElements = [
        Object.assign(document.createElement("p"), { innerText: `Aluno: ${student.name}` }),
        Object.assign(document.createElement("p"), { innerText: `Nota: ${student.grade}` }),
        Object.assign(document.createElement("p"), { innerText: `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}` })
    ];
    studentElement.append(childElements);
    console.log(studentElement);
    return studentElement; */
    //Código 1
    /* console.log(
        Object.assign(document.createElement("p"), { innerText: `Aluno: ${student.name}` }),
        Object.assign(document.createElement("p"), { innerText: `Nota: ${student.grade}` }),
        Object.assign(document.createElement("p"), { innerText: `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}` })
    );
    return Object.assign(document.createElement("div"),
        Object.assign(document.createElement("p"), { innerText: `Aluno: ${student.name}` }),
        Object.assign(document.createElement("p"), { innerText: `Nota: ${student.grade}` }),
        Object.assign(document.createElement("p"), { innerText: `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}` })
    ); */
    //Código 2
    /* const studentElement = document.createElement("div");
    const childElements = [
        Object.assign(document.createElement("p").innerText = `Aluno: ${student.name}`),
        Object.assign(document.createElement("p").innerText = `Nota: ${student.grade}`),
        Object.assign(document.createElement("p").innerText = `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}`)
    ];
    studentElement.append(childElements);
    console.log(studentElement);
    return studentElement; */
    //Código 3
    /* const studentElement = document.createElement("div");
    const childElements = [
        Object.assign(document.createElement("p"),
            { 'innerText': `Aluno: ${student.name}` }),
        Object.assign(document.createElement("p"),
            { 'innerText': `Nota: ${student.grade}` }),
        Object.assign(document.createElement("p"),
            { 'innerText': `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}` })
    ];
    studentElement.append(...childElements);
    return studentElement; */
    //Código 4
    let studentElement = document.createElement("div");
    studentElement.append(
        Object.assign(document.createElement("p"),
            { 'innerText': `Aluno: ${student.name}` }),
        Object.assign(document.createElement("p"),
            { 'innerText': `Nota: ${student.grade}` }),
        Object.assign(document.createElement("p"),
            { 'innerText': `Status: ${student.grade >= 7 ? "Aprovado" : "Reprovado"}` })
    );
    return studentElement;
};

students.forEach(student => {
    mainDiv.append(generateStudentElement(student));
});