package assignment3_MenuSystem;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning Dishes");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon Dishes");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening Dishes");

        MenuComponent allMenus = new Menu("All Menus", "All available menus");

        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes with syrup", 5));
        lunchMenu.add(new MenuItem("Burger", "Juicy burger with fries", 10));
        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with potatoes", 20));

        allMenus.print();
    }
}
