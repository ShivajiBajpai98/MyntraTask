package datafile;


import properties.PropertyManager;

public class Locators {
    public static String page_Present_Rel_Xpath;
    public static String search_TextBox_Rel_Xpath;
    public static String search_Button;
    public static String click_Item;
    public static String select_Size;
    public static String add_Cart;
    public static String view_cart;


    public static void locators() {
        page_Present_Rel_Xpath = PropertyManager.getInstance().getPage_Present_Rel_Xpath();
        search_TextBox_Rel_Xpath = PropertyManager.getInstance().getSearch_TextBox_Rel_Xpath();
        search_Button = PropertyManager.getInstance().getSearch_TextBox_Rel_Xpath();
        click_Item = PropertyManager.getInstance().getClick_Item();
        select_Size=PropertyManager.getInstance().getSelect_Size();
        add_Cart=PropertyManager.getInstance().getAdd_Cart();
        view_cart=PropertyManager.getInstance().getView_cart();
        //System.out.println(Locators.bodyLocator_xpath);

    }

    /*public static void main(String[] args)
    {
        Locators.locators();

       System.out.println(Locators.search_Button);
    }*/
}


