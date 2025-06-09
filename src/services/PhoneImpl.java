package services;

public class PhoneImpl implements Phone {
    private String phoneNumber;

    public PhoneImpl(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void call() {
        System.out.println("Ligando para: " + phoneNumber);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void declineCall() {
        System.out.println("Recusando a chamada.");
    }

    @Override
    public void voiceMail() {
        System.out.println("Verificando caixa postal.");
    }
}