# Variance and Standard Deviation

A Java console application for calculating the arithmetic mean, population variance, sample variance, and standard deviation from a user-provided dataset.

![Java](https://img.shields.io/badge/Language-Java-orange)
![Application](https://img.shields.io/badge/Type-Console%20Application-blue)
![Statistics](https://img.shields.io/badge/Topic-Descriptive%20Statistics-green)

[Português Brasileiro](#português-brasileiro) | [English](#english)

---

# Português Brasileiro

## Índice

- [Sobre o projeto](#sobre-o-projeto)
- [Objetivos](#objetivos)
- [Funcionalidades](#funcionalidades)
- [Capturas de tela](#capturas-de-tela)
- [Demonstração em vídeo](#demonstração-em-vídeo)
- [Tecnologias utilizadas](#tecnologias-utilizadas)
- [Fórmulas estatísticas](#fórmulas-estatísticas)
- [Estrutura do projeto](#estrutura-do-projeto)
- [Requisitos](#requisitos)
- [Download do projeto](#download-do-projeto)
- [Instalação e execução](#instalação-e-execução)
- [Exemplo de utilização](#exemplo-de-utilização)
- [Testes e limitações](#testes-e-limitações)
- [Autor](#autor)
- [Licença](#licença)

## Sobre o projeto

O Variance and Standard Deviation é uma aplicação de linha de comando desenvolvida em Java para calcular medidas estatísticas descritivas a partir de um conjunto de valores numéricos fornecidos pelo usuário.

O programa permite analisar a dispersão dos dados em relação à média e compreender a diferença entre tratar os valores como uma população completa ou como uma amostra.

O projeto também demonstra conceitos fundamentais de programação Java, incluindo arrays, estruturas de repetição, métodos, entrada de dados, validação de informações e operações matemáticas.

## Objetivos

- Implementar cálculos estatísticos utilizando Java.
- Comparar variância e desvio padrão populacionais e amostrais.
- Demonstrar a aplicação prática de conceitos de estatística descritiva.
- Organizar cálculos em métodos reutilizáveis.
- Validar entradas fornecidas pelo usuário em uma aplicação de terminal.

## Funcionalidades

- Leitura de uma quantidade de valores definida pelo usuário.
- Entrada de números inteiros, decimais, positivos e negativos.
- Cálculo da média aritmética.
- Cálculo da variância populacional.
- Cálculo da variância amostral.
- Cálculo do desvio padrão populacional.
- Cálculo do desvio padrão amostral.
- Seleção entre população e amostra.
- Validação da quantidade de valores e das entradas numéricas.
- Exibição dos resultados com quatro casas decimais.
- Aviso quando não existem valores suficientes para calcular as estatísticas amostrais.

## Capturas de tela

As capturas de tela reais ainda não estão disponíveis nos materiais apresentados nesta conversa. Portanto, nenhuma imagem fictícia é utilizada nesta seção.

Para adicionar imagens reais ao repositório:

1. Baixe o projeto, compile e execute a aplicação conforme as instruções abaixo.
2. Capture a tela inicial do programa, mostrando o título e a solicitação dos valores.
3. Capture uma execução completa com os dados `2`, `4`, `6` e `8`, incluindo a seleção do tipo de conjunto e os resultados.
4. Salve as imagens em formato PNG com nomes descritivos, por exemplo:
   - `variance-standard-deviation-console.png`
   - `variance-standard-deviation-results.png`
5. Na página do repositório no GitHub, utilize **Add file → Create new file** para criar o caminho `docs/screenshots/.gitkeep`. Confirme a criação do arquivo.
6. Depois, utilize **Add file → Upload files** para enviar as imagens para a pasta `docs/screenshots/`.
7. Após o envio, substitua esta seção pelas imagens utilizando os caminhos relativos correspondentes.

Exemplo de Markdown para utilizar depois que as imagens estiverem publicadas:

```markdown
![Execução do programa](docs/screenshots/variance-standard-deviation-console.png)

*Execução da aplicação no terminal.*

![Resultados estatísticos](docs/screenshots/variance-standard-deviation-results.png)

*Resultados calculados para o conjunto de dados informado.*
```

As imagens somente devem ser consideradas disponíveis depois de serem enviadas ao repositório e verificadas na página do README.

## Demonstração em vídeo

Nenhum vídeo de demonstração foi disponibilizado nos materiais analisados.

Para produzir uma demonstração real:

1. Abra um terminal na pasta do projeto.
2. Compile e execute o programa.
3. Informe quatro valores: `2`, `4`, `6` e `8`.
4. Selecione a opção `1` para demonstrar os resultados populacionais.
5. Mostre os resultados calculados e, se desejar, repita a execução selecionando a opção `2` para demonstrar os resultados amostrais.
6. Grave a tela utilizando uma ferramenta compatível com seu sistema operacional, como OBS Studio ou o gravador de tela disponível no ambiente.
7. Salve a gravação e publique-a em um serviço de vídeo acessível ou disponibilize um arquivo de vídeo por um serviço de armazenamento com link de acesso adequado.
8. Depois de confirmar que o vídeo está acessível, adicione o link nesta seção.

Modelo para preencher após a publicação:

```markdown
[Assistir à demonstração do projeto](URL_REAL_DO_VIDEO)
```

O endereço acima é apenas um modelo de formatação, não um link de vídeo existente.

## Tecnologias utilizadas

- **Java:** linguagem utilizada na implementação da aplicação.
- **Java Standard Library:** recursos nativos para entrada de dados, operações matemáticas, arrays e formatação da saída.
- **JDK:** ferramentas necessárias para compilar e executar o programa.

Não são utilizadas bibliotecas estatísticas externas no código apresentado.

## Fórmulas estatísticas

### Média aritmética

A média corresponde à soma dos valores dividida pela quantidade de observações.

\[
\bar{x}=\frac{\sum_{i=1}^{n}x_i}{n}
\]

### Variância populacional

Mede a média dos quadrados das diferenças entre cada valor e a média populacional.

\[
\sigma^2=\frac{\sum_{i=1}^{N}(x_i-\mu)^2}{N}
\]

### Variância amostral

Utiliza a soma dos quadrados das diferenças dividida pelo tamanho da amostra menos um.

\[
s^2=\frac{\sum_{i=1}^{n}(x_i-\bar{x})^2}{n-1}
\]

### Desvio padrão

O desvio padrão é a raiz quadrada da variância correspondente.

\[
\sigma=\sqrt{\sigma^2}
\qquad
s=\sqrt{s^2}
\]

A variância é expressa em unidades quadráticas, enquanto o desvio padrão mantém a mesma unidade dos dados originais.

## Estrutura do projeto

A estrutura apresentada na conversa é:

```text
variance-standard-deviation/
├── src/
│   └── Main.java
├── .gitignore
└── README.md
```

| Arquivo | Finalidade |
|---|---|
| `src/Main.java` | Contém a aplicação, a entrada de dados, os cálculos estatísticos e a apresentação dos resultados. |
| `.gitignore` | Define arquivos e diretórios que não devem ser incluídos no controle de versão. |
| `README.md` | Documentação do projeto. |

A pasta `docs/screenshots/` poderá ser adicionada ao repositório quando as capturas de tela reais forem produzidas.

## Requisitos

- Um Java Development Kit (JDK) compatível com o código.
- Acesso a um terminal ou prompt de comando.
- Os arquivos do projeto extraídos em uma pasta local.

O código apresentado utiliza recursos disponíveis a partir do Java 8. Uma versão atual e compatível do JDK é recomendada.

Para verificar a instalação, execute:

```bash
java -version
javac -version
```

Os dois comandos devem identificar uma instalação funcional do Java.

## Download do projeto

Para baixar o projeto sem utilizar ferramentas de controle de versão:

1. Abra a página do repositório no GitHub.
2. Clique no botão **Code**.
3. Selecione **Download ZIP**.
4. Aguarde o download do arquivo.
5. Extraia o conteúdo do ZIP.
6. Abra a pasta extraída.
7. Confirme que os arquivos `src/Main.java` e `.gitignore` estão presentes.
8. Continue com as instruções de instalação e execução.

O endereço específico do repositório deste projeto não foi fornecido nesta conversa. A opção de download estará disponível quando os arquivos forem publicados em um repositório acessível.

## Instalação e execução

### Windows

1. Instale um JDK compatível, caso ainda não esteja instalado.
2. Abra o Prompt de Comando ou o PowerShell.
3. Entre na pasta extraída do projeto utilizando o comando `cd` e o caminho local correspondente.
4. Compile e execute:

```powershell
javac -d out src/Main.java
java -cp out Main
```

### macOS

1. Instale um JDK compatível.
2. Abra o Terminal.
3. Entre na pasta extraída do projeto.
4. Execute:

```bash
javac -d out src/Main.java
java -cp out Main
```

### Linux e Ubuntu

1. Verifique se o JDK está instalado com `java -version` e `javac -version`.
2. Caso necessário, instale um pacote JDK disponível nos repositórios da sua distribuição.
3. Abra o terminal na pasta extraída do projeto.
4. Execute:

```bash
javac -d out src/Main.java
java -cp out Main
```

Em sistemas baseados em Ubuntu, a instalação pode ser realizada pelo gerenciador de pacotes. Por exemplo, em uma instalação compatível com APT:

```bash
sudo apt update
sudo apt install default-jdk
```

O pacote disponível e a versão instalada dependem da distribuição e de seus repositórios configurados.

### Como funciona a execução

O primeiro comando compila `Main.java` e coloca os arquivos compilados no diretório `out/`. O segundo inicia a aplicação utilizando esse diretório como caminho de classes.

O diretório `out/` é gerado durante a compilação e está previsto no `.gitignore` apresentado.

Não é necessário instalar bibliotecas estatísticas externas.

## Exemplo de utilização

Considere o conjunto de valores:

```text
2, 4, 6, 8
```

A média é `5`.

Os resultados estatísticos esperados são:

| Estatística | Resultado |
|---|---:|
| Média | 5.0000 |
| Variância populacional | 5.0000 |
| Desvio padrão populacional | 2.2361 |
| Variância amostral | 6.6667 |
| Desvio padrão amostral | 2.5820 |

Esses valores são resultados matemáticos calculados para o conjunto de exemplo, e não uma alegação de execução de testes automatizados.

Para visualizar as estatísticas populacionais como interpretação selecionada, escolha `1`. Para visualizar as estatísticas amostrais como interpretação selecionada, escolha `2`.

## Testes e limitações

### Testes

Não foi apresentado um conjunto de testes automatizados na estrutura do projeto disponível nesta conversa.

Uma verificação manual pode ser feita compilando e executando a aplicação e comparando os resultados com o exemplo desta documentação.

Não há evidência suficiente para afirmar que uma suíte de testes automatizados tenha sido executada.

### Limitações conhecidas

- A aplicação funciona por linha de comando, sem interface gráfica.
- Os dados são informados manualmente durante a execução.
- Não há persistência de dados ou exportação de relatórios implementada no código apresentado.
- O projeto não inclui integração com bancos de dados ou bibliotecas estatísticas externas.
- O cálculo amostral exige pelo menos duas observações.

## Autor

**Israel Vitor**

GitHub: [@vitor1914](https://github.com/vitor1914)

## Licença

Uma licença específica não foi identificada nos arquivos apresentados. Portanto, este README não atribui uma licença ao projeto.

---

# English

## Table of Contents

- [About the Project](#about-the-project)
- [Objectives](#objectives)
- [Features](#features)
- [Screenshots](#screenshots)
- [Video Demonstration](#video-demonstration)
- [Technologies](#technologies)
- [Statistical Formulas](#statistical-formulas)
- [Project Structure](#project-structure)
- [Requirements](#requirements)
- [Download the Project](#download-the-project)
- [Installation and Execution](#installation-and-execution)
- [Usage Example](#usage-example)
- [Tests and Limitations](#tests-and-limitations)
- [Author](#author)
- [License](#license)

## About the Project

Variance and Standard Deviation is a Java command-line application that calculates descriptive statistical measures from a set of numeric values provided by the user.

The program analyzes how data values are distributed around the mean and demonstrates the difference between treating a dataset as an entire population or as a sample.

The project also demonstrates fundamental Java programming concepts, including arrays, loops, methods, user input, input validation, and mathematical operations.

## Objectives

- Implement statistical calculations using Java.
- Compare population and sample variance and standard deviation.
- Demonstrate practical applications of descriptive statistics.
- Organize calculations into reusable methods.
- Validate user input in a command-line application.

## Features

- Read a user-defined number of observations.
- Accept positive, negative, integer, and decimal values.
- Calculate the arithmetic mean.
- Calculate population variance.
- Calculate sample variance.
- Calculate population standard deviation.
- Calculate sample standard deviation.
- Select between population and sample interpretations.
- Validate the number of observations and numeric input.
- Display results with four decimal places.
- Notify the user when there are insufficient observations for sample statistics.

## Screenshots

Real screenshots have not been provided in the materials available in this conversation. Therefore, this section does not contain fictional images.

To add actual screenshots to the repository:

1. Download, compile, and run the application using the instructions below.
2. Capture the program's initial screen, including the title and input prompts.
3. Capture a complete execution using the values `2`, `4`, `6`, and `8`, including the dataset selection and calculated results.
4. Save the images in PNG format with descriptive filenames, for example:
   - `variance-standard-deviation-console.png`
   - `variance-standard-deviation-results.png`
5. On the GitHub repository page, select **Add file → Create new file** and create the path `docs/screenshots/.gitkeep`. Confirm the new file.
6. Then select **Add file → Upload files** to upload the images to `docs/screenshots/`.
7. After uploading the files, replace this section with the images using their corresponding relative paths.

Example Markdown to use after the images have been published:

```markdown
![Program execution](docs/screenshots/variance-standard-deviation-console.png)

*Application running in the terminal.*

![Statistical results](docs/screenshots/variance-standard-deviation-results.png)

*Calculated results for the provided dataset.*
```

The images should only be considered available after they have been uploaded to the repository and verified on the README page.

## Video Demonstration

No demonstration video was provided in the materials reviewed.

To record an actual demonstration:

1. Open a terminal in the project directory.
2. Compile and run the application.
3. Enter four values: `2`, `4`, `6`, and `8`.
4. Select option `1` to demonstrate population statistics.
5. Show the calculated results and, if desired, run the application again and select option `2` to demonstrate sample statistics.
6. Record your screen using a tool compatible with your operating system, such as OBS Studio or the screen recorder available in your environment.
7. Save the recording and publish it through an accessible video service or provide a suitable public link to a video file.
8. After confirming that the video is accessible, add its link to this section.

Template to complete after publication:

```markdown
[Watch the project demonstration](ACTUAL_VIDEO_URL)
```

The address above is only a formatting template, not an existing video link.

## Technologies

- **Java:** the programming language used to implement the application.
- **Java Standard Library:** native functionality for input, mathematical operations, arrays, and output formatting.
- **JDK:** the tools required to compile and run the program.

The presented code does not use external statistical libraries.

## Statistical Formulas

### Arithmetic Mean

The mean is the sum of all observations divided by the number of observations.

\[
\bar{x}=\frac{\sum_{i=1}^{n}x_i}{n}
\]

### Population Variance

Population variance measures the average squared deviation of each value from the population mean.

\[
\sigma^2=\frac{\sum_{i=1}^{N}(x_i-\mu)^2}{N}
\]

### Sample Variance

Sample variance divides the sum of squared deviations by the sample size minus one.

\[
s^2=\frac{\sum_{i=1}^{n}(x_i-\bar{x})^2}{n-1}
\]

### Standard Deviation

Standard deviation is the square root of the corresponding variance.

\[
\sigma=\sqrt{\sigma^2}
\qquad
s=\sqrt{s^2}
\]

Variance is expressed in squared units, whereas standard deviation uses the same unit as the original data.

## Project Structure

The structure presented in this conversation is:

```text
variance-standard-deviation/
├── src/
│   └── Main.java
├── .gitignore
└── README.md
```

| File | Purpose |
|---|---|
| `src/Main.java` | Contains the application, input handling, statistical calculations, and result presentation. |
| `.gitignore` | Specifies files and directories that should not be included in version control. |
| `README.md` | Project documentation. |

The `docs/screenshots/` directory may be added when actual screenshots are created.

## Requirements

- A Java Development Kit (JDK) compatible with the code.
- Access to a terminal or command prompt.
- The project files extracted into a local directory.

The code presented uses features available since Java 8. A current, compatible JDK is recommended.

To verify the installation, run:

```bash
java -version
javac -version
```

Both commands should identify a working Java installation.

## Download the Project

To download the project without using version-control tools:

1. Open the project's GitHub repository page.
2. Click the **Code** button.
3. Select **Download ZIP**.
4. Wait for the file to download.
5. Extract the ZIP archive.
6. Open the extracted directory.
7. Confirm that `src/Main.java` and `.gitignore` are present.
8. Continue with the installation and execution instructions.

The specific repository URL for this project was not provided in this conversation. The download option will be available once the files have been published in an accessible repository.

## Installation and Execution

### Windows

1. Install a compatible JDK if it is not already installed.
2. Open Command Prompt or PowerShell.
3. Navigate to the extracted project directory using `cd` and the appropriate local path.
4. Compile and run the application:

```powershell
javac -d out src/Main.java
java -cp out Main
```

### macOS

1. Install a compatible JDK.
2. Open Terminal.
3. Navigate to the extracted project directory.
4. Run:

```bash
javac -d out src/Main.java
java -cp out Main
```

### Linux and Ubuntu

1. Check whether the JDK is installed using `java -version` and `javac -version`.
2. If necessary, install a JDK package available through your distribution's repositories.
3. Open a terminal in the extracted project directory.
4. Run:

```bash
javac -d out src/Main.java
java -cp out Main
```

On Ubuntu-based systems, installation can be performed through the package manager. For example, on a compatible APT-based installation:

```bash
sudo apt update
sudo apt install default-jdk
```

The available package and installed version depend on the distribution and its configured repositories.

### How Execution Works

The first command compiles `Main.java` and places the compiled files in the `out/` directory. The second command starts the application using that directory as its classpath.

The `out/` directory is generated during compilation and is covered by the `.gitignore` presented with the project.

No external statistical libraries are required.

## Usage Example

Consider the following dataset:

```text
2, 4, 6, 8
```

The mean is `5`.

The expected statistical results are:

| Statistic | Result |
|---|---:|
| Mean | 5.0000 |
| Population variance | 5.0000 |
| Population standard deviation | 2.2361 |
| Sample variance | 6.6667 |
| Sample standard deviation | 2.5820 |

These are mathematical results calculated for the example dataset, not a claim that automated tests have been executed.

Choose `1` to select population statistics as the main interpretation or `2` to select sample statistics.

## Tests and Limitations

### Tests

No automated test suite was included in the project structure available in this conversation.

A manual verification can be performed by compiling and running the application and comparing its output with the example in this documentation.

There is insufficient evidence to claim that an automated test suite has been executed.

### Known Limitations

- The application runs in the command line and has no graphical user interface.
- Data must be entered manually during execution.
- The presented code does not implement data persistence or report export.
- The project does not integrate with databases or external statistical libraries.
- Sample calculations require at least two observations.

## Author

**Israel Vitor**

GitHub: [@vitor1914](https://github.com/vitor1914)

## License

A specific license was not identified in the files presented. Therefore, this README does not assign a license to the project.
