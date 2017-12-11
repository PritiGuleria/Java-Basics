package com.priti.VendingMachine;

import java.util.List;

/**
 * Created by prguleri on 11/22/2017.
 */
public class VendingMachineImpl implements VendingMachine {
    private Inventory<Coin> cashInventory = new Inventory<Coin>();
    private  Inventory<Item> itemInventory = new Inventory<Item>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;

    public  VendingMachineImpl(){
        initialize();
    }

    private void initialize(){
        for(Coin c: Coin.values()){
            cashInventory.put(c,5);
        }

        for(Item i: Item.values()){
            itemInventory.put(i,5);
        }
    }






    @Override
    public long selectItemAndGetPrice(Item item) {
        return 0;
    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public List<Coin> refund() {
        return null;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        return null;
    }

    @Override
    public void reset() {

    }
}
