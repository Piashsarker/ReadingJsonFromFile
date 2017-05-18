package com.dcastalia.readingjsonfromfile;

/**
 * Created by piashsarker on 5/18/17.
 */

public class Menu {

    private String menuId;
    private String menuTitle;
    private String menuLogo;
    private String hasCategory;
    private String categoryCount;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuLogo() {
        return menuLogo;
    }

    public void setMenuLogo(String menuLogo) {
        this.menuLogo = menuLogo;
    }

    public String getHasCategory() {
        return hasCategory;
    }

    public void setHasCategory(String hasCategory) {
        this.hasCategory = hasCategory;
    }

    public String getCategoryCount() {
        return categoryCount;
    }

    public void setCategoryCount(String categoryCount) {
        this.categoryCount = categoryCount;
    }


}
