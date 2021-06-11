package br.com.entity.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.entity.Tgmenu;
import br.com.menu.Icon;
import br.com.menu.Menu;

/**
 *
 * @author jose.camilo
 */
//@Stateless
//@Path("menu")
public class MenuFacadeRest extends AbstractFacade<Menu> {

    @PersistenceContext(unitName = "whosp2.0PU")
    private EntityManager em;

    public MenuFacadeRest() {
        super(Menu.class);
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
    public List<Menu> getMenu() {
        List<Tgmenu> tgmenus = em.createQuery("SELECT t FROM Tgmenu t WHERE t.fkmenu is null").getResultList();
        List<Menu> Menu_list = new ArrayList<>();
        //todos os menus
        Menu HeaderMenu = new Menu();
        HeaderMenu.setDisabled(false);
        HeaderMenu.setHeader(true);
        HeaderMenu.setHidden(false);
        HeaderMenu.setHiddenOnCollapse(true);
        HeaderMenu.setTitle("WHOSP .::. Menus");
        Menu_list.add(HeaderMenu);
        for (int x = 0; x < tgmenus.size(); x++) {
            Menu_list.add(getSubItem(tgmenus.get(x)));
        }

        //todos os favoritos
        Menu HeaderMenuFavoritos = new Menu();
        HeaderMenuFavoritos.setDisabled(false);
        HeaderMenuFavoritos.setHeader(true);
        HeaderMenuFavoritos.setHidden(false);
        HeaderMenuFavoritos.setHiddenOnCollapse(true);
        HeaderMenuFavoritos.setTitle("Favoritos");
        Menu_list.add(HeaderMenuFavoritos);
//         List<Tgmenu> tgmenus = em.createQuery("SELECT t FROM Tgmenu t WHERE t.fkmenu is null").getResultList();
//        for (int x = 0; x < tgmenus.size(); x++) {
//            Menu_list.add(getSubItem(tgmenus.get(x)));
//        }

        return Menu_list;
    }

    private Menu getSubItem(Tgmenu tgmenu) {
        Menu menu = new Menu();
        menu.setHeader(false);
        menu.setHref(tgmenu.getRotas().getHref());
        menu.setHiddenOnCollapse(true);
        Icon icon = new Icon();
        icon.setClass(tgmenu.getclass());
        icon.setElement("span");
        menu.setIcon(icon);
        menu.setTitle(tgmenu.getDescricao());

        for (int x = 0; x < tgmenu.getTgmenuList().size(); x++) {
            menu.addChild(getSubItem(tgmenu.getTgmenuList().get(x)));
        }

        if (tgmenu.getAtivo() != 1) {
            menu.setHidden(true);
            menu.setDisabled(true);
        }

        return menu;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
