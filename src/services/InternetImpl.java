package services;

public class InternetImpl implements Internet {
    private String url;

    // Construtor
    public InternetImpl(String url) {
        this.url = url;
    }

    // Getters e Setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void showTab() {
        System.out.println("Exibindo aba: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void closeTab() {
        System.out.println("Fechando aba.");
    }

    @Override
    public void refreshTab() {
        System.out.println("Atualizando aba.");
    }
}
