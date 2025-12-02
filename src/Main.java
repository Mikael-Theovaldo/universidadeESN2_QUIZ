import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Questao> questao = new ArrayList<>();

        int acertos = 0;
        float porcentagem = 0;

        Questao q1 = new Questao();
        q1.setPergunta("1. O que é hardware?");
        q1.setOpcaoA("A) Programas de computador");
        q1.setOpcaoB("B) Parte física do computador");
        q1.setOpcaoC("C) Aplicativos móveis");
        q1.setOpcaoD("D) Sistema operacional");
        q1.setOpcaoE("E) Internet");
        q1.setCorreta("B");
        questao.add(q1);

        Questao q2 = new Questao();
        q2.setPergunta("2. Qual é a função principal do sistema operacional?");
        q2.setOpcaoA("A) Criar documentos");
        q2.setOpcaoB("B) Proteger contra vírus");
        q2.setOpcaoC("C) Gerenciar recursos do computador");
        q2.setOpcaoD("D) Aumentar a velocidade da internet");
        q2.setOpcaoE("E) Reproduzir vídeos");
        q2.setCorreta("C");
        questao.add(q2);

        Questao q3 = new Questao();
        q3.setPergunta("3. O que significa a sigla CPU?");
        q3.setOpcaoA("A) Central de Programas Úteis");
        q3.setOpcaoB("B) Computador Pessoal Único");
        q3.setOpcaoC("C) Processador de Dados");
        q3.setOpcaoD("D) Unidade de Controle de Programas");
        q3.setOpcaoE("E) Unidade Central de Processamento");
        q3.setCorreta("E");
        questao.add(q3);

        Questao q4 = new Questao();
        q4.setPergunta("4. Qual dispositivo é usado para entrada de dados?");
        q4.setOpcaoA("A) Monitor");
        q4.setOpcaoB("B) Impressora");
        q4.setOpcaoC("C) Teclado");
        q4.setOpcaoD("D) Caixa de som");
        q4.setOpcaoE("E) Pen drive");
        q4.setCorreta("C");
        questao.add(q4);

        Questao q5 = new Questao();
        q5.setPergunta("5. Qual é a função de um antivírus?");
        q5.setOpcaoA("A) Proteger contra softwares maliciosos");
        q5.setOpcaoB("B) Criar senhas seguras");
        q5.setOpcaoC("C) Aumentar o desempenho do computador");
        q5.setOpcaoD("D) Atualizar o sistema operacional");
        q5.setOpcaoE("E) Melhorar a qualidade da imagem");
        q5.setCorreta("A");
        questao.add(q5);

        Questao q6 = new Questao();
        q6.setPergunta("6. O que é software?");
        q6.setOpcaoA("A) Parte física do computador");
        q6.setOpcaoB("B) Conjunto de cabos e conexões");
        q6.setOpcaoC("C) Programas e aplicativos");
        q6.setOpcaoD("D) Equipamentos de rede");
        q6.setOpcaoE("E) Componentes eletrônicos");
        q6.setCorreta("C");
        questao.add(q6);

        Questao q7 = new Questao();
        q7.setPergunta("7. Qual é a unidade de medida de armazenamento?");
        q7.setOpcaoA("A) Hertz");
        q7.setOpcaoB("B) Pixel");
        q7.setOpcaoC("C) Volt");
        q7.setOpcaoD("D) Byte");
        q7.setOpcaoE("E) Ampere");
        q7.setCorreta("D");
        questao.add(q7);

        Questao q8 = new Questao();
        q8.setPergunta("8. O que é a nuvem ?");
        q8.setOpcaoA("A) Um tipo de vírus");
        q8.setOpcaoB("B) Um sistema de refrigeração");
        q8.setOpcaoC("C) Armazenamento remoto de dados");
        q8.setOpcaoD("D) Um navegador de internet");
        q8.setOpcaoE("E) Um tipo de cabo de rede");
        q8.setCorreta("C");
        questao.add(q8);

        Questao q9 = new Questao();
        q9.setPergunta("9. Qual é a função do navegador de internet?");
        q9.setOpcaoA("A) Acessar sites e conteúdos online");
        q9.setOpcaoB("B) Proteger contra hackers");
        q9.setOpcaoC("C) Criar páginas web");
        q9.setOpcaoD("D) Editar imagens");
        q9.setOpcaoE("E) Gerenciar arquivos locais");
        q9.setCorreta("A");
        questao.add(q9);

        Questao q10 = new Questao();
        q10.setPergunta("10. O que é Wi-Fi?");
        q10.setOpcaoA("A) Um tipo de cabo de rede");
        q10.setOpcaoB("B) Um programa de edição");
        q10.setOpcaoC("C) Conexão sem fio à internet");
        q10.setOpcaoD("D) Um antivírus");
        q10.setOpcaoE("E) Um sistema operacional");
        q10.setCorreta("C");
        questao.add(q10);

        Questao q11 = new Questao();
        q11.setPergunta("11. Qual é a função de uma impressora?");
        q11.setOpcaoA("A) Digitalizar documentos");
        q11.setOpcaoB("B) Exibir imagens");
        q11.setOpcaoC("C) Reproduzir áudio");
        q11.setOpcaoD("D) Imprimir documentos");
        q11.setOpcaoE("E) Armazenar arquivos");
        q11.setCorreta("D");
        questao.add(q11);

        Questao q12 = new Questao();
        q12.setPergunta("12. Qual dos itens abaixo é um exemplo de software?");
        q12.setOpcaoA("A) Mouse");
        q12.setOpcaoB("B) Windows");
        q12.setOpcaoC("C) Monitor");
        q12.setOpcaoD("D) Teclado");
        q12.setOpcaoE("E) Placa-mãe");
        q12.setCorreta("B");
        questao.add(q12);

        Questao q13 = new Questao();
        q13.setPergunta("13. O que é um arquivo PDF?");
        q13.setOpcaoA("A) Um tipo de imagem");
        q13.setOpcaoB("B) Um vídeo compactado");
        q13.setOpcaoC("C) Um formato de documento portátil");
        q13.setOpcaoD("D) Um programa de edição");
        q13.setOpcaoE("E) Um sistema de segurança");
        q13.setCorreta("C");
        questao.add(q13);

        Questao q14 = new Questao();
        q14.setPergunta("14. Qual é a função do Excel?");
        q14.setOpcaoA("A) Criar apresentações");
        q14.setOpcaoB("B) Editar vídeos");
        q14.setOpcaoC("C) Navegar na internet");
        q14.setOpcaoD("D) Criar planilhas e cálculos");
        q14.setOpcaoE("E) Reproduzir músicas");
        q14.setCorreta("D");
        questao.add(q14);

        Questao q15 = new Questao();
        q15.setPergunta("15. O que é um pendrive?");
        q15.setOpcaoA("A) Um tipo de software");
        q15.setOpcaoB("B) Um antivírus portátil");
        q15.setOpcaoC("C) Um dispositivo de armazenamento");
        q15.setOpcaoD("D) Um programa de backup");
        q15.setOpcaoE("E) Um cabo de rede");
        q15.setCorreta("C");
        questao.add(q15);

        for (Questao q: questao){
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) acertos++;
        }

        porcentagem = (float) (acertos * 100) / 15;

        System.out.println("Acertos: "+ acertos + " de 15");
        System.out.printf("Porcentagem de acertos :  %.2f%%%n",porcentagem);






    }
}

