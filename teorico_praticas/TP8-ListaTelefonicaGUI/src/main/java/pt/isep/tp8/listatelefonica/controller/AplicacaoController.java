package pt.isep.tp8.listatelefonica.controller;

import pt.isep.tp8.listatelefonica.model.ListaTelefonica;

public class AplicacaoController {
    private ListaTelefonica listaTelefonica;

    public AplicacaoController() {
        listaTelefonica = new ListaTelefonica();
    }

    public String getListaTelefonica() {
        return listaTelefonica.toString();
    }

    public void preencherListaTelefonica() {
        listaTelefonica.prePreencherLista();
    }

    public boolean adicionarContactoTelefonico(String titular, int numero) {
        return listaTelefonica.adicionarContactoTelefonico(titular, numero);
    }
}