# Govbr Signature Integration

A api **Govbr Signature Integration** foi desenvolvida pelo [Felicilab](https://sus.ce.gov.br/felicilab/) com o intuito
de fazer a integração do sistema de assinaturas de documentos do [GOV.BR](https://www.gov.br/pt-br) com o Sistema Aberto
de Gestão Unificada (SAGU) da [Escola de Saúde Pública do Ceará (ESP/CE)](https://www.esp.ce.gov.br/).

Essa integração irá proporcionar a automação da assinatura digital dos certificados expedidos pela Escola de Saúde
Pública. Dessa forma, o **Felicilab** apoia a transformação digital nos processos de qualificação da força de trabalho
do SUS no Ceará.

## ❤ Conheça o Felicilab ❤

![cover](.github/imgs/logo-felicilab.png?style=flat)

Criado em fevereiro de 2020, o **Felicilab** - Laboratório de Inovação do SUS no Ceará - representa hoje, para além de
uma estrutura governamental, um **movimento**. Desde a origem, é inspirado pela emergência da Transformação Digital, o
potencial da Governança Colaborativa e o propósito da Felicidade. Desenvolvendo soluções inovadoras para a saúde
pública, mostrou-se uma estrutura essencial, deu respostas rápidas, efetivas e afetivas, para todo o Sistema de Saúde,
de forma aberta, colaborativa e sustentável.

Tudo isso, com base em processos de governança colaborativa voltados para a
transparência radical, apoiados em metodologias ágeis e que garantem a efetividade de nossas entregas.

## 🧰 Tecnologias usadas 🧰

<div>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="48px" />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="48px" />
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original-wordmark.svg" height="48px" />
</div>

## 🧪 Como testar 🧪

```shell
# Copiar arquivo de exemplo das variáveis de ambiente
cp .env.exemple .env
```

Em `env.exemple` temos as configurções necessárias para que a aplicação possa fazer as requsições para o ambiente de
staging.

Agora é só execultar o container com:

```shell
docker-compose up --build
```

## 🔥 Variáveis de ambiente usadas 🔥

Descrição das variáveis de ambiente que usamos nesse projeto:

- **REDIRECT_URI**: URL de redirecionamento usado para pela API do gov.br.
- **CLIENT_ID**: Identificador co cliente pela API do gov.br.
- **SECRET**: Segredo usado pela API do gov.br
- **SERVIDOR_OAUTH**: Caminho para o servidor OAUTH usado pela API do gov.br
- **ASSINATURA_API_URI**: URL para o caminho da api de assinatura digital.
- **SERVER_PORT**: Porta usada pela aplicação.
- **IMG_RUBRIC_SOURCE**: Caminho para a imagem da rúbrica que fica no projeto.
- **IMG_QR_CODE_SOURCE**: Caminho para a imagem do QR cde que fica no projeto.

As variáveis **REDIRECT_URI**, **CLIENT_ID**, **CLIENT_ID**, **SERVIDOR_OAUTH** e **ASSINATURA_API_URI** podem ser
melhor entendidas lendo
a [documentação de integração](https://manual-integracao-assinatura-eletronica.readthedocs.io/en/latest/iniciarintegracao.html)
. As outras variáveis são usadas como configurações obrigatórias desse projeto para configurar ambientes de homologação, produção e desenvolvimento.

> A partir daqui, use as regras contidas no manual de integraçao do gov.br para fazer a requisição para gerar o CODE (
> vide
> a documentação).

## 🚀 Links 🚀

- [Documentação da integração](https://manual-integracao-assinatura-eletronica.readthedocs.io/en/latest/iniciarintegracao.html)
- [Verificardor de homologação](https://verificador.staging.iti.br)