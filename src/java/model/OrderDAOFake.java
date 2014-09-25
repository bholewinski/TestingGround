/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bholewinski
 */
public class OrderDAOFake implements IOrderDAO {
    private List<MenuItem> menuItems;
    
    public OrderDAOFake() {
        menuItems = new ArrayList<MenuItem>();
        MenuItem item = new MenuItem("House Salad", 9.95);
        menuItems.add(item);
        item = new MenuItem("Steak", 19.95);
        menuItems.add(item);
    }
    
    @Override
    public List<MenuItem> getCurrentMenuChoice() throws RuntimeException {
        List<MenuItem> items = new ArrayList<MenuItem>();
        return menuItems;
    }
    
    @Override
    public void saveOrder(List<MenuItem> orderList ) {
        //Need to implement
    }
}
