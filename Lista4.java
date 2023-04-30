import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Nome;
        int Idade;
        int porcentagem = 0;
        int tentativas = 0;

        System.out.println("Informe seu nome: ");
        Nome = scanner.nextLine();
        System.out.println("Indique a sua idade: ");
        Idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Seu cartão de vacina está em dia ?(S/N)");
        String Cartao = scanner.nextLine().toUpperCase();
        while (!Cartao.equalsIgnoreCase("S") && !Cartao.equalsIgnoreCase("N")) {
            tentativas++;
            if (tentativas == 3) {
                System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                return;
            }
            System.out.println("Resposta inválida. Tente novamente. Seu cartão vacinal está em dia? (S/N)");
            Cartao = scanner.nextLine();
        }
        if (Cartao.equalsIgnoreCase("N")) {
            porcentagem += 10;
        }

        System.out.println("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)(S/N)");
        String Sintomas = scanner.nextLine().toUpperCase();

        while (!Sintomas.equalsIgnoreCase("S") && !Sintomas.equalsIgnoreCase("N")) {
            tentativas++;
            if (tentativas == 3) {
                System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                return;
            }
            System.out.println("Resposta inválida. Tente novamente. Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)(S/N)");
            Sintomas = scanner.nextLine();
        }
        if (Sintomas.equalsIgnoreCase("S")) {
            porcentagem += 30;
        }

System.out.println("Você teve contato com pessoa infectada nos últimos 14 dias? (S/N)");
String Contato = scanner.nextLine().toUpperCase();
tentativas = 0;
    while (!Contato.equalsIgnoreCase("S") && !Contato.equalsIgnoreCase("N")) {
    tentativas++;
    if (tentativas == 3) {
        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
        return;
    }
    System.out.println("Resposta inválida. Tente novamente. Você teve contato com pessoa infectada nos últimos 14 dias? (S/N)");
    Contato = scanner.nextLine().toUpperCase();
}
if (Contato.equalsIgnoreCase("S")) {
    porcentagem += 30;
}

        System.out.println("Está retornando de viagem realizada no exterior?(S/N)");
        String Viagem = scanner.nextLine().toUpperCase();

        tentativas = 0;
    while (!Viagem.equalsIgnoreCase("S") && !Viagem.equalsIgnoreCase("N")) {
    tentativas++;
    if (tentativas == 3) {
        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
        return;
    }
    System.out.println("Resposta inválida. Tente novamente. Está retornando de viagem realizada no exterior?(S/N)");
    Viagem = scanner.nextLine().toUpperCase();
}
if (Viagem.equalsIgnoreCase("S")) {
    porcentagem += 30;
}

    System.out.println("==========================================================Ficha Geral===================================================");
    System.out.println("Nome:" + Nome);
    System.out.println("========================================================================================================================");
    System.out.println("Idade: " + Idade);
    System.out.println("========================================================================================================================");
    System.out.println("Seu cartão esta em dia: " + Cartao);
    System.out.println("========================================================================================================================");
    System.out.println("Teve sintomas recentemente: " + Sintomas);
    System.out.println("========================================================================================================================");
    System.out.println("Teve Contato com pessoa com sintomas de gripe: " + Sintomas);
    System.out.println("========================================================================================================================");
   if(Viagem.equalsIgnoreCase("S")){
    System.out.println("Esta retordando de viagem recentemente: " + Viagem + ",você ficara em observação por 5 dias ");
    System.out.println("========================================================================================================================");
   }
   else{
    System.out.println("Esta retordando de viagem recentemente: " + Viagem);
    System.out.println("========================================================================================================================");
   }
    System.out.println("A probabilidade de infeccão e: " + porcentagem + ("%"));
    if(porcentagem <= 30)
    {
        System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        System.out.println("========================================================================================================================");
}
 if(porcentagem <= 60){
    System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
    System.out.println("========================================================================================================================");
 }
 if(porcentagem >= 90){
    System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
    System.out.println("========================================================================================================================");
    
 }

scanner.close();
	}
    }
    

