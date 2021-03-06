package br.com.controlpass.view;

import br.com.controlpass.DAO.ResponsavelDAO;
import br.com.controlpass.DAO.UsuarioDAO;
import br.com.controlpass.exception.BusinessException;
import br.com.controlpass.model.Chamada;
import br.com.controlpass.model.Usuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ResponsavelMB {

    Usuario usuario = new Usuario();
    ResponsavelDAO responsavelDAO = new ResponsavelDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
     
    public void novaSenha() throws BusinessException {
        try {
            usuarioDAO.verificaSenha(usuario);
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                            "Sucesso!", "Senha alterada!"));
        } catch (BusinessException ex) {
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Erro",
                            ex.getMessage()));
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ResponsavelDAO getResponsavelDAO() {
        return responsavelDAO;
    }

    public void setResponsavelDAO(ResponsavelDAO responsavelDAO) {
        this.responsavelDAO = responsavelDAO;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

}
