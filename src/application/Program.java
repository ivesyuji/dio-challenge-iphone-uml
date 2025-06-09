package application;

import entities.Iphone;
import services.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {
        Ipod myIpod = new IpodImpl(123);
        Phone myPhone = new PhoneImpl("11999999999");
        Internet myInternet = new InternetImpl("https://www.google.com");

        Iphone myIphone = new Iphone(myIpod, myPhone, myInternet);

        System.out.println("--- Funcionalidades do iPhone ---");
        myIphone.getIpod().play();
        myIphone.getPhone().call();
        myIphone.getInternet().showTab();
        System.out.println("---------------------------------");
        myIphone.operation();
    }
}