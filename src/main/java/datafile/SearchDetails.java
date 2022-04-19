package datafile;


import properties.PropertyManager;

public class SearchDetails {
    public static String first_Name;


    public static void searchFirstItemDetails() {
        first_Name = PropertyManager.getInstance().getFirst_item();


    }
}
