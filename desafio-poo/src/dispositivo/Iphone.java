package dispositivo;

import funções.AparelhoTelefônico;
import funções.Navegador;
import funções.ReprodutorMusical;

public class Iphone implements AparelhoTelefônico, Navegador, ReprodutorMusical {

    public void ligar (){

        System.out.println("Ligar para contato X");
    }

    public void atender (){

        System.out.println("Atender Ligação");
    }

    public void iniciarCorreioVoz (){

        System.out.println("Conferindo mensagens no correio de voz");
    }

    public void exibirPágina (){

        System.out.println("Exibir página web");
        } 
    
        public void adicionarNovaAba (){
    
            System.out.println("Adicionar aba");
        }
        
        public void atualizarPagina (){
    
            System.out.println("Atualizar página");
        }
    
        public void tocar (){

            System.out.println("Tocar música");
           }
        
           public void pausar (){ 
        
            System.out.println("Pausar música");
           }
        
           public void selecionarMúsica (){
        
            System.out.println("Selecionar música");
           }
    }

