package usuario;

import dispositivo.Iphone;

public class InterfaceUsuario {

    public static void main(String[] args) {
      
    Iphone iphone = new Iphone();

    iphone.atender();
    iphone.ligar();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
    iphone.pausar();
    iphone.selecionarMúsica();
    
    }
}