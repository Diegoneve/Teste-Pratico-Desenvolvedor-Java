package com.teste.pratico.beans;

import com.teste.pratico.model.Solicitante;
import com.teste.pratico.service.SolicitanteService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.ManagedBean;

@Controller
@ManagedBean(value = "solicitanteBean")
@SessionScope
@Getter
@Setter
public class SolicitanteBean {

    private String nome;
    private String cadSolicitanteUrl = "/cadSolicitante.xhtml";

    @Autowired
    private SolicitanteService solicitanteService;

    private Solicitante solicitante = new Solicitante();

    public String getCadastroSolicitanteUrl() {
        return this.cadSolicitanteUrl;
    }

    public String getPageUrl() {
        return this.cadSolicitanteUrl;
    }

    public String Salvar() {
        solicitanteService.cadastrarSolicitante(solicitante);
        solicitante = new Solicitante();
        return "cadSolicitante?faces-redirect=true";
    }

//    public void Salvar() {
//        FacesContext.getCurrentInstance().addMessage(null,
//                new FacesMessage(FacesMessage.SEVERITY_INFO,
//                        "Cadastro realizado com sucesso", null));
//    }
}
