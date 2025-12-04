# Sumário: <!-- omit in toc -->

- [Creative Integration Suite](#creative-integration-suite)
  - [Descrição:](#descrição)
  - [Versão atual:](#versão-atual)
  - [Equipe de desenvolvimento:](#equipe-de-desenvolvimento)
  - [Problemática:](#problemática)
  - [Justificativa:](#justificativa)
  - [Requisitos:](#requisitos)
    - [Requisitos Funcionais:](#requisitos-funcionais)
    - [Requisitos Não Funcionais:](#requisitos-não-funcionais)
    - [Diagrama de casos de uso:](#diagrama-de-casos-de-uso)
  - [Solução:](#solução)
  - [Conclusão:](#conclusão)
  - [Notas adicionais:](#notas-adicionais)

# Creative Integration Suite

Conceito de Software as a Service no eixo de Content Management Systems.

Minha pretensão é tomá-lo como possível TCC (Trabalho de Conclusão de Curso), após devidas investigações e leituras.

Inclusive, há um rascunho atual do mesmo [aqui](https://github.com/vinisoaresti/adsIfpe/blob/master/semester3/scientificMethodology/myAnswers/atividade8.pdf).

## Descrição:

Um SaaS que automatiza fluxos de ideação, desenvolvimento, correção e lançamento de conteúdo em agências de marketing, possibilitando deploy on-premise, híbrido ou em cloud.

Na primeira versão, que é o primeiro projeto da disciplina de Programação para Web 1 do curso, o escopo conta com planos free, starter e premium, e com páginas estáticas em HTML e CSS.

Os requerimentos para essa versão são encontrados [aqui](https://github.com/vinisoaresti/adsIfpe/blob/master/semester3/webProgramming1/Projeto01.pdf).

## Versão atual:

Disponível ao vivo [aqui](https://creatis2025.netlify.app/).

Prazo para entrega final da versão 1 (html+css básico): 27/10/2025, 23h59.

## Equipe de desenvolvimento:

1. [Vinícius Soares](https://github.com/vinisoaresti) as Vini: Designer e Desenvolvedor;
2. [Beatriz Moura](https://github.com/beatrijz) as Bia: Designer e Desenvolvedora.

## Problemática:

Há muito trabalho manual para coletar as solicitações dos clientes nessas empresas, passar para os designers e manter o histórico disso, devolver para o cliente aprovar ou não, agendar ou publicar em redes sociais, e mais.

Além de falta de padronização nas artes, o gerenciamento do armazenamento em nuvem em alguns casos desrespeitando a LGPD.

Dentre as funcionalidades do sistema: receber e automatizar grande parte desses processos via Whatsapp, com integração com o software de gestão Asana, interação com o Photoshop para correção de erros simples (incremental), API’s de redes sociais, armazenamento em nuvem, etc.

## Justificativa:

Ainda precisamos comparar soluções já existentes no mercado, e validar a necessidade das funcionalidades na rotina nas empresas, talvez “cortando” coisas não tão relevantes no início, iterar e testar bastante para ter um produto sólido.

Além disso, elencar os diferenciais da solução, como o fato de ser open source, modular, customizável, poder ter hospedagem baseada em on-premise, cloud ou modelos híbridos, com tutoriais para usuários "leigos" hospedarem, tanto como para desenvolvedores.

## Requisitos:

### Requisitos Funcionais:

TODO (nas próximas versões do desenvolvimento).

### Requisitos Não Funcionais:

TODO (nas próximas versões do desenvolvimento).

### Diagrama de casos de uso:

TODO (nas próximas versões do desenvolvimento).

## Solução:

Para a versão 1, temos:

1. [Prototipagem no Figma](https://www.figma.com/design/rrINkzEwovsPX4bpzixcIY/CreatIS---Creative-Integration-Suite?node-id=0-1&t=smgW1O21s9hBELSK-1) com identidade visual e design das telas (Vini);

2. Estruturação em HTML e estilização em CSS, com respectivas autorias:

   1. Home, por Vini;
   2. Preços e Planos, por Bia;
   3. Cadastro, por Bia;
   4. Login, por Bia;
   5. Dashboard, por Vini.

3. Deploy via GitHub Pages, com uso do GitHub Actions para build e deploy a cada commit (Vini).

Nas demais versões, as metas são:

- Versão 2: Integração simples com backend;

- Versão 3: Investigação maior no tema do trabalho, documentações necessárias, requisitos, e planejamento do projeto como um todo (documento de colaboração, roadmap das versões, uso do SCRUM, uso de Issues e GitHub Projects);

- Versão 4: Reformulação com uso de bibliotecas/frameworks no frontend, com desenvolvimento das demais páginas necessárias, documentação da arquitetura, e modo escuro;

- Versão 5: Reformulação com uso de bibliotecas/frameworks no backend, e documentação da arquitetura.

## Conclusão:

Além dos resultados discutidos por meio da apresentação feita no [Canva](https://www.canva.com/design/DAG1UDMKMog/laOh2ggYk30vNf5_ldJuaQ/edit?utm_content=DAG1UDMKMog&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton):

1. TODO.

Também podemos considerar:

2. TODO.

Trazendo então a completude da primeira versão do projeto.

## Notas adicionais:

1. Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes;

2. Contribuições são bem-vindas! Por favor, leia o arquivo [CONTRIBUTING (TODO)](CONTRIBUTING.md) para detalhes sobre nosso código de conduta e o processo para enviar pull requests;

3. Durante a preparação deste trabalho, os autores utilizaram do Google Gemini e do GitHub Copilot, versões 2.5 pro e 1.380.1802 (especificamente do Visual Studio Code) respectivamente, para elaborar a identidade visual inicial e acelerar o processo de desenvolvimento com sugestões de código ou de escrita nas documentações. Após o uso destes modelos, os autores revisaram e editaram o conteúdo em conformidade com as necessidades acadêmicas e demais diretrizes base, e assumem total responsabilidade pelo conteúdo do repositório.

4. Também foram usados:
   - Fontes Roboto e Roboto flex, do Google Fonts;
   - Ícones do Flaticon, Flatart_icons, Boostrap icons e Freepik;
   - Marcas referentes às integrações como Whatsapp, Meta, Photoshop, etc.

Total crédito aos criadores e detentores dos direitos autorais.
