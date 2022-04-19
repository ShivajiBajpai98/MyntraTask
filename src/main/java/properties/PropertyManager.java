package properties;


import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static final Object lock = new Object();
    private static PropertyManager instance;
    //private static String propertyFilePath=System.getProperty("user.dir") + "\\configuration.properties";
    private static String app_url;
    private static String page_Present_Rel_Xpath;
    private static String Search_TextBox_Rel_Xpath;
    private static String first_item;
    private static String search_button;
    private static String click_Item;
    private static String select_Size;
    private static String add_Cart;
    private static String view_cart;


    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            //prop.load(new FileInputStream(propertyFilePath));
            prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }


        //Get properties from configuration.properties
        app_url = prop.getProperty("app_url");
        page_Present_Rel_Xpath = prop.getProperty("page_Present_Rel_Xpath");
        Search_TextBox_Rel_Xpath = prop.getProperty("Search_TextBox_Rel_Xpath");
        search_button = prop.getProperty("Search_button");
        click_Item = prop.getProperty("click_Item");
        select_Size=prop.getProperty("select_Size");
        add_Cart=prop.getProperty("add_Cart");
        view_cart=prop.getProperty("view_cart");

        first_item = prop.getProperty("first_item");


    }

    public String getAppManageURL() {
        return app_url;
    }

    public String getPage_Present_Rel_Xpath() {
        return page_Present_Rel_Xpath;
    }

    public String getSearch_TextBox_Rel_Xpath() {
        return Search_TextBox_Rel_Xpath;
    }

    // private String getSearch_button(){ return search_button;}
    public String getClick_Item() {
        return click_Item;
    }



    public String getSelect_Size(){ return select_Size;}
    public String getAdd_Cart(){return  add_Cart;}
    public String getView_cart(){return view_cart;}

    public String getFirst_item() {
        return first_item;
    }


}