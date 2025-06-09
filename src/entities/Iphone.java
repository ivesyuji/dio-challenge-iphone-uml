package entities;

import services.Internet;
import services.Ipod;
import services.Phone;

public class Iphone {
    private Ipod ipod;
    private Phone phone;
    private Internet internet;

    // Construtor do iPhone para injetar as implementações
    public Iphone(Ipod ipod, Phone phone, Internet internet) {
        this.ipod = ipod;
        this.phone = phone;
        this.internet = internet;
    }

    // Getters para as funcionalidades
    public Ipod getIpod() {
        return ipod;
    }

    public Phone getPhone() {
        return phone;
    }

    public Internet getInternet() {
        return internet;
    }

    public void operation() {
        System.out.println("Realizando operação geral do iPhone.");
        // Exemplo de uso das funcionalidades
        ipod.play();
        phone.call();
        internet.showTab();
    }
}

