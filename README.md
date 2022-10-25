# Diagrama do projeto.

![image](https://user-images.githubusercontent.com/44039603/197601703-a19b1f28-7344-455d-bb39-b4b77cbb37cd.png)

O projeto consiste na utilização da comunicação assincrona entre microserviços para simular uma plataforma de cursos, como exemplo segue a construção dos microsserviços envolvendo a parte da cobrança.

# Fluxo do sistema:

## 1 - Aplicação api-registration
Cliente acessa app e se cadastra na plataforma, informa os dados pessoais a seguir:
- Nome
- CPF
- Data nascimento
- Email
- Celular
- Endereço (cidade, bairro, estado)

Após completar o cadastro pessoal a aplicação api-registration recebe a formas de pagamentos disponíveis da api-payment-method.
- Débito
- PIX
- Cartão crédito (parcelas a definir)

## 2 - Aplicação app-validation-finance 
Faz as validações referente aos dados informados para pagamento, e posteriomente realiza a cobrança juntamente a um parceiro externo (api-charges)
que retorna se o pagamento foi efetuado com sucesso ou não, após isso envia ao tópico topic-charge.

Após isso a app-finance recebe os dados da cobrança, com o retorno de sucesso ou de erro realiza os passos a seguir.
- Sucesso : Envia ao topic-approvved para liberação de acesso a plataforma para o cliente.
- Erro : Envia ao topic-rejected a rejeição da cobrança repassada pelo financeiro.

## 3 - Aplicação app-communication-client 
Envia ao cliente via email sobre o retorno da cobrança.
